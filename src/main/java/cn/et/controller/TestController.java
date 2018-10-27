package cn.et.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.et.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


public class TestController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置字符集
		response.setContentType("text/html;charset=UTF-8");
		//初始化容器
		ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		//获取一个实例对象
		TestService ts =(TestService)ac.getBean("testServiceImpl");
		//获取前端传过来在数据
		String content =request.getParameter("myContent");
		//判断如果为空就给个默认的""号
		if (content==null) {
			content ="";
		}
		//去service层调接口查数据
		List<Map<String, Object>> queryNewsByContent = ts.queryNewsByContent(content);
		//给数据传到前端
		request.setAttribute("testList", queryNewsByContent);
		request.setAttribute("content", content);
		//要跳转在前端url
		request.getRequestDispatcher("/test.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
