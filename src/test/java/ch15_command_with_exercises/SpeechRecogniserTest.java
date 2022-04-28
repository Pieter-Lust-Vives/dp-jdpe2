package ch15_command_with_exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

class SpeechRecogniserTest {
    @Test
    void NewSpeechRecogniserCanHearUpSpokenWithoutNullPointerException() {
        // arrange
        SpeechRecogniser sr = new SpeechRecogniser();

        // act and assert
        assertThatNoException().isThrownBy(() -> sr.hearUpSpoken());
    }

    @Test
    void NewSpeechRecogniserCanHearDownSpokenWithoutNullPointerException() {
        // arrange
        SpeechRecogniser sr = new SpeechRecogniser();

        // act and assert
        assertThatNoException().isThrownBy(() -> sr.hearDownSpoken());
    }

    @Test
    void NewUpCommandIsTriggeredByHearUpSpoken() {
        // arrange
        SpeechRecogniser sr = new SpeechRecogniser();
        Command upcom = mock(WindowUpCommand.class);
        sr.setCommands(upcom, new NullCommand());

        // act
        sr.hearUpSpoken();

        // assert
        verify(upcom).execute();
    }

    @Test
    void NewDownCommandIsTriggeredByHearDownSpoken() {
        // arrange
        SpeechRecogniser sr = new SpeechRecogniser();
        Command downcom = mock(WindowDownCommand.class);
        sr.setCommands(new NullCommand(), downcom);

        // act
        sr.hearDownSpoken();

        // assert
        verify(downcom).execute();
    }

}