package com.exception;

public class ExceptionExmaple {
	
	public static void main(String[] args) throws InvalidException {
		
		ExceptionExmaple e=new ExceptionExmaple();
		User user=e.getData(105);
		System.out.println(user.getUserId()+" <------> "+user.getUserName());
		
	}
	
	public User getData(Integer id) throws InvalidException {
		User u=new User();
		if(id==101) {
			u.setUserId(101);
			u.setUserName("chandra");
			u.setUserAddres("Hyderbad");
		}else if(id==102) {
			u.setUserId(103);
			u.setUserName("sekhar");
			u.setUserAddres("amaravathi");
		}else {
			throw new InvalidException("your passing invalid keyword");
			
			// throw will create the exception
			// throws will delegate the exception
		}
		return u;
		
	}

}
