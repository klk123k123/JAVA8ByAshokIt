package com.learn.optional;

import java.util.Optional;

public class UserService {
	
	public String getUserByID(int userId)
	{
		if(userId==100)
			return "Success";
		else if(userId==200)
			return "Processing";
		else if(userId ==300)
			return "Deletng";
		return null;
	}
	public Optional<String> getUserByName(int userId)
	{
		String value=null;
		if(userId==100)
			
			value="Success";
		else if(userId==200)
			value= "Processing";
		else if(userId ==300)
			value= "Deletng";
		return Optional.ofNullable(value);
	}
}
