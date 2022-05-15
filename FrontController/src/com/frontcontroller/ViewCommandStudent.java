package com.frontcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewCommandStudent implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		StudentVO vo=new StudentVO(1,"Avan");
		request.setAttribute("studentDetails", vo);
		
		return "showStudentDetails";
	}

}
