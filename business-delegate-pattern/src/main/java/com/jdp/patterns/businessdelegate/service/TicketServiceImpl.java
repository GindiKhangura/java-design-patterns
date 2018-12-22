package com.jdp.patterns.businessdelegate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdp.patterns.businessdelegate.bo.MovieTicketBo;
import com.jdp.patterns.businessdelegate.dao.TicketDao;
import com.jdp.patterns.businessdelegate.model.MovieTicket;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketDao dao;

	@Override
	public void purchaseTicket(MovieTicketBo ticket) {
		// Process payment

		MovieTicket ticketModel = new MovieTicket();

		ticketModel.setId(ticket.getId());
		ticketModel.setMovie(ticket.getMovieName());
		ticketModel.setScreen(ticket.getScreenType());
		ticketModel.setSeat(ticket.getSeatNumber());

		dao.create(ticketModel);

		// Email ticket
	}

}
