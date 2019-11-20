package lt.pra_va;

import lt.itakademija.exam.Currency;
import lt.itakademija.exam.CurrencyConversionException;
import lt.itakademija.exam.CurrencyConverter;
import lt.itakademija.exam.CurrencyRatesProvider;
import lt.itakademija.exam.Money;

public class CurrencyConverterExam implements CurrencyConverter {
	private CurrencyRatesProvider currencyRatesProvider;

	public CurrencyConverterExam(CurrencyRatesProvider currencyRatesProvider) {
		this.currencyRatesProvider = currencyRatesProvider;
	}

	@Override
	public Money convert(Currency arg0, Currency arg1, Money arg2) {
		Money rateMoney = currencyRatesProvider.getRate(arg0, arg1);
		if (rateMoney == null) {
			throw new CurrencyConversionException("Can not convert this combination.");
		}
		System.out.println(rateMoney);
		return arg2.multiply(rateMoney);
	}

}
