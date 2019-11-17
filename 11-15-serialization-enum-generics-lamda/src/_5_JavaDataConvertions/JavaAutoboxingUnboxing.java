package _5_JavaDataConvertions;

public class JavaAutoboxingUnboxing {

	public static void main(String[] args) {
		// Autoboxing
		Integer integerObject = 7;
		System.out.println(integerObject);
		Character charObject = 'a';
		System.out.println(charObject);

		// Unboxing
		int intPrimitive = integerObject;
		System.out.println(intPrimitive);

		// Expressions
		Integer integerObject1 = 7;
		Integer integerObject2 = 7;
		System.out.println(integerObject1 + integerObject2);

		// Method level
		Integer integerObject3 = 7;
		method(integerObject);

	}

	private static void method(int integerObject) {

	}

}
