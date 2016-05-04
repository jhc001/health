package action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/test1.do")
public class Test1 {
	public Test1(){}
	public static void main(String[] args) {
		System.out.println("hello world..");
	}
	
	@RequestMapping(params="method=t1")
	public void login(String username,HttpServletResponse response) throws IOException {
		response.getWriter().write("{msg:'SUCCESS'}");
	}
	
}
