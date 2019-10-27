package lt.pra_va;

import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

public class MyFilteredIntGenerator implements IntegerGenerator {

	private IntegerGenerator integerGenerator;
	private NumberFilter numberFilter;

	public MyFilteredIntGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
		this.integerGenerator = integerGenerator;
		this.numberFilter = numberFilter;
	}

	@Override
	public Integer getNext() {
		while (true) {
			Integer generatedNumber = this.integerGenerator.getNext();
			if (generatedNumber == null) {
				return null;
			} else if (this.numberFilter.accept(generatedNumber)) {
				return generatedNumber;
			}
		}
	}

}
