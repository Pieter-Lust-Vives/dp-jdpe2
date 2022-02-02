package ch22_strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrategyTest {
    @Test
    void NewStrategyIsCalled() {
        // arrange
        SportGearboxStrategy newStrategy = mock(SportGearboxStrategy.class);
        AbstractCar myCar = new Sport(new StandardEngine(2000));
        myCar.setGearboxStrategy(new SportGearboxStrategy());

        // act
        myCar.setSpeed(20);

        // assert
        verify(newStrategy).ensureCorrectGear(any(Engine.class), anyInt());
    }
}
