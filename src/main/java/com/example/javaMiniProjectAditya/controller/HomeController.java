package com.example.javaMiniProjectAditya.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.javaMiniProjectAditya.model.AuthModel;
import com.example.javaMiniProjectAditya.repository.AuthRepository;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	@Autowired
	private  AuthRepository repo;
	
    @RequestMapping("/")
    public String goToHome() {
        return "test2";
    }
    
    
    @RequestMapping("success")
    public String goToSuccess() {
        return "success";
    }
    @PostMapping("/updateData")
    public String updateData() {
    	System.out.print("Data has been updated");
    	return "redirect:/success";
    }
    
    @GetMapping("/signIn")
    public String signIn() {
    	return "signIn";
    }
    
    @GetMapping("allUser")
    public String allUser() {
    	return "allUser";
    }
    
//    @PostMapping("/sendData")
//    public String sendData(@RequestParam String name,@RequestParam long ucid) {
//    	AuthModel a = new AuthModel(name,ucid);
//    	repo.save(a);
//    	return "redirect:/success";
//    }
    
    //@PostMapping("/sendData")
    public void sendData( String name, long ucid,String password) {
    	AuthModel a = new AuthModel(name,ucid,password);
    	repo.save(a);
    	return ;
    }
    
    
    public Optional<AuthModel> findById(Long id){
    	Optional<AuthModel> opt = repo.findById(id);
		return opt;
    	
    	
    }
    
    
//    @GetMapping("/allUser")
    public List<AuthModel> getAll(){
    	List<AuthModel> arr = repo.findAll();
    	  for (AuthModel user : arr) {
    	        System.out.println("User is "+user.getName()); // Print user object to the console
    	    }


    	  return arr;
    }


	public Optional<AuthModel> findByUsernameAndPassword(String name ,String password) {
		// TODO Auto-generated method stub
		Optional<AuthModel> opt = repo.findByNameAndPassword(name, password);
		
		return opt;
	}
}
