package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Vacation;
import model.VacationLogic;

public class TestVacation2 {
	VacationLogic vlogic = new VacationLogic();
	Vacation vaca = new Vacation();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBudgetIsTrue() {
		vaca.setEntertainmentExpense(200);
		vaca.setFoodExpense(350);
		vaca.setTicketExpense(300);
		vaca.setHotelExpense(1100);
		assertTrue(vlogic.determineWithinBudget(vaca));
	}
	
	@Test
	public void testBudgetIsFalse() {
		vaca.setEntertainmentExpense(400);
		vaca.setFoodExpense(450);
		vaca.setTicketExpense(500);
		vaca.setHotelExpense(1400);
		assertFalse(vlogic.determineWithinBudget(vaca));
	}

}
