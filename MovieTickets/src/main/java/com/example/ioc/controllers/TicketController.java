package com.example.ioc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ioc.bo.TicketBo;
import com.example.ioc.dao.TicketDao;
import com.example.ioc.model.Ticket;
import com.example.ioc.services.TicketService;

@Controller
public class TicketController {
	
	@Autowired
//	private TicketDao dao;
	private TicketService service;
	
	@RequestMapping("/showCreateTicket")
	public String showCreateTicket()
	{
		return "createTicket";
	}
	
	@RequestMapping("/createTicket")
	public String createTicket(TicketBo ticket, ModelMap modelMap)
	{
		service.purchaseTicket(ticket);
		modelMap.addAttribute("msg","Ticket Purchased Successfully");
		return "createTicket";
	}

}
