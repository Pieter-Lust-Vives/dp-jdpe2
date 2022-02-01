/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package ch20_observer;

import java.util.Observable;
import java.util.Observer;

public class SpeedMonitor1 implements Observer {
    
    public static final int SPEED_TO_ALERT = 70;
    
    public void update(Observable obs, Object obj) {
        Speedometer1 speedo = (Speedometer1) obs;
        if (speedo.getCurrentSpeed() > SPEED_TO_ALERT) {
            System.out.println("** ALERT ** Driving too fast! (" +
                    speedo.getCurrentSpeed() + ")");
        
        } else {
            System.out.println("... nice and steady ... (" +
                    speedo.getCurrentSpeed() + ")");
        }
    }
    
}
