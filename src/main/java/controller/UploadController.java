package controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

	
	String uploadPath;
	
	@ModelAttribute
	public void init(HttpServletRequest request) {
		uploadPath=request.getServletContext().getRealPath("/")+"upload";
		System.out.println(uploadPath);
	}
	@GetMapping("/upload/form")
	public String form() {
		return "upload/fileUploadForm"; //WEB-INF/view/upload/fileUploadForm.jsp
	}
	@PostMapping("/upload/multipartFile")
	public String uploadByMultipartFile(@RequestParam("f")MultipartFile multipartFile,
			@RequestParam("title")String title,Model model) throws IOException {
		if(!multipartFile.isEmpty()) {
			File file = new File(uploadPath,multipartFile.getOriginalFilename());
			multipartFile.transferTo(file);
			model.addAttribute("tilte",title);
			model.addAttribute("fileName",multipartFile.getOriginalFilename());
			model.addAttribute("uploadPath",file.getAbsolutePath());
			return "upload/fileUploaded";
		}
		return "upload/noUploadFile";
	}
	
}
