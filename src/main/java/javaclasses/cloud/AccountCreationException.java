package javaclasses.cloud;

/**
 * Throws in case of unsuccessful account creation.
 */
public class AccountCreationException extends Exception {

    public AccountCreationException(String message) {
        super(message);
    }
}
