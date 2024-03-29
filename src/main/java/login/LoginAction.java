package login;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	// Serial version UID
	private static final long serialVersionUID = 1L;
	
	// Declare attributes
	private String username, password;
	
	// Declare setters and getters
	public void setUsername(String username) {  
	    this.username = username;  
	}
	
	public String getUsername() {
		return username;
	}
	  
	public String getPassword() {  
	    return password;  
	}  
	  
	public void setPassword(String password) {  
	    this.password = password;  
	}
	
	// Function that is called upon Submit button press
	public String execute(){  
	    if(LoginAuth.validate(username, password)){  
	        return SUCCESS;  
	    }  
	    else {
	    	// Return action error message
	    	addActionError("Invalid username / password");
	        return ERROR;  
	    }  
	}  
	
}
