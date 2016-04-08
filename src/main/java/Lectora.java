package main.java;

import java.util.Scanner;
import java.util.Stack;

public class Lectora {

	private Stack<String> pila;
	private Scanner s;

	public Lectora() {
		pila = new Stack<String>();
	}

	public void leer() {
		boolean salir = false;
		s = new Scanner(System.in);
		while (!salir) {
			do {
				System.out.println("Ingrese el numero");
				pila.push(s.next());
				if (esNum(pila.peek()))
					break;
				System.out.println("Error: Ingreso incorrecto");
				pila.pop();
			} while (true);
			do {
				System.out.println("Ingrese el operador o = para finalizar");
				pila.push(s.next());
				if (pila.peek().equals("=")) {
					salir = true;
					pila.pop();
					break;
				} else if (esValido(pila.peek()))
					break;
				System.out.println("Error: Ingreso incorrecto");
				pila.pop();
			} while (true);
		}
	}

	private static boolean esValido(String s) {
		if (s.equals("+") || s.equals("-"))
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

	public Stack<String> getPila() {
		return pila;
	}

}
