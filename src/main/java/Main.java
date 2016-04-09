package main.java;

import java.util.Scanner;

public class Main {

	private static Scanner s;

	public static void main(String[] args) {
		while (true) {
			s = new Scanner(System.in);
			Lectora lect = new Lectora();
			lect.leer();
			Calculadora calc = new Calculadora(lect.getCola());
			System.out.println("El resultado es:" + calc.getResultado());
			System.out.println("Desea hacer otra operación? y/n");
			if (s.next().equals("n"))
				break;
		}

	}
}