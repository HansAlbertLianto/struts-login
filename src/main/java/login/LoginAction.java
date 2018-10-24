package login;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String username, password;
	
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
	  
	public String execute(){  
	    if(getUsername().equals("user") && getPassword().equals("password")){  
	        return SUCCESS;  
	    }  
	    else {
	    	addActionError("Invalid username / password");
	        return ERROR;  
	    }  
	}  
	
}
