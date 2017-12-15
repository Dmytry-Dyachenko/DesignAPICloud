package javaclasses.cloud;


import javaclasses.cloud.impl.SecurityToken;
import javaclasses.cloud.impl.tinytype.FolderId;
import javaclasses.cloud.impl.valueobject.FolderVO;

import java.io.InputStream;

public interface FolderMangement {
    void createFolder(SecurityToken securityToken, FolderVO FolderVO) throws FolderWorkException;

    void editFolder(SecurityToken securityToken, FolderId id) throws FolderWorkException;

    InputStream downloadFolder(FolderId id) throws FolderWorkException;

    boolean removeFolder(FolderId id) throws FolderWorkException;
}

