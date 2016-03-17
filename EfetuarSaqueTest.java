package Testes;
import model.EfetuarSaque;
import static org.junit.Assert.*; 

import org.junit.Before;
import org.junit.Test;

public class EfetuarSaqueTest {
	EfetuarSaque saque;
	@Before
	public void setUp() throws Exception
	{
		saque = new EfetuarSaque(900, "11111", "89882");
	}
	@Test
	public void test() {
		assertEquals("900, 11111, 89882", saque, new EfetuarSaque(900, "11111", "89882"));
	}

}
