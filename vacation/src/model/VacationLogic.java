package model;

public class VacationLogic {
	
	public String showVacationDetails(Vacation vacation) {
		String showDetails = "You are visting " + vacation.getDestination() + " for " + vacation.getNumOfDays() + " number of days and you are returing home " + vacation.isReturnFlight();
		return showDetails;
	}
	
	public boolean determineWithinBudget(Vacation vacation) {
		boolean inBudget = true;
		double budget = 2000;
		if (budget > (vacation.getEntertainmentExpense() + vacation.getFoodExpense() + vacation.getHotelExpense() + vacation.getTicketExpense())) {
			return inBudget;
		}
		else {
			inBudget = false;
			return inBudget;
		}
	}

}
