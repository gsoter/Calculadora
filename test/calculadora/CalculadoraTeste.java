package calculadora;

import calculadora.Calculadora;
import org.junit.*;
import static org.junit.Assert.*;

public class CalculadoraTeste {

	Calculadora c;

	@Before
	public void testeIniciar() {
		c = new Calculadora();
	}

	@Test
	public void testeSomarInteiros() {
		String num1 = "10", num2 = "10";
		assertEquals(20, c.somar(num1, num2));
	}

	@Test
	public void testeSomarNegativos() {
		String num1 = "-10", num2 = "-10";
		assertEquals(-20, c.somar(num1, num2));
	}

	@Test(expected=NumberFormatException.class)
	public void testeSomarLetras() {
		String param1 = "ABC", param2 = "DEF";
		c.somar(param1, param2);
	}

	@Test
	public void testeDividirInteiros() {
		String num1 = "20", num2 = "2";
		assertTrue((c.dividir(num1, num2) == 10.0));
	}

	@Test
	public void testeDividirNegativos() {
		String num1 = "-40", num2 = "-2";
		assertTrue(c.dividir(num1, num2) == 20.0);
	}

	@Test(expected = NullPointerException.class)
	public void testeRaizNulo() {
		String num1 = null;
		c.raizQuadrada(num1);
	}

	@Test
	public void testeRaizDecimais() {
		String num1 = "25";
		assertTrue(c.raizQuadrada(num1) == 5.0);
	}

	@After
	public void testeFinalizar() {
		c = null;
		System.gc();
	}
}
