package lt.prava;

public class Administrator {
	public static void main(String[] args) {
		Human humanOne = new Human(1.85, 90.2, "Tomas");
		Human humanTwo = new Human(1.81, 77.2, "Pranas");
		BMI bmiOne = new BMI(humanOne.getHeight(), humanOne.getWeight());
		BMI bmiTwo = new BMI(humanTwo.getHeight(), humanTwo.getWeight());

		SaveBmi saveData = new SaveBmi();
		saveData.addBmi(humanOne.getName(), bmiOne.printBMI());
		saveData.addBmi(humanTwo.getName(), bmiTwo.printBMI());

		saveData.printData();
		saveData.printUserBmi("Pranas");
	}
}
