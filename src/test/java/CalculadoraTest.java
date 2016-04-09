package test.java;
import main.java.*;
import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void sumaSimple() {
		LinkedList<String> cola= new LinkedList<String>();
		cola.add("2");
		cola.add("+");
		cola.add("2");
		Calculadora c=new Calculadora(cola);
		assertTrue(c.getResultado()==4);
	}
	
	@Test
	public void restaSimple() {
		LinkedList<String> cola= new LinkedList<String>();
		cola.add("2");
		cola.add("-");
		cola.add("2");
		Calculadora c=new Calculadora(cola);
		assertTrue(c.getResultado()==0);
	}
	@Test
	public void sumaCompleja() {
		LinkedList<String> cola= new LinkedList<String>();
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
		Calculadora c=new Calculadora(cola);
		assertTrue(c.getResultado()==872);
	}
	@Test
	public void restaCompleja() {
		LinkedList<String> cola= new LinkedList<String>();
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
		Calculadora c=new Calculadora(cola);
		assertTrue(c.getResultado()==-572);
	}
	@Test
	public void sumRestSimple() {
		LinkedList<String> cola= new LinkedList<String>();
		cola.add("4");
		cola.add("+");
		cola.add("2");
		cola.add("-");
		cola.add("2");
		Calculadora c=new Calculadora(cola);
		assertTrue(c.getResultado()==4);
	}
	@Test
	public void sumRestCompleja() {
		LinkedList<String> cola= new LinkedList<String>();
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
		Calculadora c=new Calculadora(cola);
		assertTrue(c.getResultado()==-58);
	}

}