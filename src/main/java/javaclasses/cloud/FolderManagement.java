package javaclasses.cloud;


import javaclasses.cloud.impl.SecurityToken;
import javaclasses.cloud.impl.tinytype.FolderId;
import javaclasses.cloud.impl.valueobject.FolderVO;

import java.io.InputStream;

/**
 * Folder manager API.
 */
public interface FolderManagement {
    /**
     * Folder creation.
     *
     * @param securityToken that was given to user in authentication time for using the opportunities of cloud.
     * @param FolderVO      main information that is necessary for creating a folder.
     * @throws FolderWorkException throws in case of unsuccessful work with folder.
     */
    void createFolder(SecurityToken securityToken, FolderVO FolderVO) throws FolderWorkException;

    /**
     * Edit folder information.
     *
     * @param securityToken that was given to user in authentication time for using the opportunities of cloud.
     * @param id            of older.
     * @throws FolderWorkException throws in case of unsuccessful work with folder.
     */
    void editFolder(SecurityToken securityToken, FolderId id) throws FolderWorkException;

    /**
     * Give the all folder content.
     *
     * @param securityToken that was given to user in authentication time for using the opportunities of cloud.
     * @param id            of folder.
     * @return stream with folder content.
     * @throws FolderWorkException throws in case of unsuccessful work with folder.
     */
    InputStream downloadFolder(SecurityToken securityToken, FolderId id) throws FolderWorkException;

    /**
     * Remove folder with all internal content
     *
     * @param securityToken that was given to user in authentication time for using the opportunities of cloud.
     * @param id            of folder.
     * @return information about success of removing.
     * @throws FolderWorkException throws in case of unsuccessful work with folder.
     */
    boolean removeFolder(SecurityToken securityToken, FolderId id) throws FolderWorkException;
}

