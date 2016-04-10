package main.java;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	private static Scanner s;

	public static void main(String[] args) {
		while (true) {
			s = new Scanner(System.in);
			Lectora lect = new Lectora();
			lect.leer();
			LinkedList<String> cola = new LinkedList<String>(lect.getCola());
			Calculadora calc = new Calculadora(cola);
			System.out.println("El resultado es:" + calc.getResultado());
			System.out.println("Desea hacer otra operacion? y/n");
			if (s.next().equals("n"))
				break;
		}

	}
}