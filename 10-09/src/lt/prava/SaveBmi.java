package lt.prava;

import java.util.Arrays;

// Saugo varda ir bmi.
// Pagal varda galima grazinti bmi, arba visa sarasa
public class SaveBmi {
	private String[][] data; // [[Name][BMI]]

	public SaveBmi() {
		this.data = new String[0][2];
	}

	public void addBmi(String name, String bmi) {
		String[][] newArray = new String[data.length + 1][2];
		for (int i = 0; i < newArray.length - 1; i++) {
			for (int j = 0; j < 2; j++) {
				newArray[i][j] = data[i][j];
			}
		}
		newArray[newArray.length - 1][0] = name;
		newArray[newArray.length - 1][1] = bmi;
		data = newArray;
	}

	public void printData() {
		for (int i = 0; i < data.length; i++) {
			System.out.println(Arrays.toString(data[i]));
		}
	}

	public void printUserBmi(String name) {
		for (int i = 0; i < data.length; i++) {
			if (data[i][0].equals(name)) {
				System.out.println(Arrays.toString(data[i]));
				return;
			}
		}
		System.out.println("There is no name " + name + " in database.");
	}

}
