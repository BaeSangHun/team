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
		System.out.println("index ȭ��(�α���ȭ��) ������ �޼��� ����");
		
		return "index";
	}
	@RequestMapping(value = "/home")
	public String home2() {
		System.out.println("homeȭ�� ���� Ȯ��");
		
		
		return "home";
	}
	//������ �α��� ��ư �������� ����
	//�α��� üũ �޼���
	@RequestMapping(value = "/loginAction", method = RequestMethod.POST)
	public String login(HttpServletRequest request) {
		System.out.println("login �޼��� ���� Ȯ��");
		
		String returnURL = "";
		
		//������ ���� ���̵� �н����� ��ġ�� admin ���� key ����
		if("admin".equals(request.getParameter("usercode")) && "test".equals(request.getParameter("password"))){
			
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("admin_id", "afafafaf");
			map.put("admin_name", "agggggg");
			request.getSession().setAttribute("admin", map);
			
			System.out.println("�α��� ���� ��ġ �α���â �̵�");
			returnURL = "redirect:/home"; // ��ġ�ϸ� ������ ȭ������ �̵�
		}else{
			System.out.println("�α��� ���� ��ġ���� ���� �α���â �̵�");
			returnURL = "redirect:/"; // ��ġ���� ������ �α��������� ���̵�
		}
		
		
		
		return returnURL;
	}
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request){
		System.out.println("��Ʈ�ѷ� �α׾ƿ� �޼��� ����");	
		request.getSession().invalidate();
		request.getSession().removeAttribute("admin");
		return "index";
		
	}
	@RequestMapping("/test")
	public String test(){
		System.out.println("test �޼��� ����");	
	
		return "NewFile";
		
	}
}
