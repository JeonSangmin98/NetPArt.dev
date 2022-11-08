package com.spring.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.spring.domain.AttachFileDTO;

import lombok.extern.log4j.Log4j;
import net.coobird.thumbnailator.Thumbnailator;

@Controller
@Log4j
public class UploadController {

	@GetMapping("/uploadForm")
	public void uploadForm() {
		log.info("uploadForm...");
	}// uploadForm

	@PostMapping("/uploadFormAction")
	public void uploadFormPost(MultipartFile[] uploadFile, Model model) {
		String uploadFolder = "/Users/netpart/Desktop/Dev/upload";
		for (MultipartFile multipartFile : uploadFile) {
//			log.info("----------");
//			log.info("upload File Name : " + multipartFile.getOriginalFilename());
//			log.info("upload File Size : " + multipartFile.getSize());

			File saveFile = new File(uploadFolder, multipartFile.getOriginalFilename());
			try {
				multipartFile.transferTo(saveFile);
			} catch (Exception e) {
				log.error(e.getMessage());
			}
		}
	}// uploadFormPost

	@GetMapping("/uploadAjax")
	public void uploadAjax() {
		log.info("uploadAjax...");
	}// uploadAjax

	@PostMapping("/uploadAjaxAction")
	@ResponseBody
	public ResponseEntity<List<AttachFileDTO>> uploadAjaxPost(MultipartFile[] uploadFile) {
		log.info("uploadAjaxPost...");
		String uploadFolder = "/Users/netpart/Desktop/Dev/upload";
		String uploadFolderPath = getFolder();
		List<AttachFileDTO> list = new ArrayList<>();
		File uploadPath = new File(uploadFolder, uploadFolderPath);
		if (uploadPath.exists() == false) {
			uploadPath.mkdirs();
		}
		for (MultipartFile multipartFile : uploadFile) {
			AttachFileDTO attachDTO = new AttachFileDTO();
			// 파일 이름 변경
			UUID uuid = UUID.randomUUID(); // 이름 겹치는 것을 방지 하기 위한 랜덤 값
			String fileName = multipartFile.getOriginalFilename();
			String uploadFileName = uuid.toString() + "_" + fileName;

			attachDTO.setFileName(fileName);
			attachDTO.setUuid(uuid.toString());
			attachDTO.setUploadPath(uploadFolderPath);

			File saveFile = new File(uploadPath, uploadFileName);

			try {
				multipartFile.transferTo(saveFile);
				if (checkImageType(saveFile)) {
					attachDTO.setImage(true);
					// 섬네일 이미지의 파일 이름엥 s_ 붙힘
					FileOutputStream thumnail = new FileOutputStream(new File(uploadPath, "s_" + uploadFileName));
					Thumbnailator.createThumbnail(multipartFile.getInputStream(), thumnail, 100, 100);
					thumnail.close();
				}
				list.add(attachDTO);
			} catch (Exception e) {
				log.error(e.getMessage());
			}
		} // end for
		return new ResponseEntity<>(list, HttpStatus.OK);
	}// uploadAjaxPost

	@GetMapping("/display")
	@ResponseBody
	public ResponseEntity<byte[]> getFile(String fileName) {
		log.info("fileName: " + fileName);
		File file = new File("/Users/netpart/Desktop/Dev/upload/" + fileName);
		log.info("file: " + file);
		ResponseEntity<byte[]> result = null;
		HttpHeaders header = new HttpHeaders();
		try {
			header.add("Content-Type", Files.probeContentType(file.toPath()));
			result = new ResponseEntity<>(FileCopyUtils.copyToByteArray(file), header, HttpStatus.OK);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}// getFile

	@GetMapping(value = "/download", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	@ResponseBody
	public ResponseEntity<Resource> downloadFile(String fileName) {
		log.info("download file: " + fileName);
		Resource resource = new FileSystemResource("/Users/netpart/Desktop/Dev/upload/" + fileName);
		log.info("resource: " + resource);
		String resourceName = resource.getFilename();
		String resourceOriginalName = resourceName.substring(resourceName.indexOf("_") + 1); // remove uuid
		HttpHeaders headers = new HttpHeaders();
		try {
			headers.add("Content-Disposition",
					"attachment; filename=" + new String(resourceOriginalName.getBytes("UTF-8"), "ISO-8859-1"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Resource>(resource, headers, HttpStatus.OK);
	}// downloadFile

	@PostMapping("/deleteFile")
	@ResponseBody
	public ResponseEntity<String> deleteFile(String fileName, String type) {
		log.info("deleteFile : " + fileName);
		File file;
		try {
			file = new File("/Users/netpart/Desktop/Dev/upload/" + URLDecoder.decode(fileName, "UTF-8"));
			file.delete();
			if (type.equals("image")) {
				String largeFileName = file.getAbsolutePath().replace("s_", "");
				log.info("largeFileName : " + largeFileName);
				file = new File(largeFileName);
				file.delete();
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>("deleted", HttpStatus.OK);
	}

	private String getFolder() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String str = sdf.format(date);
		return str.replace("-", File.separator);
	}// getFolder

	private boolean checkImageType(File file) {
		try {
			String contentType = Files.probeContentType(file.toPath());
			return contentType.startsWith("image");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}// UploadController
