package Testes;
import model.Movimento;
import static org.junit.Assert.*; 

import org.junit.Before;
import org.junit.Test;

public class MovimentoTest {
	Movimento mov;
	@Before
	public void setUp() throws Exception{
		mov = new Movimento( 200, "6939", "11111", 1001, 'F',
				 "22/02/2015", "8h", "Teste", 900, "800");
	}
	@Test
	public void test() {
		assertEquals("200, 6939, 11111, 1001, F, 22/02/2015, 8h, Teste, 900, 800", mov, new Movimento(
				200, "6939", "11111", 1001, 'F',"22/02/2015", "8h", "Teste", 900, "800") );
	}

}
