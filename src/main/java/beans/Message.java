package beans;

import org.springframework.stereotype.Component;

@Component("messageBean")
public class Message {

	private String message = "JSF + SPRING INTEGRATION ";
	
	public String  getMessage(){
		
		return message;
		
	}
	
	
	
}
