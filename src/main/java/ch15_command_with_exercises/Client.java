/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package ch15_command_with_exercises;

public class Client {
    
    public static void main(String[] args) {
        // Create a radio and its up/down command objects
        Radio radio = new Radio();
        radio.on();
        Command volumeUpCommand = new VolumeUpCommand(radio);
        Command volumeDownCommand = new VolumeDownCommand(radio);

        // Create an electric window and its up/down command objects
        ElectricWindow window = new ElectricWindow();
        Command windowUpCommand = new WindowUpCommand(window);
        Command windowDownCommand = new WindowDownCommand(window);

        // Create a fan and its up/down command objects
        Fan fan = new Fan();
        Command fanUpCommand = new FanUpCommand(fan);
        Command fanDownCommand = new FanDownCommand(fan);

        // Create a speech recogniser object
        SpeechRecogniser speechRecogniser = new SpeechRecogniser();

        // Speech control of the radio
        speechRecogniser.setCommands(volumeUpCommand, volumeDownCommand);
        System.out.println("Speech recognition controlling the radio");
        speechRecogniser.hearUpSpoken();
        speechRecogniser.hearUpSpoken();
        speechRecogniser.hearUpSpoken();
        speechRecogniser.hearDownSpoken();

        // Speech control of the window
        speechRecogniser.setCommands(windowUpCommand, windowDownCommand);
        System.out.println("Speech recognition will now control the window");
        speechRecogniser.hearDownSpoken();
        speechRecogniser.hearUpSpoken();

        // Speech control of the fan
        speechRecogniser.setCommands(fanUpCommand, fanDownCommand);
        speechRecogniser.hearUpSpoken();
        speechRecogniser.hearDownSpoken();
    }
    
}
