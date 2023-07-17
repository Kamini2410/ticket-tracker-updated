package com.glearning.TickettrackerApplication.service;

import java.util.List;
import java.util.Optional;

//import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glearning.TickettrackerApplication.model.Ticket;
import com.glearning.TickettrackerApplication.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	private TicketRepository ticketRepository;

	@Autowired
	public TicketServiceImpl(TicketRepository theticketRepository) {
		ticketRepository = theticketRepository;
	}

	@Override
	public List<Ticket> findAll() {

		List<Ticket> theBooks = ticketRepository.findAll();
		return theBooks;
	}

	@Override
	public void save(Ticket theTicket) {
		ticketRepository.save(theTicket);
		
	}

	@Override
	public void deleteById(long theId) {
		ticketRepository.deleteById(theId);
		
	}

	@Override
	public Ticket findById(long theId) {
		Optional<Ticket> result = ticketRepository.findById(theId);

		Ticket theTicket = null;

		if (result.isPresent()) {
			theTicket = result.get();
		} else {
			// we didn't find the book
			throw new RuntimeException("Did not find book id - " + theId);
		}

		return theTicket;
	}

	@Override
	public Ticket findTicketsByTitle(String title) {
		Iterable<Ticket> result = ticketRepository.findTicketsByTitle(title);

		Ticket theTicket = null;

		if (result!=null) {
			theTicket =(Ticket) result;
		} else {
			// we didn't find the book
			throw new RuntimeException("Did not find book id - " + theTicket);
		}

		
		return theTicket;
	}

	


}