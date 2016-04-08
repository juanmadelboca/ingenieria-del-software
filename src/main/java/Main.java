package main.java;
import java.util.Scanner;

public class Main {

	private static Scanner s;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a,b;
		String operacion;
		
		boolean salir=false;
		do{
			s = new Scanner(System.in);
			System.out.println("ingrese a");
			a=s.nextInt();
			while(true){
			System.out.println("ingrese operacion");
			operacion=s.next();
			if(esValido(operacion))
				break;
				}
			System.out.println("ingrese b");
			b=s.nextInt();
			
			Calculadora c=new Calculadora(a,b,operacion);
			c.run();
		    
		    
			
			

		}while(!salir);
	}
	public static boolean esValido(String s){
		if(s.equals("+")||s.equals("*")||s.equals("/")||s.equals("-"))
		return true;
		else return false;
	}

}