package javaclasses.cloud.impl.valueobject;

import javaclasses.cloud.impl.tinytype.FolderId;

public class FolderVO {
    private FolderId id;
    private String folderName;

    public FolderVO(FolderId id, String folderName) {
        this.id = id;
        this.folderName = folderName;
    }

    public FolderId getId() {
        return id;
    }

    public void setId(FolderId id) {
        this.id = id;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }
}
