package com.autozs.test;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/test")
public class DemoTest {
	
	@ResponseBody
	@RequestMapping("/t")
	public String testCookieAndSession(HttpServletRequest request, HttpServletResponse response){
		
		HttpSession session = request.getSession();
		Cookie[] cookies = request.getCookies();
		
		
		if(session.isNew()){
			System.out.println("新建的session   "+session.getId());
		}else {
			System.out.println("已有的session   "+session.getId());
		}
		
		System.out.println(cookies.length);
		
		for(Cookie c:cookies){
			System.out.println(c.getName()+"----"+c.getValue());
		}
		
		return "";
	}
}
