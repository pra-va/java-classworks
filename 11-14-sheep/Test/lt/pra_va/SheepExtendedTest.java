package lt.pra_va;



import lt.vtvpmc.sheep.SheepColor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SheepExtendedTest {

    @Test
    void shouldReturnSheepNameCorrectly() {
        SheepExtended sheep = new SheepExtended(SheepColor.BLACK);
        assertEquals("Jack", sheep.getName());

    }
}