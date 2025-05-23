package SampleGroupWorkDisaster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DisasterController {
	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("safetyReport")
	public String safetyReport() {
		return "safetyReport";
	}
	

}
