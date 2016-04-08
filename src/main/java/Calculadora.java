package main.java;

import java.util.Stack;

public class Calculadora {

	private int resultado;

	public Calculadora(Stack<String> pila) {
		resultado = getNumber(pila.pop());
		String num = null;
		while (!pila.empty()) {
			num = pila.pop();
			switch (esOperador(num)) {
			case 1:
				suma(getNumber(pila.pop()));
				break;
			case 2:
				resta(getNumber(pila.pop()));
				break;
			case 0:
				System.out.println("Error de sincronismo en Pila");
			}
		}
	}

	private void suma(int num) {

		resultado = resultado + num;
	}

	private void resta(int num) {

		resultado = resultado - num;
	}

	private int getNumber(String num) {
		return Integer.parseInt(num);
	}

	private int esOperador(String num) {
		switch (num) {
		case "+":
			return 1;
		case "-":
			return 2;
		default:
			return 0;
		}
	}

	public int getResultado() {
		return resultado;
	}
}