package JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	// Visi testai eina su public ir void. Pavadinimai prasideda su "should".
	@Test
	public void shouldCountSum() { // Kliento riekalavimai!!!!
		Calculator calc = new Calculator();
		assertEquals(4.1, calc.countSum(2.0, 2.0), 0.0); // Paskutinis skaicius 0.0 nurodo skaiciaus tiksluma kuriame
															// tikrinsime.
	}
}
