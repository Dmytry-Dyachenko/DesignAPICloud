package javaclasses.cloud;

/**
 * Throws when link couldn't be generated.
 */
public class LinkGenerationException extends Exception {
    public LinkGenerationException(String message) {
        super(message);
    }
}
