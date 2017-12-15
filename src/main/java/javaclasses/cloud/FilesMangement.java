package javaclasses.cloud;


import java.io.FileNotFoundException;

public interface FilesMangement {
    FileVO createFile(File file) throws FileWorkException;

    FileVO uploadFile(FileVO fileVO) throws FileWorkException;

    FileVO editFile(File file) throws FileWorkException;

    FileVO downloadFile(FileVO fileVO) throws FileWorkException;

    boolean removeFile(FileId id) throws FileNotFoundException;
}
