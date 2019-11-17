import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import lt.itakademija.exam.Exercises;
import lt.pra_va.MySolutions;

public class MySolutionsTest {
	private static final Logger logger = Logger.getLogger(MySolutionsTest.class);

	@Test
	public void shouldReturnTrueIfSameObjectIsPassed() {
		MySolutions solution = new MySolutions();
		Exercises exercises = solution.createExercises();
		logger.error("Debugging");
		assertEquals(false, exercises.isSameObject(solution, exercises));
	}
}
