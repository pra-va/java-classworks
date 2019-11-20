package lt.pra_va;

import lt.itakademija.exam.IntegerGenerator;

public class IntegerGeneratorImplementation implements IntegerGenerator {
	private int start;
	private int end;
	private int current;

	public IntegerGeneratorImplementation(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public Integer getNext() {
		if (current < end) {
			return ++current;
		} else {
			return null;
		}
	}

}
