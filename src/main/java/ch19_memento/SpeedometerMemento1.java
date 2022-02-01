/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package ch19_memento;

public class SpeedometerMemento1 {
    
    private Speedometer1 speedometer;
    
    private int copyOfCurrentSpeed;
    private int copyOfPreviousSpeed;
    
    public SpeedometerMemento1(Speedometer1 speedometer) {
        this.speedometer = speedometer;
        copyOfCurrentSpeed = speedometer.getCurrentSpeed();
        copyOfPreviousSpeed = speedometer.previousSpeed;
    }
    
    public void restoreState() {
        speedometer.setCurrentSpeed(copyOfCurrentSpeed);
        speedometer.previousSpeed = copyOfPreviousSpeed;
    }
    
}
