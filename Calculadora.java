package calculadora_UTN;

import java.util.Scanner;

public class Calculadora {

	private double primNumIngresado;
	private double segNumIngrado;
	private char operador;
	private double resultado; // motrar la cuenta que hace 
	private boolean seguirCalculado;
	private boolean borrar;
	
	

	public Calculadora ( double primNumIngresado, double segNumIngrado, char operador){
	
		this.primNumIngresado = primNumIngresado;
		this.segNumIngrado = segNumIngrado;
		this.operador = operador;
		this.resultado = 0;
	}
	


	public  void ingrDeDatos (){
	
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese la cuenta separada por \" \" ");
		String [] cuenta = scan.nextLine().split(" ");;
		String num = cuenta[0]; 
		char oper = cuenta[1].charAt(0); 
		this.operador = oper;
		String num2 = cuenta[2]; 
		double primNumIngresado = Double.parseDouble(num);
		this.primNumIngresado = primNumIngresado ; 
		double segNumIngrado = Double.parseDouble(num2);
		this.segNumIngrado = segNumIngrado ; 
		
		scan.close();
	}
	
//	public void ingresarOperador (){
//	
//		Scanner scan2 = new Scanner (System.in);
//		System.out.println("Ingrese el operador(--------------)" );//BUSCAR CAMBIO DE LETRA
//		String oper= scan2.nextLine ();
//		this.operador= oper.charAt(0);     //indexOf(0); // usar los set 
//		scan2.close();
//	}
//
//
//
//
//	public  void ingrsegundoNum (){
//	
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Ingrese otro numero:  ");//BUSCAR CAMBIO DE LETRA
//		String segNum = scan.nextLine ();
//		double segNumIngrado = Double.parseDouble(segNum);/// PARSENINT 
//		this.segNumIngrado= segNumIngrado;
//		scan.close();
//	}
	public void hacerCuenta() {
		if (this.operador == '+') {
			
			this.resultado =  sumar(this.primNumIngresado, this.segNumIngrado);
			
		}
		else if (this.operador == '-') {
			this.resultado =  restar(this.primNumIngresado, this.segNumIngrado);
		}
		else if (this.operador == '*') {
			this.resultado =  multiplicar(this.primNumIngresado, this.segNumIngrado);
		}else {
				this.resultado =  dividir(this.primNumIngresado, this.segNumIngrado);
		}

	}


	public void mostrarResultado (){
		System.out.println("El resultado de " + this.primNumIngresado +" "+this.operador+" "+
				this.segNumIngrado +" = " + this.resultado);	
}




	
	
	public static double sumar (double primNumIngresado, double segNumIngrado){
	
//		this.resultado = primNumIngresad + seguNumIngresado;
		return primNumIngresado + segNumIngrado;
	}
	
	
	public static double restar(double primNumIngresado, double segNumIngrado){
	
//		this.resultado = primNumIngresad - seguNumIngresado;
		return primNumIngresado - segNumIngrado;
	}
	
	
	public static double multiplicar(double primNumIngresado, double segNumIngrado){
	
//		this.resultado = primNumIngresado * segNumIngrado;
		return  primNumIngresado * segNumIngrado;
	}
	
	
	public static double dividir(double primNumIngresado, double segNumIngrado){
	
//		this.resultado = primNumIngresado / segNumIngrado;
		return primNumIngresado / segNumIngrado;
	}
	
	
	
	
	


	
	
	
	
	
	
	
	
	public double getPrimNumIngresado() {
		return primNumIngresado;
	}



	public void setPrimNumIngresado(double primNumIngresado) {
		this.primNumIngresado = primNumIngresado;
	}



	public double getSegNumIngrado() {
		return segNumIngrado;
	}



	public void setSegNumIngrado(double segNumIngrado) {
		this.segNumIngrado = segNumIngrado;
	}



	public char getOperador() {
		return operador;
	}



	public void setOperador(char operador) {
		this.operador = operador;
	}



	public double getResultado() {
		return resultado;
	}



	public void setResultado(double resultado) {
		this.resultado = resultado;
	}



	public boolean isSeguirCalculado() {
		return seguirCalculado;
	}



	public void setSeguirCalculado(boolean seguirCalculado) {
		this.seguirCalculado = seguirCalculado;
	}


			 
		
}
