package javaclasses.cloud;


import javaclasses.cloud.impl.tinytype.FileId;
import javaclasses.cloud.impl.valueobject.FileVO;

import java.io.FileNotFoundException;
import java.io.InputStream;

public interface FilesMangement {

    void createFile(InputStream stream, FileVO fileVO) throws FileWorkException;

    void uploadFile(FileVO fileVO) throws FileWorkException;

    void editFile(FileId id) throws FileWorkException;

    InputStream downloadFile(FileId id) throws FileWorkException;

    boolean removeFile(FileId id) throws FileNotFoundException;
}
