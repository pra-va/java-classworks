package lt.prava;

public class Try {
	public static void main(String[] args) {
		String text = "abc";
		byte[] bytes = text.getBytes();
		StringBuilder binary = new StringBuilder();
		for (byte b : bytes) {
			int val = b;
			for (int i = 0; i < 8; i++) {
				binary.append((val & 128) == 0 ? 0 : 1);
				System.out.println(val & 128);
				val <<= 1;
			}
			binary.append(' ');
		}
		System.out.println("'" + text + "' to binary: " + binary);
	}
}
