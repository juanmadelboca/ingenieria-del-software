package test.java;

import main.java.*;
import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class CalculadoraTest {
	@Test
	public void multiplicacion0Test() {
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("45");
		cola.add("*");
		cola.add("3");
		Calculadora c = new Calculadora(cola);
		assertTrue(c.getResultado() == 135);
	}

	@Test
	public void multiplicacion1Test() {
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("3");
		cola.add("*");
		cola.add("45");
		Calculadora c = new Calculadora(cola);
		assertTrue(c.getResultado() == 135);
	}

	@Test
	public void multiplicacion2Test() {
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("33");
		cola.add("*");
		cola.add("3");
		Calculadora c = new Calculadora(cola);
		assertFalse(c.getResultado() == 100);
	}

	@Test
	public void porcentaje0() {
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("10");
		cola.add("%");
		cola.add("200");
		Calculadora c = new Calculadora(cola);
		assertTrue(c.getResultado() == 10);
	}

	@Test
	public void porcentaje1() {
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("6");
		cola.add("%");
		cola.add("350");
		Calculadora c = new Calculadora(cola);
		assertTrue(c.getResultado() == 6);
	}

	@Test
	public void porcentaje2() {
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("350");
		cola.add("%");
		cola.add("40");
		Calculadora c = new Calculadora(cola);
		assertTrue(c.getResultado() == 30);
	}

	@Test
	public void division0Test() {
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("37");
		cola.add("/");
		cola.add("3");
		Calculadora c = new Calculadora(cola);
		assertFalse(c.getResultado() == 45);
	}

	@Test
	public void division1Test() {
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("19");
		cola.add("/");
		cola.add("2");
		Calculadora c = new Calculadora(cola);
		assertTrue(c.getResultado() == 9);
	}

	@Test
	public void division2Test() {
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("16");
		cola.add("/");
		cola.add("2");
		Calculadora c = new Calculadora(cola);
		assertTrue(c.getResultado() == 8);
	}

	@Test
	public void division3Test() {
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("2");
		cola.add("/");
		cola.add("2");
		Calculadora c = new Calculadora(cola);
		assertTrue(c.getResultado() == 1);
	}

	@Test
	public void nadaTest() {
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("2");
		Calculadora c = new Calculadora(cola);
		assertTrue(c.getResultado() == 2);
	}

	@Test
	public void sumaSimple() {
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("2");
		cola.add("+");
		cola.add("2");
		Calculadora c = new Calculadora(cola);
		assertTrue(c.getResultado() == 4);
	}

	@Test
	public void restaSimple() {
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("2");
		cola.add("-");
		cola.add("2");
		Calculadora c = new Calculadora(cola);
		assertTrue(c.getResultado() == 0);
	}

	@Test
	public void sumaCompleja() {
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("150");
		cola.add("+");
		cola.add("252");
		cola.add("+");
		cola.add("120");
		cola.add("+");
		cola.add("5");
		cola.add("+");
		cola.add("15");
		cola.add("+");
		cola.add("330");
		Calculadora c = new Calculadora(cola);
		assertTrue(c.getResultado() == 872);
	}

	@Test
	public void sumaCompleja1() {
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("9");
		cola.add("+");
		cola.add("22");
		cola.add("+");
		cola.add("1920");
		cola.add("+");
		cola.add("59");
		cola.add("+");
		cola.add("915");
		cola.add("+");
		cola.add("38");
		Calculadora c = new Calculadora(cola);
		assertFalse(c.getResultado() == 872);
	}

	@Test
	public void sumaCompleja1Test() {
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("9");
		cola.add("+");
		cola.add("22");
		cola.add("+");
		cola.add("1920");
		cola.add("+");
		cola.add("59");
		cola.add("+");
		cola.add("915");
		cola.add("+");
		cola.add("38");
		Calculadora c = new Calculadora(cola);
		assertFalse(c.getResultado() == 872);
	}

	@Test
	public void restaCompleja() {
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("150");
		cola.add("-");
		cola.add("252");
		cola.add("-");
		cola.add("120");
		cola.add("-");
		cola.add("5");
		cola.add("-");
		cola.add("15");
		cola.add("-");
		cola.add("330");
		Calculadora c = new Calculadora(cola);
		assertTrue(c.getResultado() == -572);
	}

	@Test
	public void sumRestSimple() {
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("4");
		cola.add("+");
		cola.add("2");
		cola.add("-");
		cola.add("2");
		Calculadora c = new Calculadora(cola);
		assertTrue(c.getResultado() == 4);
	}

	@Test
	public void sumRestCompleja1() {
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("1");
		cola.add("+");
		cola.add("2");
		cola.add("-");
		cola.add("33");
		cola.add("+");
		cola.add("12");
		cola.add("-");
		cola.add("66");
		cola.add("-");
		cola.add("3");
		Calculadora c = new Calculadora(cola);
		assertFalse(c.getResultado() == 0);
	}

	@Test
	public void sumRestCompleja() {
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("150");
		cola.add("+");
		cola.add("252");
		cola.add("-");
		cola.add("120");
		cola.add("+");
		cola.add("5");
		cola.add("-");
		cola.add("15");
		cola.add("-");
		cola.add("330");
		Calculadora c = new Calculadora(cola);
		assertTrue(c.getResultado() == -58);
	}

}