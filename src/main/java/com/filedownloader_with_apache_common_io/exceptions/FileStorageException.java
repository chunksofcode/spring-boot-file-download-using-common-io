package com.filedownloader_with_apache_common_io.exceptions;

public class FileStorageException extends RuntimeException {

	public FileStorageException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public FileStorageException(String message) {
		super(message);
		
	}

}
