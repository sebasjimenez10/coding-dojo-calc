package codigo;

public class Calculadora {

	public int realizarOperacion(int operando1, int operando2, String operador) {
		//Escribir el minimo codigo posible para que la prueba pase.
		if( operador.equals("+") ){
			return operando1 + operando2;
		}else if ( operador.equals("-") ){
			return operando1 - operando2;
		}else{
			return operando1 / operando2;
		}
	}

}