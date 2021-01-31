package model;

public class Vacation {
	public String destination;
	public int numOfDays;
	public boolean returnFlight;
	public int ticketExpense;
	public int foodExpense;
	public int entertainmentExpense;
	public int hotelExpense;
	
	public Vacation() {

	}

	public Vacation(String destination, int numOfDays, boolean returnFlight, int ticketExpense, int foodExpense,
			int entertainmentExpense, int hotelExpense) {
		this.destination = destination;
		this.numOfDays = numOfDays;
		this.returnFlight = returnFlight;
		this.ticketExpense = ticketExpense;
		this.foodExpense = foodExpense;
		this.entertainmentExpense = entertainmentExpense;
		this.hotelExpense = hotelExpense;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumOfDays() {
		return numOfDays;
	}

	public void setNumOfDays(int numOfDays) {
		this.numOfDays = numOfDays;
	}

	public boolean isReturnFlight() {
		return returnFlight;
	}

	public void setReturnFlight(boolean returnFlight) {
		this.returnFlight = returnFlight;
	}

	public int getTicketExpense() {
		return ticketExpense;
	}

	public void setTicketExpense(int ticketExpense) {
		this.ticketExpense = ticketExpense;
	}

	public int getFoodExpense() {
		return foodExpense;
	}

	public void setFoodExpense(int foodExpense) {
		this.foodExpense = foodExpense;
	}

	public int getEntertainmentExpense() {
		return entertainmentExpense;
	}

	public void setEntertainmentExpense(int entertainmentExpense) {
		this.entertainmentExpense = entertainmentExpense;
	}

	public int getHotelExpense() {
		return hotelExpense;
	}

	public void setHotelExpense(int hotelExpense) {
		this.hotelExpense = hotelExpense;
	}
	
	
	
	
	

}
