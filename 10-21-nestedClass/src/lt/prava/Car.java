package lt.prava;

public class Car {
	private String model;
	private int id;
	private static int cow;

	public Car(String model, int id) {
		this.model = model;
		this.id = id;
		start();

	}

	// Inner non static class bellow
	private class Motor {
		public void startMotor() {
			System.out.println("Motor is started.");
		}
	}

	// Inner static class bellow
	public static class Battery {
		public void charge() {
			System.out.println("Battery is charging..." + cow);
		}
	}

	public String getModel() {
		return model;
	}

	public int getId() {
		return id;
	}

	public void start() {
		Motor motor = new Motor();
		motor.startMotor();
		System.out.println("The car with ID " + this.id + " vrum vrum.");
		class SomeClass {
			public void someMethod() {
				// TODO
			}
		}

		SomeClass newClass = new SomeClass();
		newClass.someMethod();
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", id=" + id + "]";
	}

}
