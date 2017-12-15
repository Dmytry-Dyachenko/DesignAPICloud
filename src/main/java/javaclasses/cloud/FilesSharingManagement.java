package javaclasses.cloud;

import javaclasses.cloud.impl.SecurityToken;
import javaclasses.cloud.impl.valueobject.FileVO;

public interface FilesSharingManagement {

    String generateLinkForShareFile(SecurityToken securityToken, FileVO fileVO) throws LinkGenerationException;

}
