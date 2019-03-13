package eu.ensup.projetcalculatrice.test.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import eu.ensup.projetcalculatrice.service.CalculerEntierService;

public class CalculatriceServiceTest {
	CalculerEntierService calc = new CalculerEntierService();
	
	@Test
	public void serviceAdditionEntier() {
		assertEquals(8, calc.addition(3, 5));
		// fail();
	}
	
	@Test
	public void serviceSoustractionEntier() {
		assertEquals(5, calc.soustraction(10,5));
		// fail();
	}
	
	@Test
	public void serviceMultiplicationEntier() {
		assertEquals(15, calc.multiplication(3,5));
		// fail();
	}
	
	@Test
	public void serviceDivisionEntier() {
		assertEquals(3, calc.division(9,3));
		// fail();
	}
	
	
}
