package beans;

import org.springframework.stereotype.Component;


@Component("user")
public class User {

	

	private String Name;
	
	public User(){}
	
	public User(String Name) {
		super();
		this.Name = Name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}


}
