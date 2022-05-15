package com.example.ioc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;

import com.example.ioc.model.Ticket;

@Repository
public class TicketDaoImpl implements TicketDao {
	
	private static final String sql = "insert into ticket(movie,screen,seat) values(?,?,?)";
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void create(Ticket ticket) {

		jdbcTemplate.update(sql, ticket.getMovie(),ticket.getScreen(),ticket.getSeat());
	}

}
