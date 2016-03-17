package Testes;
import model.Extrato; 
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExtratoTest {
	Extrato extrato;
	@Before
	public void setUp() throws Exception{
		extrato = new Extrato("6939", "11111", "22/02/2016","22/03/2016");
	}
	
	@Test
	public void test() {
		assertEquals("6939, 11111, 22/02/2016, 22/03/2016", extrato, new Extrato("6939", "11111", "22/02/2016", "22/03/2016"));
	}

}
