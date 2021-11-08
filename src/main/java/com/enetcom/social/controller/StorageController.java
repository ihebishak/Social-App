package com.enetcom.social.controller;

import com.enetcom.social.Service.impl.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/user")
public class StorageController {

	@Autowired
	private StorageService storageService;
	
	@PostMapping("/upload")
	public String uploadFile(@RequestParam(value="file") MultipartFile file) {
		return this.storageService.uploadFile(file);
	}
	
	/*@GetMapping("/download/{fileName}")
	public ResponseEntity<?> downloadFile(@PathVariable String fileName) {
		byte[] data = this.storageService.downloadFile(fileName);
		ByteArrayResource resource = new ByteArrayResource(data);
		return ResponseEntity
				.ok()
				.contentLength(data.length)
				.header("content-type","image/jpg")
				.header("content-type","image/jpeg")
				.header("content-disposition","inline; filename=\""+fileName+"\"")
				.body(resource);
	}*/
	
/*	@DeleteMapping("/delete/{fileName}")
	public Boolean deleteFile(@PathVariable String fileName) {
		return this.storageService.deleteFile(fileName);
	}*/
	
}
