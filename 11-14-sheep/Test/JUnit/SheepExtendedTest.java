package JUnit;


import lt.pra_va.SheepExtended;
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