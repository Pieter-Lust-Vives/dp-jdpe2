package ch01_introduction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StandardEngineTest {
    @Test
    void newStandardEngineHasCorrectSize() {
        // arrange
        int size = 1000;

        // act
        Engine engine = new StandardEngine(size);

        // assert
        assertEquals(size, engine.getSize());
    }

    @Test
    void newStandardEngineIsNotTurbo() {
        // arrange

        // act
        Engine engine = new StandardEngine(1000);

        // assert
        assertFalse(engine.isTurbo());
    }

    @Test
    void standardEngineHasToStringWithClassnameAndSize() {
        // arrange
        String className = StandardEngine.class.getSimpleName();
        int size = 1000;
        String sizeString = Integer.toString(size);
        Engine engine = new StandardEngine(size);

        // act
        String engineString = engine.toString();

        // assert
        assertTrue(engineString.contains(className));
        assertTrue(engineString.contains(sizeString));
    }
}