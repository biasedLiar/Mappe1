package no.ntnu.eliaseb;

/**
 * The RemoveException is an checked exception that arises if a one tries to remove a Person that is not in the arraylist.
 */
public class RemoveException extends Exception {
    public RemoveException(String message) {
        super("Remove exception. Person could not be removed: " + message);
    }
}
