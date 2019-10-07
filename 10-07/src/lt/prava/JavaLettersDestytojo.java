package lt.prava;

public class JavaLettersDestytojo {

	public static void main(String[] args) {
		String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
				+ " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,"
				+ " when an unknown printer took a galley of type and scrambled it to make a type "
				+ "specimen book. It has survived not only five centuries, but also the leap into "
				+ "electronic typesetting, remaining essentially unchanged. It was popularised in "
				+ "the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, "
				+ "and more recently with desktop publishing software like Aldus PageMaker including "
				+ "versions of Lorem Ipsum.";
		buildLettersDictionary(text);

	}

	// ?????????????????????????????????????????????
	private static void buildLettersDictionary(String text) {
		text.toLowerCase();
		int[] chars = new int['z' - 'a' + 1];
		for (int i = 0; i < text.length(); i++) {
			char charValue = text.charAt(i);
			if (charValue >= 'a' && charValue <= 'z') {
				chars[charValue - 'a']++;
			}
		}
		
		for (int i = 0; i < chars.length; i++) {
			System.out.println((char)( i + 'a') + " = " + chars[i]);
		}
		
	}

}
