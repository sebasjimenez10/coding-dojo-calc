package test;

import org.junit.Assert;
import org.junit.Test;

import codigo.Calculadora;

public class CalculadoraTest {

	@Test
	public void realizarOperacion1() {
		
		int operando1 = 5;
		int operando2 = 1;
		String operador = "+";
		Calculadora calc = new Calculadora();
		int resultado = 6;
		
		realizarOperacion(operando1, operando2, operador, resultado);
		
	}
	
	@Test
	public void realizarOperacion2(){
		
		int operando1 = 1;
		int operando2 = 2;
		String operador = "+";
		int resultado = 3;
		
		realizarOperacion(operando1, operando2, operador, resultado);
	}

	@Test
	public void realizarOperacion3(){
		
		int operando1 = 187;
		int operando2 = 3;
		String operador = "+";
		int resultado = 190;
		
		realizarOperacion(operando1, operando2, operador, resultado);
		
	}
	
	@Test
	public void realizarOperacion4(){
		
		int operando1 = 5;
		int operando2 = 1;
		String operador = "-";
		int resultado = 4;
		
		realizarOperacion(operando1, operando2, operador, resultado);
		
	}
	
	@Test
	public void realizarOperacion5(){

		int operando1 = 10;
		int operando2 = 3;
		String operador = "-";
		int resultado = 7;
		
		realizarOperacion(operando1, operando2, operador, resultado);
	}
	
	@Test
	public void realizarOperacion6(){

		int operando1 = 10;
		int operando2 = 2;
		String operador = "/";
		int resultado = 5;
		
		realizarOperacion(operando1, operando2, operador, resultado);
		
	}
	
	@Test
	public void realizarOperacion7(){
		
		int operando1 = 4;
		int operando2 = 9;
		String operador = "*";
		int resultado = 36;
		
		realizarOperacion(operando1, operando2, operador, resultado);
		
	}
	
	private void realizarOperacion(int operando1, int operando2,
			String operador, int resultadoEsperado){
		
		//Arrange
		Calculadora calc = new Calculadora();
		
		//Act
		int resultado = calc.realizarOperacion(operando1, operando2, operador);
		
		//Assert
		Assert.assertEquals(resultado, resultadoEsperado);
	}
	
}
