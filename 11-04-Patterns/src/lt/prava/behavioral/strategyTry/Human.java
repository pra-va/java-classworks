package lt.prava.behavioral.strategyTry;

public class Human {
	private int sleepLength;
	private int eatTimesPerDay;
	private int exerciseTimesPerWeek;
	private HumanValidationStrategy strategy;

	public Human(HumanValidationStrategy strategy) {
		this.strategy = strategy;
	}

	public void validateHuman() {
		strategy.isValid(this);
	}

	public int getSleepLength() {
		return sleepLength;
	}

	public void setSleepLength(int sleepLength) {
		this.sleepLength = sleepLength;
	}

	public int getEatTimesPerDay() {
		return eatTimesPerDay;
	}

	public void setEatTimesPerDay(int eatTimesPerDay) {
		this.eatTimesPerDay = eatTimesPerDay;
	}

	public int getExerciseTimesPerWeek() {
		return exerciseTimesPerWeek;
	}

	public void setExerciseTimesPerWeek(int exerciseTimesPerWeek) {
		this.exerciseTimesPerWeek = exerciseTimesPerWeek;
	}

}
