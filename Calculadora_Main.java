package calculadora_UTN;

public class Calculadora_Main {
	

	
	
	
	public static void main(String[] args) {
		Calculadora calcu = new Calculadora (0, 0 , 'q' );
		calcu.ingrDeDatos();
		calcu.hacerCuenta();
		calcu.mostrarResultado();
		
//		System.out.println(calcu.getPrimNumIngresado() +"segunod    "+ calcu.getSegNumIngrado()+"oper   "+ calcu.getOperador());

	}

}
