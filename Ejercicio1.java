package clase1;
//1. Vamos a practicar operaciones básicas con números
//a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
//y “b”. Su código puede arrancar (por ejemplo):
//int numeroInicio = 5;
//int numeroFin = 14;
//// Se deberían mostrar los números:
//5,6,7,8,9,10,11,12,13,14
//b. A lo anterior, solo muestre los números pares
//c. A lo anterior, con una variable extra, elija si se deben mostrar los números
//pares o impareslizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden


public class Ejercicio1 {
	
	public static void main(String[] args) {
		int numInc = 5;
		int numFin = 14;
		boolean par  =true;
		
		while (numInc <= numFin ) {
			if (numInc% 2 == 0 && par == true) {
			System.out.println(numInc);}
			
			else if(numInc % 2 != 0 && par ==false){
				System.out.println(numInc);
			}
			
			numInc++;
	}
//		for (int i = numFin; i >= numInc ; i-- ) {
//			System.out.println(i +"hhhhhhhhhhhh");
//			if (i% 2 == 0 && par == true) {
//			System.out.println(i);}
//			
//			else if(i % 2 != 0 && par == false){
//				System.out.println(i);
//			}
//
//		}
		

	}}
