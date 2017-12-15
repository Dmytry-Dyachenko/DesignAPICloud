package javaclasses.cloud;


import javaclasses.cloud.impl.SecurityToken;
import javaclasses.cloud.impl.tinytype.FileId;
import javaclasses.cloud.impl.valueobject.FileVO;

import java.io.FileNotFoundException;
import java.io.InputStream;

public interface FilesMangement {

    void createFile(SecurityToken securityToken, InputStream stream, FileVO fileVO) throws FileWorkException;

    void uploadFile(SecurityToken securityToken, FileVO fileVO) throws FileWorkException;

    void editFile(SecurityToken securityToken, FileId id) throws FileWorkException;

    InputStream downloadFile(SecurityToken securityToken, FileId id) throws FileWorkException;

    boolean removeFile(SecurityToken securityToken, FileId id) throws FileNotFoundException;
}
