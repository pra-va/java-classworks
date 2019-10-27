package lt.pra_va;

import lt.itakademija.exam.IntegerGenerator;

public class MyIntGenerator implements IntegerGenerator {
	private int from;
	private int to;

	public MyIntGenerator(int from, int to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public Integer getNext() {
		if (from <= to) {
			return from++;
		} else {
			return null;
		}
	}

}
