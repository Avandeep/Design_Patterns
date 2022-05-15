package com.example.ioc.services;

import com.example.ioc.bo.TicketBo;
import com.example.ioc.model.Ticket;

public interface TicketService {
	
	void purchaseTicket(TicketBo ticket);

}
