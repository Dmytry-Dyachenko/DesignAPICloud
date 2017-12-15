package javaclasses.cloud.impl.valueobject;

import javaclasses.cloud.impl.tinytype.FileId;

import java.io.File;

public class FileVO {
    private FileId id;
    private String fileName;
    private File file;

    public FileVO(FileId id, String fileName, File file) {
        this.id = id;
        this.fileName = fileName;
        this.file = file;
    }
}
