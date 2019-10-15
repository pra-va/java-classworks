package lt.prava;

// Parduotuve > prekes > kainos > akcizus turi arba ne. Realizuoti prekes partuotuveje pagal kainas su akcizu.
// Degtine, bananas, knyga, cigarete.

public class Runner {

	public static void main(String[] args) {

		Student one = new OneExamDebtStudent("Petras", 21);
		Student two = new OneExamDebtStudent("Prans", 22);
		Student three = new TwoNoDebtStudent("Gintare", 19);
		Student four = new ThreeWorksStudent("Agne", 25, true);
		Student five = new ThreeWorksStudent("Deividas", 18, false);
		Student six = new ThreeWorksStudent("Sarunas", 13, true);
		Student seven = new ThreeWorksStudent("Jonas", 18, false);

		Student[] students = { one, two, three, four, five, six, seven }; // isDebt == true; isWork == true ---
																			// braukiame
		Student[] dropOuts = new Student[students.length];

		int counter = 0;
		for (int i = 0; i < students.length; i++) {
			if (!students[i].isPassedExams()) {
				dropOuts[counter] = students[i];
				counter++;
			} else if (students[i].getClass().equals(ThreeWorksStudent.class)) {
				dropOuts[counter] = students[i];
				counter++;
			} else if (!students[i].isPassedExams() && students[i].getClass().equals(ThreeWorksStudent.class)) {
				dropOuts[counter] = students[i];
				counter++;
			}
		}

		for (int i = 0; i < dropOuts.length; i++) {
			if (dropOuts[i] != null) {
				System.out.println(dropOuts[i].toString());
			}
		}

	}

}
