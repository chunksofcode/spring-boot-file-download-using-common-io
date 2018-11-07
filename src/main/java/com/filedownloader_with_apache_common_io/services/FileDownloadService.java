package com.filedownloader_with_apache_common_io.services;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.GZIPInputStream;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.filedownloader_with_apache_common_io.exceptions.FileNotDownloadedCorrectlyException;
import com.filedownloader_with_apache_common_io.exceptions.FileStorageException;
import com.filedownloader_with_apache_common_io.model.FileDetails;
import com.filedownloader_with_apache_common_io.model.FileStorageProperties;
import com.filedownloader_with_apache_common_io.utils.Constants;

@Service
public class FileDownloadService {
	
	public String downloadFile(FileDetails fileDetails) {
		try {
			
			URL url = new URL(fileDetails.getFileUrl());
			 //connectionTimeout, readTimeout = 10 seconds
			File downloadedFile = new File(fileDetails.getFileDownloadLocation()+"/"+fileDetails.getFileName()+"."+fileDetails.getFileType());
            FileUtils.copyURLToFile(url, downloadedFile, 10000, 10000);

			return downloadedFile.getAbsolutePath();
		} catch (MalformedURLException e) {
			throw new FileNotDownloadedCorrectlyException(
					Constants.FILE_NOT_DOWNLOADED_CORRECTLY, e);
		} catch (IOException e) {
			throw new FileNotDownloadedCorrectlyException(
					Constants.FILE_NOT_DOWNLOADED_CORRECTLY, e);
		}

	}
}
