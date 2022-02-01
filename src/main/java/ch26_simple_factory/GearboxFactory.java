/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package ch26_simple_factory;

public class GearboxFactory {
    
    public enum Type {AUTOMATIC, MANUAL};
    
    public static Gearbox create(Type type) {
        if (type == Type.AUTOMATIC) {
            return new AutomaticGearbox();
        
        } else {
            return new ManualGearbox();
        }
    }
    
}
