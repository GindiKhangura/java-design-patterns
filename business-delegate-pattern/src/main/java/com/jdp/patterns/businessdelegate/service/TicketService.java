package com.jdp.patterns.businessdelegate.service;

import com.jdp.patterns.businessdelegate.bo.MovieTicketBo;

public interface TicketService {

	void purchaseTicket(MovieTicketBo ticket);

}
