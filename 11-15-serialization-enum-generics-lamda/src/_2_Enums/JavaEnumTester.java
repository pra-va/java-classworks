package _2_Enums;

public class JavaEnumTester {

	public static void main(String[] args) {
		Season season = Season.SUMMER;

		switch (season) {
		case SPRING:
			System.out.println("Spring");
			break;
		case SUMMER:
			System.out.println("Summer (" + season.getTranslation() + ")...");
			break;
		case WINTER:
			System.out.println("Winter");
			break;
		default:
			System.out.println("...");
		}
		System.out.println(season.name());

	}

}
