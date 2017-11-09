package ru.yak.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Generated("com.robohorse.robopojogenerator")
public class User{

	@JsonProperty("auth")
	private Auth auth;

	@JsonProperty("type")
	private String type;

	public void setAuth(Auth auth){
		this.auth = auth;
	}

	public Auth getAuth(){
		return auth;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public static Map<String, Auth> getUsers(){
		ObjectMapper mapper = new ObjectMapper();
        List<User> users = new ArrayList<>();
        Map<String, Auth> mapUsers = new HashMap<>();
		try {
			users = mapper.readValue(User.class.getClass().getResourceAsStream("/users.json"), new TypeReference<List<User>>(){});
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (User user : users){
            mapUsers.put(user.getType(), user.getAuth());
        }
		return mapUsers;
	}

	@Override
 	public String toString(){
		return 
			"User{" + 
			"auth = '" + auth + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}