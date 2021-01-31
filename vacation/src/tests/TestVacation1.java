package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Vacation;
import model.VacationLogic;

public class TestVacation1 {
	VacationLogic vlogic = new VacationLogic();
	Vacation vaca = new Vacation();

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testStringMatches() {
		String message = "You are visting Hawaii for 11 number of days and you are returing home true";
		vaca.setDestination("Hawaii");
		vaca.setNumOfDays(11);
		vaca.setReturnFlight(true);
		String message2 = vlogic.showVacationDetails(vaca);
		assertEquals(message,vlogic.showVacationDetails(vaca));
		
	}


}
