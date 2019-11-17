package lt.prava.behavioral.strategyTry;

public class HumanValidationStrategy extends ValidationStrategy {

	@Override
	public void isValid(Human human) {
		if (human.getSleepLength() > 8) {
			System.out.println("Go to sleep early.");
		}

		if (human.getEatTimesPerDay() > 3) {
			if (human.getExerciseTimesPerWeek() > 3) {
				System.out.println("You are exercising enough...");
			} else {
				System.out.println("You should exercise more...");
			}
		}
	}

}
