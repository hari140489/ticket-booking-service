package com.walmart.ticket.config;

import com.walmart.ticket.controller.TicketController;
import com.walmart.ticket.exception.handler.TicketExceptionHandler;
import com.walmart.ticket.service.TicketService;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring configuration file for controllers
 */
@Configuration
public class ControllerConfiguration {

	@Bean
	public TicketController ticketController(
		final TicketService ticketService) {
		return new TicketController(ticketService);
	}

	@Bean
	public TicketExceptionHandler ticketExceptionHandler(
		final MessageSource messageSource) {
		return new TicketExceptionHandler(messageSource);
	}
}
