package _5_io;

public class JavaScanner {
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		String stringData = input.next();
//		System.out.println(stringData.length());

		ReadFileWithScanner readFile = new ReadFileWithScanner("labas.txt");

		System.out.println(readFile.getFileLine());
		System.out.println(readFile.getFileLine());
		System.out.println(readFile.getFileLine());
		System.out.println(readFile.getFileLine());
	}
}