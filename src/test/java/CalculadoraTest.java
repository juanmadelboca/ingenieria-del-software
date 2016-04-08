package test.java;
import main.java.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void suma() {
		Calculadora c=new Calculadora(1,1,"+");
		c.run();
		assertTrue(c.resultado==2);
	}
	
	@Test
	public void restaTest() {
		Calculadora c=new Calculadora(2,2,"-");
		c.run();
		assertTrue(c.resultado==0);
	}
	@Test
	public void sumaFranco() {
		Calculadora c=new Calculadora(2,2,"+");
		c.run();
		assertTrue(c.resultado==4);
	}
	@Test
	public void sumaJuanma() {
		Calculadora c=new Calculadora(3,2,"+");
		c.run();
		assertTrue(c.resultado==5);
	}
	

}