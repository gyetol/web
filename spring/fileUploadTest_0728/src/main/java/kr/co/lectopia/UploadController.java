package kr.co.lectopia;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	@Autowired
	String uploadPath;
	@RequestMapping(value="/upload", method=RequestMethod.GET)
	public String upload() {
		return "form";
	}
	
	@RequestMapping(value="/upload",method=RequestMethod.POST)
	public void upload(@RequestParam("upfile") MultipartFile[] files,HttpServletResponse response) throws IOException{
		//System.out.println("업로드 파일명: "+file.getOriginalFilename());
		//System.out.println("업로드 파일유형: " + file.getContentType());
		//System.out.println("업로드 파일크기: "+file.getSize());
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		StringBuffer sb =new StringBuffer();
		for(MultipartFile file:files) {
		File saveFile = new File(uploadPath,file.getOriginalFilename());
		FileCopyUtils.copy(file.getBytes(), saveFile);
		sb.append(file.getOriginalFilename()+"\n");
		}
		out.print(sb.toString());
	}
}
