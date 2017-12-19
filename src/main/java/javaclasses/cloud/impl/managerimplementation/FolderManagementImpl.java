package javaclasses.cloud.impl.managerimplementation;

import javaclasses.cloud.FolderManagement;
import javaclasses.cloud.FolderWorkException;
import javaclasses.cloud.impl.SecurityToken;
import javaclasses.cloud.impl.tinytype.FolderId;
import javaclasses.cloud.impl.valueobject.FolderVO;

import java.io.InputStream;

public class FolderManagementImpl implements FolderManagement {
    @Override
    public void createFolder(SecurityToken securityToken, FolderVO FolderVO) throws FolderWorkException {

    }

    @Override
    public void editFolder(SecurityToken securityToken, FolderId id) throws FolderWorkException {

    }

    @Override
    public InputStream downloadFolder(SecurityToken securityToken, FolderId id) throws FolderWorkException {
        return null;
    }

    @Override
    public boolean removeFolder(SecurityToken securityToken, FolderId id) throws FolderWorkException {
        return false;
    }
}
