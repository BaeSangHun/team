package www.naver.com.Controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class Controller2 {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		
		return "index";
	}
	@RequestMapping(value = "/home")
	public String home2() {
		System.out.println("home화면 실행 확인");
		
		
		return "home";
	}
	//폼에서 로그인 버튼 눌렀을때 실행
	//로그인 체크 메서드
	@RequestMapping(value = "/loginAction", method = RequestMethod.GET)
	public String login(HttpServletRequest request) {
		System.out.println("login 실행 확인");
		
		String returnURL = "";
		
		//폼에서 받은 아이디 패스워드 일치시 admin 세션 key 생성
		if("admin".equals(request.getParameter("usercode")) && "test".equals(request.getParameter("password"))){
			
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("admin_id", "admin");
			map.put("admin_name", "관리자");
			request.getSession().setAttribute("admin", map);
			
			System.out.println("로그인 정보 일치 로그인창 이동");
			returnURL = "redirect:/home"; // 일치하면 관리자 화면으로 이동
		}else{
			System.out.println("로그인 정보 일치하지 않음 로그인창 이동");
			returnURL = "redirect:/index"; // 일치하지 않으면 로그인페이지 재이동
		}
		
		
		
		return returnURL;
	}
}
