package www.naver.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class HomeController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home(Model model) {
		
		model.addAttribute("name", "rararara");
		
		return "index";
	}
	

}
