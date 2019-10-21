package geometric_object;

public class Main {

	public static void main(String[] args) {
		ResizeableCircle circle = new ResizeableCircle(10);
		System.out.println(circle.getArea());
		System.out.println(circle.getPerimeter());
		circle.resize(2);
		System.out.println(circle.getArea());
		System.out.println(circle.getPerimeter());

	}

}

// galime atsisusti pica ir telefona. turi pristatymo kaina. jei uzsakome tel uz didesne kaina siuntimas nemokamas jei siunciame pica pristatymas mokamas