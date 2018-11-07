package com.filedownloader_with_apache_common_io.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="file")
public class FileStorageProperties {
private String uploadDir;

public String getUploadDir() {
	return uploadDir;
}

public void setUploadDir(String uploadDir) {
	this.uploadDir = uploadDir;
}

}
