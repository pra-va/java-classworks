package prava;

public class ForStatement {

	public static void main(String[] args) {
		checkFor();
		
		
	}

	private static void checkFor() {
//		for(int i=0; i<=10; i++) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println();
//		for (int i=0; i<=10; ) {
//			System.out.print(i + " ");
//			i++;
//		}
//		
//		int i = 0;
//		System.out.println();
//		for (; i<=10;) {
//			System.out.print(i + " ");
//			i++;
//		}
//		
//		System.out.println();
//		int j = 0;
//		for (; ;) {
//			if (j<=10) {
//			System.out.print(j + " ");
//			j++;
//			} else {
//				break;
//			}
//			
//		}
//		
//		System.out.println();
//		for (int x=0, z=10; x<z; x++, z--) {
//			System.out.println("x: " + x + ", z: " + z);
//		}
//		
//		
//		String text = "Text for cycle...";
//		for (int i = 0; i < text.length(); i++) {
//			System.out.print(text.charAt(i) + " ");
//		}
//		
		System.out.println();
		int[][] numberArray = {{1,2,3,4,5},{1,2,3,4,5}};
		for (int v = 0; v < numberArray.length; v++) {
			for (int c = 0; c < numberArray[v].length; c++) {
				System.out.print(numberArray[v][c] + " ");
			}
		}
		
		
	}

}
