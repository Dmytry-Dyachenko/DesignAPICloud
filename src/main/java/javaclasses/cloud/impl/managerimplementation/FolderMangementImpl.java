package javaclasses.cloud.impl.managerimplementation;

import javaclasses.cloud.FolderMangement;
import javaclasses.cloud.FolderWorkException;
import javaclasses.cloud.impl.SecurityToken;
import javaclasses.cloud.impl.tinytype.FolderId;
import javaclasses.cloud.impl.valueobject.FolderVO;

import java.io.InputStream;

public class FolderMangementImpl implements FolderMangement {
    @Override
    public void createFolder(SecurityToken securityToken, FolderVO FolderVO) throws FolderWorkException {

    }

    @Override
    public void editFolder(SecurityToken securityToken, FolderId id) throws FolderWorkException {

    }

    @Override
    public InputStream downloadFolder(FolderId id) throws FolderWorkException {
        return null;
    }

    @Override
    public boolean removeFolder(FolderId id) throws FolderWorkException {
        return false;
    }
}
