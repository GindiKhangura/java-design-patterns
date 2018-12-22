package com.jdp.patterns.businessdelegate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdp.patterns.businessdelegate.bo.MovieTicketBo;
import com.jdp.patterns.businessdelegate.service.TicketService;

@Controller
public class TicketController {

	@Autowired
	private TicketService service;

	@RequestMapping("/createTicket")
	public String createTicket(MovieTicketBo ticket, ModelMap modelMap) {
		service.purchaseTicket(ticket);
		modelMap.addAttribute("msg", "Ticket purchased successfully");
		return "createTicket";
	}

	@RequestMapping("/showCreateTicket")
	public String showCreateTicket() {
		return "createTicket";
	}

}
