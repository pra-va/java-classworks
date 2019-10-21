package geometric_object;

public class ResizeableCircle extends Circle implements Resizeable {

	public ResizeableCircle(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void resize(int percent) {
		super.setRadius(getRadius() * percent);

	}

}
