package clase1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class clase4_ProgramacionArchivos {

//1)	
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

	
	public static int ingresoConsolaInt (){
	    int num ;
	    

	        Scanner scan =new Scanner(System.in);
	        System.out.println("ingrese un num: ");
	        num = scan.nextInt();
	        return num; 
	        
	}      

	public static String ingresoConsolaString (){
	     String letra;
	     System.out.println("Ingrese una  LETRA, 'a' o 'd' ");
	    Scanner scan =new Scanner(System.in);
	    return letra =  scan.next();
	}
	

	
//2)	
	private static void cuentaArchivo(String ruta, char l) {

		try {

		for(String archivo : Files.readAllLines(Paths.get(ruta))) {

		System.out.println("Ej2 "+ archivo);

		}
		if (l == '+') {

		int sumaValores= sumaValores(ruta);

		System.out.println("Ej2 La suma es: "+ sumaValores);
		}else if (l=='*') {
			int mulNum= multiValores(ruta);

			System.out.println("Ej2 La multiplicacion de los num es: "+ mulNum);
			
		}
		} catch (IOException e) {

		// TODO Auto-generated catch block

		System.out.println("Ej2 El archivo no exixte");;

		}

		}


	public static int sumaValores(String datosArchivo) throws FileNotFoundException {

		File archivo = new File(datosArchivo);

		int sumaInt=0;

		Scanner sumaNumeros = new Scanner(archivo);

		while (sumaNumeros.hasNextInt()) {

		sumaInt = sumaInt + sumaNumeros.nextInt();

		}

		return sumaInt;

		}
		
		
		public static int multiValores(String datosArchivo) throws FileNotFoundException {

		File archivo = new File(datosArchivo);

		int mulInt =1;

		Scanner mulNum = new Scanner(archivo);

		while (mulNum.hasNextInt()) {
		
		mulInt = mulInt * mulNum.nextInt();

		}

		return mulInt;

		}


//3)
		public static String ingresarNom() {

			Scanner nombre = new Scanner(System.in);
			System.out.println("Ingrese los nombres separados por una \";\" - para finalizar presione Enter: ");

			String nom = nombre.nextLine();
			return nom;

		}

	public static Path escribirNomArch(String nombres) throws IOException {

		

		Path ruta = Paths.get("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Progra UTN\\clase4_StringNum.txt");



		Files.write(ruta, nombres.getBytes() );

		return ruta;

		}
	private static void mostrarNomArch(Path ruta) throws IOException {

			List < String > ContenidoArchivo = Files.readAllLines(ruta, StandardCharsets.UTF_8);
			ContenidoArchivo.forEach(line -> System.out.println(line));		

		}




		
	    public static void main(String[] args) throws IOException {
	        int num1,num2,num3;
	        
//	   //a)
//	        char ordenA = 'a';
//	        num1 = 2;
//	        num2 = 81;
//	        num3 = 35;
//	        int [] vec = vectorOrdenado(num1, num2, num3, ordenA);
//	        for (int i = 0 ; i < vec.length; i++) {
//	        	System.out.println("ejA "+ vec[i]);
//	        }
//	        			        
//	 //B)
//	        String or ;
//	        char orden;
//	        System.out.println("Los numeros ingresados tiene que ser mayores que 0");
//	        Scanner scan = new Scanner (System.in);
//	        System.out.println("Ingrese un numero");
//	        num1 = scan.nextInt();
//	        Scanner scan2 = new Scanner (System.in);
//	        System.out.println("Ingrese un numero");
//	        num2 = scan2.nextInt();	        
//	        Scanner scan3 = new Scanner (System.in);
//	        System.out.println("Ingrese un numero");
//	        num3 = scan3.nextInt();
//	        
//	        Scanner ord = new Scanner (System.in);
//	        System.out.println("Ingrese un 'a' o 'd'");
//	        or = ord.next();
//	        orden = or.charAt(0);
//	        int [] ejB = vectorOrdenado(num1, num2, num3, orden);
//	        
//	        for (int i = 0 ; i < ejB.length; i++) {
//        	System.out.println("ejB "+ ejB[i]);
//        }
//	    
	        
	       
//// C) 
//	        int [] ejC = new int[3];
//	        ejC[0]=10;
//	        String or="";
//	        char orden;
//	        for (int i =0; i< ejC.length;i++) {
//	        	if (ejC[i] == 0) {
//	    	      ejC[i] = ingresoConsolaInt()
//;	        	}
//	        }
//	        if (or.equals("")) {
//		      
//		        or = ingresoConsolaString();  	
//	        }
//	        orden = or.charAt(0);
//	        ejC = vectorOrdenado(ejC[0], ejC[1],ejC[2],orden );
//	        
//	        for (int i = 0 ; i < ejC.length; i++) {
//        	System.out.println("ejB "+ ejC[i]);
//        }
	        
	        
	        
	 //2)_3) 
	        String ruta = "C:\\Users\\Usuario\\OneDrive\\Escritorio\\Progra UTN\\clase4_int.txt";
	        char operacion = '*';
	        cuentaArchivo(ruta,operacion);
//	        
//	        Path ruta2 =  escribirNomArch(ingresarNom());
//	      
//	        mostrarNomArch(ruta2);
	   
	    }
	}


