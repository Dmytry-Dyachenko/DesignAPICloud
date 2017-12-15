package javaclasses.cloud.impl.managerimplementation;

import javaclasses.cloud.FilesSharingManagement;
import javaclasses.cloud.LinkGenerationException;
import javaclasses.cloud.impl.SecurityToken;
import javaclasses.cloud.impl.valueobject.FileVO;

public class FilesSharingManagementImpl implements FilesSharingManagement {
    @Override
    public String generateLinkForShareFile(SecurityToken securityToken, FileVO fileVO) throws LinkGenerationException {
        return null;
    }
}
