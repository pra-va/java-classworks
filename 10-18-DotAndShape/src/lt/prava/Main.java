package lt.prava;

/**
 * Main class for point and circle. There are two ways to initialize program: 1)
 * create Circle and Point objects. Create Controller object and insert Circle
 * and Point objects as parameters; 2) create Controller object with circle and
 * point properties (parameters; not objects).
 * 
 * @author pra-va
 *
 */
public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller(3, 2, 2, 0, 4);
		controller.moveUp();
		controller.moveRight();
		controller.moveRight();
		controller.moveRight();
		controller.moveRight();
		controller.moveRight();
		controller.moveDown();
		controller.moveDown();
		controller.moveDown();
		controller.moveDown();
		controller.moveDown();
		controller.moveDown();
		controller.moveDown();
		controller.moveLeft();
		controller.moveLeft();
		controller.moveLeft();
		controller.moveUp();
	}
}
