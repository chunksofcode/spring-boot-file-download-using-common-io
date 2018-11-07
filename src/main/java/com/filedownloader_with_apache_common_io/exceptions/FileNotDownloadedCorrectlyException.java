package com.filedownloader_with_apache_common_io.exceptions;

public class FileNotDownloadedCorrectlyException extends RuntimeException{

	public FileNotDownloadedCorrectlyException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public FileNotDownloadedCorrectlyException(String message) {
		super(message);
		
	}

}
