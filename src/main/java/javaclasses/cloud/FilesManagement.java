package javaclasses.cloud;


import javaclasses.cloud.impl.SecurityToken;
import javaclasses.cloud.impl.tinytype.FileId;
import javaclasses.cloud.impl.valueobject.FileVO;

import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * File manager API.
 */
public interface FilesManagement {
    /**
     * Create a new file.
     *
     * @param securityToken that was given to user in authentication time for using the opportunities of cloud.
     * @param stream        with file content.
     * @param fileVO        main information that is necessary for creating a file.
     * @throws FileWorkException in case of unsuccessful work with file.
     */
    void createFile(SecurityToken securityToken, InputStream stream, FileVO fileVO) throws FileWorkException;

    /**
     * Upload file from any source.
     *
     * @param securityToken that was given to user in authentication time for using the opportunities of cloud.
     * @param fileVO        main information that is necessary for creating a file.
     * @throws FileWorkException in case of unsuccessful work with file.
     */
    void uploadFile(SecurityToken securityToken, FileVO fileVO) throws FileWorkException;

    /**
     * Edit file information.
     *
     * @param securityToken that was given to user in authentication time for using the opportunities of cloud.
     * @param id            of file.
     * @throws FileWorkException in case of unsuccessful work with file.
     */
    void editFile(SecurityToken securityToken, FileId id) throws FileWorkException;

    /**
     * Download file from cloud.
     *
     * @param securityToken that was given to user in authentication time for using the opportunities of cloud.
     * @param id            of file.
     * @return the file content.
     * @throws FileWorkException in case of unsuccessful work with file.
     */
    InputStream downloadFile(SecurityToken securityToken, FileId id) throws FileWorkException;

    /**
     * Remove file content.
     *
     * @param securityToken that was given to user in authentication time for using the opportunities of cloud.
     * @param id            of file.
     * @return information about success of removing.
     * @throws FileNotFoundException in case of absence of file.
     */
    boolean removeFile(SecurityToken securityToken, FileId id) throws FileNotFoundException;
}
