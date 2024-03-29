package another_example;

import java.util.ArrayList;

public class Gearbox {
	private ArrayList<Gear> gears;
	private int maxGears;
	private int currentGear;
	private boolean clutchIsIn;

	public Gearbox(int maxGears) {
		this.maxGears = maxGears;
		this.gears = new ArrayList<>();
		Gear neutral = new Gear(0, 0.0);
	}

	public void operateClutch(boolean in) {
		this.clutchIsIn = true;
	}

	public void addGear(int number, double ratio) {
		if (number > 0 && number <= maxGears) {
			this.gears.add(new Gear(number, ratio));
		}
	}

	public void changeGear(int newGear) {
		if ((newGear >= 0 && newGear < this.gears.size()) && this.clutchIsIn) {
			this.currentGear = newGear;
			System.out.println("Gear " + newGear + " selected.");
		} else {
			System.out.println("Grind!");
			this.currentGear = 0;
		}
	}

	public double wheelSpeed(int revs) {
		if (clutchIsIn) {
			System.out.println("Scream!!");
			return 0.0;
		}
		return revs * gears.get(currentGear).gearRatio;
	}

	public class Gear {
		private int gearNumber;
		private double gearRatio;

		public Gear(int gearNumber, double gearRatio) {
			this.gearNumber = gearNumber;
			this.gearRatio = gearRatio;
		}

		public double driveSpeed(int revs) {
			return revs * this.gearRatio;
		}
	}

}
