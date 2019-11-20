package lt.pra_va;

import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

public class FilteredGenerator implements IntegerGenerator {
	private IntegerGenerator integerGenerator;
	private NumberFilter filter;

	public FilteredGenerator(IntegerGenerator integerGenerator, NumberFilter filter) {
		this.integerGenerator = integerGenerator;
		this.filter = filter;
	}

	@Override
	public Integer getNext() {
		Integer numberInteger = this.integerGenerator.getNext();
		if (numberInteger == null) {
			return null;
		}
		while (!this.filter.accept(numberInteger)) {
			numberInteger = this.integerGenerator.getNext();
		}
		System.out.println(numberInteger);
		return numberInteger;
	}

}
