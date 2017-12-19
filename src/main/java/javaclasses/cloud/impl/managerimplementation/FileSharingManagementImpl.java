package javaclasses.cloud.impl.managerimplementation;

import javaclasses.cloud.FilesSharingManagement;
import javaclasses.cloud.LinkGenerationException;
import javaclasses.cloud.impl.SecurityToken;
import javaclasses.cloud.impl.tinytype.FileId;

public class FileSharingManagementImpl implements FilesSharingManagement {

    @Override
    public String generateLinkForShareFile(SecurityToken securityToken, FileId id) throws LinkGenerationException {
        return null;
    }
}
