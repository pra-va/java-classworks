package lt.prava;

public class BMI {
	private double height;
	private double weight;

	public BMI(double height, double weight) {
		if (height > 0.0 && weight > 0.0) {
			this.height = height;
			this.weight = weight;
		} else {
			// Exception
		}
	}

	public String printBMI() {
		Double result = weight / Math.pow(height, 2);
		return result.toString();
	}

}
