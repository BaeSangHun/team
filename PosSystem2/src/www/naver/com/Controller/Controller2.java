package www.naver.com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class Controller2 {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		
		return "index";
	}
	@RequestMapping(value = "/loginAction", method = RequestMethod.POST)
	public String login() {
		System.out.println("login 실행 확인");
		
		
		return "index2";
	}
}
