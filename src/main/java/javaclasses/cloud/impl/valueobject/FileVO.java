package javaclasses.cloud.impl.valueobject;

import javaclasses.cloud.impl.FileType;
import javaclasses.cloud.impl.tinytype.FileId;

public class FileVO {
    private FileId id;
    private String fileName;
    private FileType type;

    public FileVO(FileId id, String fileName, FileType type) {
        this.id = id;
        this.fileName = fileName;
        this.type = type;
    }
}
