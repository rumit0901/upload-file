package com.bah.uploadfile.utils;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtils {
	
	public static String saveFile(String filename, MultipartFile multipartFile) {
		Path uploadPath = Paths.get("Files-Upload");
		
		return null;
	}

}
