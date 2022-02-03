package ch01_introduction;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class TurboEngineTest {
    @Test
    void newTurboEngineHasCorrectSize() {
        // arrange
        int size = 1000;

        // act
        Engine engine = new TurboEngine(size);

        // assert
        assertThat(engine.getSize()).isEqualTo(size);

        // assert (junit style)
        // assertEquals(size, engine.getSize());
    }

    @Test
    void newTurboEngineIsTurbo() {
        // arrange

        // act
        Engine engine = new TurboEngine(1000);

        // assert
        assertThat(engine.isTurbo()).isTrue();

        // assert (junit style)
        // assertTrue(engine.isTurbo());
    }

    @Test
    void TurboEngineHasToStringWithClassnameAndSize() {
        // arrange
        String className = TurboEngine.class.getSimpleName();
        int size = 1000;
        String sizeString = Integer.toString(size);
        Engine engine = new TurboEngine(size);

        // act
        String engineString = engine.toString();

        // assert
        assertThat(engineString)
                .contains(className)
                .contains(sizeString);

        // assert (junit style)
        // assertTrue(engineString.contains(className));
        // assertTrue(engineString.contains(sizeString));
    }
}