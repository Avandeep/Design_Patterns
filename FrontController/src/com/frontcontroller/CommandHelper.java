package com.frontcontroller;

public class CommandHelper {

	public Command getCommand(String requestURI) {
		
		if(requestURI.contains("viewStudentDetails.do"))
		{
			return new ViewCommandStudent();
		}
		return null;
		
		
	}

}
