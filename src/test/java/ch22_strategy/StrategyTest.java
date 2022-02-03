package ch22_strategy;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;


class StrategyTest {
    @Test
    void NewStrategyIsCalled() {
        // arrange
        Engine engine = new StandardEngine(2000);
        AbstractCar car = new Sport(engine);
        SportGearboxStrategy newStrategy = mock(SportGearboxStrategy.class);
        car.setGearboxStrategy(newStrategy);
        int speed = 20;

        // act
        car.setSpeed(speed);

        // assert
        verify(newStrategy).ensureCorrectGear(engine, speed);
    }
}
