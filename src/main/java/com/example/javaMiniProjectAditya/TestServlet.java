package com.example.javaMiniProjectAditya;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.javaMiniProjectAditya.controller.HomeController;
import com.example.javaMiniProjectAditya.model.AuthModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class TestServlet extends HttpServlet{
	
	private HomeController controller ;
	
    public TestServlet(HomeController controller) {
        this.controller = controller;
    }
	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        resp.getWriter().write("Hello from Servlet!");
    	
    	String method = req.getMethod();
    	System.out.println("method is "+method);
    	if(method.equals("ACTION")) {
    		System.out.println("can access");
    		return;
    	}
    	
    	List<AuthModel> authData = controller.getAll();
    	getServletContext().setAttribute("authData", authData);
    	RequestDispatcher dispatcher = req.getRequestDispatcher("/allUser");
    	try {
			dispatcher.forward(req, resp);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error in servlet");
			e.printStackTrace();
		}
    }
    @Override
    protected void doPost(HttpServletRequest req , HttpServletResponse resp) throws IOException, ServletException{
    	String name = req.getParameter("name");
    	Long ucid = Long.parseLong(req.getParameter("ucid"));
    	String password = req.getParameter("pass");
    	
    	
    	controller.sendData(name, ucid,password);
    	
    	System.out.print("Success");
    	RequestDispatcher dispatcher = req.getRequestDispatcher("/success");
    	dispatcher.forward(req, resp);
    	

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
