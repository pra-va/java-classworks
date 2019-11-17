package _3_Comparable;

public class Phone implements Comparable<Phone> {
	private String color;
	private double price;

	public Phone(String color, double price) {
		this.color = color;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Phone [color=" + color + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Phone other = (Phone) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public int compareTo(Phone o) {
		if (this.price > o.price) {
			return -1;
		} else if (this.price < o.price) {
			return 1;
		} else if (this.price == o.price) {
			return 0;
		}
		return 0;
	}
}
