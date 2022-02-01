/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package ch25_null_object;

public class BrakeFluidLight implements WarningLight {
    
    private boolean on;

    public void turnOn() {
        on = true;
        System.out.println("Brake fluid light ON");
    }

    public void turnOff() {
        on = false;
        System.out.println("Brake fluid light OFF");
    }
    
    public boolean isOn() {
        return on;
    }
    
}
