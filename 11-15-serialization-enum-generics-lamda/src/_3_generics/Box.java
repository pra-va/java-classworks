package _3_generics;

public class Box<T> {
	private T id;

	public Box(T id) {
		this.id = id;
	}

	public T getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Box [id=" + id + "]";
	}
}
