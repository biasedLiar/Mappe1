package no.ntnu.eliaseb;
public class RemoveException extends Exception {
    public RemoveException(String message) {
        super("Remove exception. Person could not be removed: " + message);
    }
}
