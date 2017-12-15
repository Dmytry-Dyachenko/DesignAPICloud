package javaclasses.cloud.impl.managerimplementation;

import javaclasses.cloud.FileWorkException;
import javaclasses.cloud.FilesManagement;
import javaclasses.cloud.impl.SecurityToken;
import javaclasses.cloud.impl.tinytype.FileId;
import javaclasses.cloud.impl.valueobject.FileVO;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileManagementImpl implements FilesManagement {
    @Override
    public void createFile(SecurityToken securityToken, InputStream stream, FileVO fileVO) throws FileWorkException {

    }

    @Override
    public void uploadFile(SecurityToken securityToken, FileVO fileVO) throws FileWorkException {

    }

    @Override
    public void editFile(SecurityToken securityToken, FileId id) throws FileWorkException {

    }

    @Override
    public InputStream downloadFile(SecurityToken securityToken, FileId id) throws FileWorkException {
        return null;
    }

    @Override
    public boolean removeFile(SecurityToken securityToken, FileId id) throws FileNotFoundException {
        return false;
    }
}
