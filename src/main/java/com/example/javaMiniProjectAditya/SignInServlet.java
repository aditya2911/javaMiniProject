package com.example.javaMiniProjectAditya;

import java.io.IOException;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example.javaMiniProjectAditya.controller.HomeController;
import com.example.javaMiniProjectAditya.model.AuthModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@Component
public class SignInServlet extends HttpServlet {

	private final HomeController controller;
	
	public SignInServlet(HomeController controller) {
		this.controller = controller;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		
		Long id = Long.parseLong(req.getParameter("ucid"));
		String name = req.getParameter("name");
		String password = req.getParameter("pass");
		System.out.println("project is "+name+" password"+password	);

		
		Optional<AuthModel> opt= controller.findByUsernameAndPassword(name,password);
		
    	RequestDispatcher dispatcher = req.getRequestDispatcher("/jsp/jspRedirect.jsp");
    	RequestDispatcher failedAuth = req.getRequestDispatcher("/jsp/AuthFailed.jsp");
    	System.out.println("inside signin servlet");
		if(opt.isPresent()) {
			//user = opt.get();
			try {
				dispatcher.forward(req, resp);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			} 
			
		}
		else {
			try {
				failedAuth.forward(req, resp);
			} catch (ServletException | IOException  e) {
				
				
				e.printStackTrace();
			} 
		}
		
		
	}

}
