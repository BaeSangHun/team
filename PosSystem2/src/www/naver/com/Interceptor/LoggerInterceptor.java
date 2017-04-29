package www.naver.com.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//HandlerInterceptorAdapter 클래스를 상속받아서 만듬
public class LoggerInterceptor extends HandlerInterceptorAdapter{
	private static final Logger logger = LoggerFactory.getLogger(LoggerInterceptor.class);
	//전처리기
	//컨트롤러가 호출되기 전에 실행되어 컨트롤러 실행전 해야할 작업을 수행한다.
	//리턴값이 true 이면 핸들러 실행 체인의 다음단계로 진행 false면  작업을 중단하고 리턴 컨트롤러와 남은 인터셉터들은 실행되지 않음
	public void test(){
		System.out.println("test 메서드 실행 확인");
	}
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response ,Object handler)throws Exception{
		System.out.println("preHandle 메소드 실행");
		
		return super.preHandle(request, response, handler);
		
	}
	//후처리기
	//컨트롤러 실행후 호출됨 후처리 작업을 위해 사용함
	//컨트롤러가 돌려준 ModelAndView타입의 정보가 제공된다. 
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response ,Object handler ,ModelAndView modelAndView)throws Exception{
		System.out.println("postHandle 메소드 실행");
	}
}