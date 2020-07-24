package org.example.mvcTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathController {
	@RequestMapping("/member/find/{id}/{number}") // http://localhost:8080/mvcTest/member/find/hong
	public String path(@PathVariable("id") String id,@PathVariable("number") int number,Model model) {
		model.addAttribute("id",id);
		model.addAttribute("number",number);
		return "pathVariable";
	}
}
