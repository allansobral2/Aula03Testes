package Testes;
import model.Conta;
import static org.junit.Assert.*; 

import org.junit.Before;
import org.junit.Test;

public class ContaTest {
	Conta conta;
	@Before
	public void setUp() throws Exception{
		conta = new Conta("BB", "6939", "000001", "6767", "1", 800.00, "Jõao Afonso", "Física", false);
	}
		
	@Test
	public void test() {
		assertEquals("BB, 6939, 000001, 6767, 1, 800.00, Jõao Afonso, Física, false", conta, 
	     new Conta("BB", "6939", "000001", "6767", "1", 800.00, "Jõao Afonso", "Física", false));
	}

}
