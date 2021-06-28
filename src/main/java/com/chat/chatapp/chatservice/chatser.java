package com.chat.chatapp.chatservice;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service("wmgServ")
public class chatser  {

	
	public String generateWishMessage() {
		LocalDateTime  sysDate=LocalDateTime.now();

		int hour=sysDate.getHour()+1;
		
		if(hour<12)
			return "Good Morning";
		else if(hour<16)
			return "Good AfterNoon";
		else if(hour<20)
			return "Good Evening";
        return "ok";
		
	}

}
    

