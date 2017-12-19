package javaclasses.cloud;

/**
 * Throws in case of unsuccessful work with file, for example: creation, edition etc.
 */
public class FileWorkException extends Exception {

    public FileWorkException(String message) {
        super(message);
    }
}
