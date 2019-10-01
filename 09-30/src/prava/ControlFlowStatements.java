package prava;

public class ControlFlowStatements {

	public static void main(String[] args) {
		label:
		for (int i = 0; i < 10; i++) {
			label1:
				while(true) {
					if (i % 2 == 0) {
						if (i == 6) {
							continue label1;
						}
						System.out.println(i);
				}
			}
		}

	}

}
