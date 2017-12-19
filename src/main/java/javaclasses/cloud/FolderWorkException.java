package javaclasses.cloud;

/**
 * Throws in case of unsuccessful work with folder, for example: creation, edition etc.
 */
public class FolderWorkException extends Exception {
    public FolderWorkException(String message) {
        super(message);
    }
}
