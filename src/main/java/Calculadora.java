package main.java;

import java.util.LinkedList;

public class Calculadora {

	private int resultado;

	public Calculadora(LinkedList<String> cola) {
		resultado = getNumber(cola.remove());
		String num = null;
		while (!cola.isEmpty()) {
			num = cola.remove();
			switch (esOperador(num)) {
			case 1:
				suma(getNumber(cola.remove()));
				break;
			case 2:
				resta(getNumber(cola.remove()));
				break;
			case 3:
				multiplicacion(getNumber(cola.remove()));
				break;
			case 5:
				porcentaje(getNumber(cola.remove()));
				break;
			case 0:
				System.out.println("Error de sincronismo en cola");
			}
		}
	}

	private void suma(int num) {

		resultado = resultado + num;
	}

	private void resta(int num) {

		resultado = resultado - num;
	}

	private void multiplicacion(int num) {
		resultado = resultado * num;
	}

	private void porcentaje(int num) {
		resultado = resultado % num;
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
		case "*":
			return 3;
		case "%":
			return 5;
		default:
			return 0;
		}
	}

	public int getResultado() {
		return resultado;
	}
}