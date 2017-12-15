package javaclasses.cloud;

import javaclasses.cloud.impl.SecurityToken;
import javaclasses.cloud.impl.tinytype.FileId;

public interface FilesSharingManagement {

    String generateLinkForShareFile(SecurityToken securityToken, FileId id) throws LinkGenerationException;

}
