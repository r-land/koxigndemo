package koxign.api.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import koxign.api.service.ApiService;

@Controller
@RequestMapping("/api")
public class ApiController {
	final String path = "api/";
	
	@Autowired
	ApiService service;
	
	@GetMapping("/info")
	String list(Model model) {
		model.addAttribute("info", info);
		
		return path + "info";
	}

	@GetMapping("/issue")
	String add() {
		return path + "issue";
	}
	@PostMapping("/issue")
	String issue(Api item) {
		service.issue(item);
		
		return "redirect:info";
	}
}
