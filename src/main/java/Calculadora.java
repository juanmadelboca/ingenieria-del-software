package main.java;


public class Calculadora implements Runnable {
	
	private int a;
	private int b;
	private String operacion;
	public int resultado=0;
	
	public Calculadora(int a, int b, String operacion) {
		this.a = a;
		this.b = b;
		this.operacion = operacion;
	}

	@Override
	public void run() {
		switch(operacion){
		
		case "+" :
			System.out.println("resultado de la suma = "+ suma(a,b));
			
			break;
		
		case "-" :
			System.out.println("resultado de la resta = "+ resta(a,b));		
			break;
		default:
			System.out.println("no es un feature disponible actualice a la nueva version");
		
		}
	}

	private int suma(int a,int b){
		
		this.resultado=a+b;
		return resultado;
	}
	
	private int resta(int a,int b){
		
		this.resultado=a-b;
		return resultado;
	}
}