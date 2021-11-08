package com.enetcom.social.Service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.util.IOUtils;

@Service
public class StorageService {



	@Value("${application.bucket.name}")
	private String bucketName;
		
	private File convertMultiPartToFile(MultipartFile file )  {
		
		File convFile = new File( file.getOriginalFilename() );
		try {

			FileOutputStream fos = new FileOutputStream( convFile );
	        fos.write( file.getBytes() );
	        fos.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
		return convFile;
    }

	public String uploadFile(MultipartFile file) {
	   String fileName=System.currentTimeMillis()+"_"+file.getOriginalFilename();
	   File fileObj = convertMultiPartToFile(file);

	   fileObj.delete();
	   return fileName;
	}


//	public String getFileLink(String fileName) {
//		s3Client.
//		return null;
//	}
	
	 
	
}
