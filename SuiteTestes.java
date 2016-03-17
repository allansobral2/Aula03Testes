package Testes;

import static org.junit.Assert.*; 
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import org.junit.Test;

	@RunWith(Suite.class)
	@SuiteClasses({ ContaTest.class, EfetuarSaqueTest.class,
	ExtratoTest.class, MovimentoTest.class})
	
	public class SuiteTestes {

}

		
