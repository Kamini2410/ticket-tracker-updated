package com.glearning.TickettrackerApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glearning.TickettrackerApplication.model.Ticket;
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

	
		Iterable<Ticket> findTicketsByTitle(String title);
	

}
