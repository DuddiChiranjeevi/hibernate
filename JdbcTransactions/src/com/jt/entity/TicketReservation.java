package com.jt.entity;

import java.io.Serializable;

public class TicketReservation  implements Serializable{
	private static final long serialVersionUID = 1L;
	private int tripId;
	private int availableTickets;
	private int soldTickets;
	private String tripName;
	
	
	@Override
	public String toString() {
		return "TicketReservation [tripId=" + tripId + ", availableTickets=" + availableTickets + ", soldTickets="
				+ soldTickets + ", tripName=" + tripName + "]";
	}
	public int gettripId() {
		return tripId;
	}
	public void settripId(int tripId) {
		this.tripId = tripId;
	}
	public int getAvailableTickets() {
		return availableTickets;
	}
	public void setAvailableTickets(int availableTickets) {
		this.availableTickets = availableTickets;
	}
	public int getSoldTickets() {
		return soldTickets;
	}
	public void setSoldTickets(int soldTickets) {
		this.soldTickets = soldTickets;
	}
	public String getTripName() {
		return tripName;
	}
	public void setTripName(String tripName) {
		this.tripName = tripName;
	}
	
	
}
