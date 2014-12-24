package com.t2knatalie.javacourse;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Natalie_s_first_Java_appServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		int num1=4;
		int num2=3;
		int num3=7;
		int result = (num2+num3)*num1+(num2*num2);
		String resultStr = new String("<h1>Result of ("+num2+"+"+num3+")*("+num1+")+("+num2+"*"+num2+")="+result+"</h1>");
		resp.getWriter().println(resultStr);
	}
}
