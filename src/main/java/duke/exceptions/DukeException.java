package duke.exceptions;

/**
 * throws exception specifically to duke.
 */
public class DukeException extends Exception {

    public DukeException(String message) {
        super(message);
    }
}