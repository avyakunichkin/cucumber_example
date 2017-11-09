package ru.yak.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Auth{

	@JsonProperty("email")
	private String email;

	@JsonProperty("passw")
	private String passw;

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setPassw(String passw){
		this.passw = passw;
	}

	public String getPassw(){
		return passw;
	}

	@Override
 	public String toString(){
		return 
			"Auth{" + 
			"email = '" + email + '\'' + 
			",passw = '" + passw + '\'' + 
			"}";
		}
}