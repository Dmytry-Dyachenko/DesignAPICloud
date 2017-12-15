package javaclasses.cloud;


import javaclasses.cloud.impl.valueobject.FileVO;

import java.io.FileNotFoundException;

public interface FilesMangement {

    void createFile(FileVO file) throws FileWorkException;

    void createDirectory(FileVO fileVO) throws FileWorkException;

    void uploadFile(FileVO fileVO) throws FileWorkException;

    void editFile(FileId id) throws FileWorkException;

    void downloadFile(FileId id) throws FileWorkException;

    boolean removeFile(FileId id) throws FileNotFoundException;
}
