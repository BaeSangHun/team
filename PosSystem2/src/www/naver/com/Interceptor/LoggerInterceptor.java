package www.naver.com.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//HandlerInterceptorAdapter Ŭ������ ��ӹ޾Ƽ� ����
public class LoggerInterceptor extends HandlerInterceptorAdapter{
	private static final Logger logger = LoggerFactory.getLogger(LoggerInterceptor.class);
	//��ó����
	//��Ʈ�ѷ��� ȣ��Ǳ� ���� ����Ǿ� ��Ʈ�ѷ� ������ �ؾ��� �۾��� �����Ѵ�.
	//���ϰ��� true �̸� �ڵ鷯 ���� ü���� �����ܰ�� ���� false��  �۾��� �ߴ��ϰ� ���� ��Ʈ�ѷ��� ���� ���ͼ��͵��� ������� ����
	public void test(){
		System.out.println("test �޼��� ���� Ȯ��");
	}
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response ,Object handler)throws Exception{
		System.out.println("preHandle �޼ҵ� ����");
		
		return super.preHandle(request, response, handler);
		
	}
	//��ó����
	//��Ʈ�ѷ� ������ ȣ��� ��ó�� �۾��� ���� �����
	//��Ʈ�ѷ��� ������ ModelAndViewŸ���� ������ �����ȴ�. 
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response ,Object handler ,ModelAndView modelAndView)throws Exception{
		System.out.println("postHandle �޼ҵ� ����");
	}
}