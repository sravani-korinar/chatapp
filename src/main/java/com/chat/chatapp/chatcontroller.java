package com.chat.chatapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chat.chatapp.chatservice.chatser;

@RestController
public class chatcontroller {
	@Autowired
	private  chatser service;
	
	@GetMapping("/welcome")
	public  String showHome() {
		//return lvn
		return "weelcome to home page";
	}
	
	@GetMapping("/wish")
	public  String  generateWishMessage() {
		//us service
		String msg=service.generateWishMessage();
		//keep result in model attribute
		
		return msg;
		
	}

}
    

