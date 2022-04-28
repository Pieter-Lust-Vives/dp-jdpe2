package ch15_command_with_exercises;

/**
 * NullCommand: lege Command-klasse.
 * De methodes execute() en undo() hebben dus geen implementatie.
 */

public class NullCommand implements Command {

    @Override
    public void execute() {
        // opzettelijk geen implementatie
    }

}
