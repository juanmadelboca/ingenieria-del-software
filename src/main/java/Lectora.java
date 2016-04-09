package main.java;

import java.util.Scanner;
import java.util.LinkedList;

public class Lectora {

	private LinkedList<String> cola;
	private Scanner s;

	public Lectora() {
		cola= new LinkedList<String>();
	}

	public void leer() {
		boolean salir = false;
		s = new Scanner(System.in);
		while (!salir) {
			do {
				System.out.println("Ingrese el numero");
				cola.add(s.next());
				if (esNum(cola.getLast()))
					break;
				System.out.println("Error: Ingreso incorrecto");
				cola.removeLast();
			} while (true);
			do {
				System.out.println("Ingrese el operador o = para finalizar");
				cola.add(s.next());
				if (cola.getLast().equals("=")) {
					salir = true;
					cola.removeLast();
					break;
				} else if (esValido(cola.getLast()))
					break;
				System.out.println("Error: Ingreso incorrecto");
				cola.removeLast();
			} while (true);
		}
	}

	private boolean esValido(String s) {
		if (s.equals("+") || s.equals("-")|| s.equals("*"))
			return true;
		else
			return false;
	}

	private boolean esNum(String num) {
		try {
			Integer.parseInt(num);
			return true;
		} catch (NumberFormatException nfe) {
		}
		return false;
	}

	public LinkedList<String> getCola() {
		return cola;
	}

}
