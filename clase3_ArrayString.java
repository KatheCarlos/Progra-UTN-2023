package clase1;

import java.util.Scanner;

public class clase3_ArrayString {
//a)
static int cantLetraString (String palabra, char l){
    int cont =0 ;
    for (int i = 0; i < palabra.length(); i ++){

        if (palabra.charAt(i) == l) {
            cont ++;
        }
    }
    return cont;


}
// b) Dados 3 números  y un orden (ascendente o decreciente) 
//que ordene los mismos y los retorne en un vector de 3
public static int elNumMayorDeTres(int num1,int num2,int num3){

    if (num1 > num2 && num1 > num3) {
           return num1;       
    
       }else if(num2 > num3 && num2 > num1) {

            return  num2;         
       }
      return num3;
}
public static int elNumMenorDeTres (int num1, int num2,int num3){

    if (num1 < num2 && num1< num3) {
        return num1;       
 
    }else if(num2 < num3 && num2 < num1) {

         return  num2;         
    }
   return num3;
}
public static int elNumDelMedio (int[]vect ,int num ,int num2,int num3) {
		
		if ((vect[0] == num && vect[2]== num2)||(vect[0] == num2 && vect[2]== num )) {
			return num3;

		}else if  ((vect[0] == num2 && vect[2]== num3) ||(vect[0] == num3 && vect[2]== num2 )) {
			return num;
		}else {
			return num2;
			}
		
}
public static int [] vectorOrdenado (int num ,int num2,int num3, char l) {
		int [] vector = new int [3] ;
		
		if (l =='a' || l =='d') {
	
		
			if (l == 'd') {
			vector [0]= elNumMayorDeTres(num, num2, num3);
			vector [2] = elNumMenorDeTres(num, num2, num3);
			vector [1] = elNumDelMedio (vector, num,num2, num3);
			}else if (l =='a') {
				vector [0]= elNumMenorDeTres(num, num2, num3);
				vector [2] = elNumMayorDeTres(num, num2, num3);
				System.out.println(elNumMayorDeTres(num, num2, num3)+"ppppppppppppppp");
				vector [1] = elNumDelMedio (vector, num,num2, num3);
			}
		}else {
			
			System.out.println("Ingreso de letra incorrecta \nIngrese: 'a' o 'd' ");
			vector[0]=0;
			vector[1]=0;
			vector[2]=0;
			return vector;
		}
		return vector;
} 
//c)
//dado un vector de números, y un número X, que sume 
//todo los números > X y retorne el resultado
public static int sumaDeNumsMayorX (int[]vector ,int x) {
	int suma =0;
	for (int i = 0; i <vector.length; i++) {
		if (vector[i] >x ) {
			suma = suma + vector[i];
		}
	}
	return suma;	
}
//2)
//Genere una clase, utilice el método Split para separar una lista de 10 nombres
//	tomados de una variable, luego muestre por consola el resultado. 
public static void mostrarNombre (String lista){

        String listaNom= lista;
        String [] nombres;
        nombres = listaNom.split(";");
        System.out.print("ej2 [");
        for (int i = 0; i < nombres.length-1;i++){
            System.out.print( nombres[i] +",");
        }
        System.out.print( nombres[nombres.length-1]);
}




	public static void main(String[] args) {
		
		System.out.println("ejA "+ cantLetraString("programacion", 'a'));
		
		
	
		int [] ejB = vectorOrdenado(45, 25, 50,'d');
		 System.out.print( "ejB [ " );
		for (int i =0; i < ejB.length-1 ; i ++) {	 
			  System.out.print(ejB[i]+", " );	
		}
		  System.out.println( ejB[ejB.length-1]+ "]");
		  
		  
		  
		  
		int [] ejC = {45,1,60};
		System.out.println("ejC "+sumaDeNumsMayorX(ejC,10));

		String ej2= "katherine;stephanie,maria";
		 mostrarNombre(ej2);
	}
}

