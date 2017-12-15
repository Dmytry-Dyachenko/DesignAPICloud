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

    public FileId getId() {
        return id;
    }

    public void setId(FileId id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public FileType getType() {
        return type;
    }

    public void setType(FileType type) {
        this.type = type;
    }
}
