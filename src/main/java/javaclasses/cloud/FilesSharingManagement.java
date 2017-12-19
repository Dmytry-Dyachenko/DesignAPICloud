package javaclasses.cloud;

import javaclasses.cloud.impl.SecurityToken;
import javaclasses.cloud.impl.tinytype.FileId;

/**
 * File sharing manager API.
 */
public interface FilesSharingManagement {
    /**
     * Generate a link that another users can use for viewing file.
     *
     * @param securityToken that was given to user in authentication time for using the opportunities of cloud.
     * @param id            of file.
     * @return the link of file.
     * @throws LinkGenerationException when link couldn't be generated.
     */
    String generateLinkForShareFile(SecurityToken securityToken, FileId id) throws LinkGenerationException;

}
