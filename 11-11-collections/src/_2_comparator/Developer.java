package _2_comparator;

public class Developer {
	private int codeLineNumber;

	public Developer(int codeLineNumber) {
		this.codeLineNumber = codeLineNumber;
	}

	public int getCodeLineNumber() {
		return codeLineNumber;
	}

	@Override
	public String toString() {
		return "Developer [codeLineNumber=" + codeLineNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codeLineNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Developer other = (Developer) obj;
		if (codeLineNumber != other.codeLineNumber)
			return false;
		return true;
	}

}
