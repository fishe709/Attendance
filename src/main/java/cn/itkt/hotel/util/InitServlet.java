package cn.itkt.hotel.util;

import javax.servlet.http.HttpServlet;



public class InitServlet extends HttpServlet{
	public void init() {
		StaticClass.URLPATH = VschoolStatic.getValue("URLPATH");
	}
	
}
