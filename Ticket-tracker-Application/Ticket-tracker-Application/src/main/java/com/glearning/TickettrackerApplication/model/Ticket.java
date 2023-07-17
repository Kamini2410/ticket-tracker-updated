package com.glearning.TickettrackerApplication.model;


//import java.time.chrono.ChronoLocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Ticket.java
@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;

	@Column(length = 1000)
	private String description;

	private String ticketCreatedOn;
	

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(Long id, String title, String description, String ticketCreatedOn) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.ticketCreatedOn = ticketCreatedOn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTicketCreatedOn() {
		return ticketCreatedOn;
	}

	public void setTicketCreatedOn(String ticketCreatedOn) {
		this.ticketCreatedOn = ticketCreatedOn;
	}

	
}