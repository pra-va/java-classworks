package _2_Enums;

public enum Season {
	SPRING("Pavasaris"), SUMMER("Vasara"), AUTUMN("Ruduo"), WINTER("Ziema");

	private String translation;

	private Season(String translation) {
		this.translation = translation;
	}

	public String getTranslation() {
		return translation;
	}

}
