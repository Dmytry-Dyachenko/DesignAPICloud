package javaclasses.cloud;


import javaclasses.cloud.impl.tinytype.FolderId;
import javaclasses.cloud.impl.valueobject.FolderVO;

import java.io.InputStream;

public interface FolderMangement {
    void createFolder(InputStream stream, FolderVO FolderVO) throws FolderWorkException;

    void editFolder(FolderId id) throws FolderWorkException;

    InputStream downloadFolder(FolderId id) throws FolderWorkException;

    boolean removeFolder(FolderId id) throws FolderWorkException;
}

