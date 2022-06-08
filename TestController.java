package capp.controller;

import org.springframework.stereotype.Controller;

@Controller
public class TestController {
	@RequestMapping("/test/hello")
	{
		return "hello"; //WEB-INF/views/hello.jsp
	}

}
