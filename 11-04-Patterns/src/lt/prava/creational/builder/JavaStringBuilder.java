package lt.prava.creational.builder;

public class JavaStringBuilder {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("Tomas");
		builder.append('a');
		builder.append(12);
		System.out.println(builder);

	}

}
