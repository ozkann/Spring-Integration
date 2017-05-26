package beans;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.springframework.stereotype.Component;

@Component("msgBean")
public class Message {

	
	
	public void getMessage(User u){
		
		
		String userName = u.getName();
				
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Welcome >-"+userName));
		
		
		BasicConfigurator.configure();
	
		log.info(userName+"\t"+"has triggered to Message method");
	}
	
	
	
}
