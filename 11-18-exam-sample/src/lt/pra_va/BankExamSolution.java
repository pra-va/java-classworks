package lt.pra_va;

import java.util.ArrayList;
import java.util.List;

import lt.itakademija.exam.Account;
import lt.itakademija.exam.AccountCreateException;
import lt.itakademija.exam.Bank;
import lt.itakademija.exam.Currency;
import lt.itakademija.exam.CurrencyConverter;
import lt.itakademija.exam.Customer;
import lt.itakademija.exam.CustomerCreateException;
import lt.itakademija.exam.InsufficientFundsException;
import lt.itakademija.exam.Money;
import lt.itakademija.exam.Operation;
import lt.itakademija.exam.PersonCode;
import lt.itakademija.exam.PersonName;
import lt.itakademija.exam.SequenceGenerator;

public class BankExamSolution implements Bank {
	private SequenceGenerator customerIdGeneratorGenerator = new SequenceGenerator();
	private SequenceGenerator accountIdGenerator = new SequenceGenerator();
	private SequenceGenerator orderIdGenerator = new SequenceGenerator();
	private List<Customer> customers = new ArrayList<Customer>();
	private CurrencyConverter currencyConverter;

	public BankExamSolution(CurrencyConverter currencyConverter) {
		this.currencyConverter = currencyConverter;
	}

	@Override
	public Account createAccount(Customer arg0, Currency arg1) {
		if (arg0 == null || arg1 == null) {
			throw new NullPointerException();
		}

		if (!customers.contains(arg0)) {
			throw new AccountCreateException("Customer does not exist");
		}

		Account account = new Account(accountIdGenerator.getNext(), arg0, arg1, new Money(0.0));
		arg0.addAccount(account);
		return account;
	}

	@Override
	public Customer createCustomer(PersonCode arg0, PersonName arg1) {
		if (arg0 == null || arg1 == null) {
			throw new NullPointerException("Can not create custumer with parameter NULL");
		}

		boolean hasSamePersonCode = false;
		for (Customer customer : this.customers) {
			if (customer.getPersonCode().equals(arg0)) {
				hasSamePersonCode = true;
			}
		}

		if (hasSamePersonCode) {
			throw new CustomerCreateException("Person with such person code already exists.");
		}

		Customer customer = new Customer(this.customerIdGeneratorGenerator.getNext(), arg0, arg1);
		customers.add(customer);
		return customer;
	}

	@Override
	public Money getBalance(Currency arg0) {
		Money bankBalanceMoney = new Money(0.0);
		for (Customer customer : customers) {
			for (Account account : customer.getAccounts()) {
				if (account.getCurrency().equals(arg0)) {
					bankBalanceMoney = bankBalanceMoney.add(account.getBalance());
				} else {
					bankBalanceMoney = bankBalanceMoney
							.add(this.currencyConverter.convert(account.getCurrency(), arg0, account.getBalance()));
				}
			}
		}
		return bankBalanceMoney;
	}

	@Override
	public Operation transferMoney(Account debitAccount, Account creditAccount, Money debitAmount) {
		if (debitAccount.getBalance().isLessThan(debitAmount)) {
			throw new InsufficientFundsException("Can not send more money than in the debit account.");
		}

		debitAccount.setBalance(debitAccount.getBalance().substract(debitAmount));
		creditAccount.setBalance(creditAccount.getBalance()
				.add(currencyConverter.convert(debitAccount.getCurrency(), creditAccount.getCurrency(), debitAmount)));

		return new Operation(orderIdGenerator.getNext(), debitAccount, creditAccount, debitAmount);
	}

}
