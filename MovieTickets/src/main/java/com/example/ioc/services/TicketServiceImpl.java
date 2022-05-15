package com.example.ioc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ioc.bo.TicketBo;
import com.example.ioc.dao.TicketDao;
import com.example.ioc.model.Ticket;

@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	TicketDao dao;

	@Override
	public void purchaseTicket(TicketBo ticket) {
		Ticket ticketEntity=new Ticket();
		ticketEntity.setMovie(ticket.getMovieName());
		ticketEntity.setScreen(ticket.getScreenNo());
		ticketEntity.setSeat(ticket.getSeatNo());
		dao.create(ticketEntity);
	}

}
