package lt.pra_va;

import lt.itakademija.exam.Bank;
import lt.itakademija.exam.CurrencyConverter;
import lt.itakademija.exam.CurrencyRatesProvider;
import lt.itakademija.exam.test.BaseTest;

public class ExamMain extends BaseTest {

	@Override
	protected Bank createBank(CurrencyConverter arg0) {
		return new BankExamSolution(arg0);
	}

	@Override
	protected CurrencyConverter createCurrencyConverter(CurrencyRatesProvider arg0) {
		return new CurrencyConverterExam(arg0);
	}

}
