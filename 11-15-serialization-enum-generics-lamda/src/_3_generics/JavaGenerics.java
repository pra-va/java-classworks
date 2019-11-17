package _3_generics;

public class JavaGenerics {

	public static void main(String[] args) {
		BoxOne box1 = new BoxOne(1);
		System.out.println(box1);
		BoxTwo box2 = new BoxTwo("1");
		System.out.println(box2);
		Box box3 = new Box(1.0);
		System.out.println(box3);
		Box box4 = new Box(box1);
		System.out.println(box4);
	}

}
