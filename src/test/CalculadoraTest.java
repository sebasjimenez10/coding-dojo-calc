package test;

import org.junit.Assert;
import org.junit.Test;

import codigo.Calculadora;

public class CalculadoraTest {

	@Test
	public void realizarOperacion1() {
		
		//ARRANGE
		int operando1 = 5;
		int operando2 = 1;
		String operador = "+";
		Calculadora calc = new Calculadora();
		
		//ACT
		int resultado = calc.realizarOperacion(operando1, operando2, operador);
		
		//ASSERT
		Assert.assertTrue( resultado == 6 );
		
	}
	
	@Test
	public void realizarOperacion2() {
		
		//ARRANGE
		int operando1 = 10;
		int operando2 = 3;
		String operador = "+";
		Calculadora calc = new Calculadora();
		
		//ACT
		int resultado = calc.realizarOperacion(operando1, operando2, operador);
		
		//ASSERT
		Assert.assertTrue( resultado == 13 );
		
	}
	
	@Test
	public void realizarOperacion3() {
		
		//ARRANGE
		int operando1 = 5;
		int operando2 = 3;
		String operador = "-";
		Calculadora calc = new Calculadora();
		
		//ACT
		int resultado = calc.realizarOperacion(operando1, operando2, operador);
		
		//ASSERT
		Assert.assertTrue( resultado == 2 );
		
	}
	
	@Test
	public void realizarOperacion4() {
		
		//ARRANGE
		int operando1 = 20;
		int operando2 = 4;
		String operador = "/";
		Calculadora calc = new Calculadora();
		
		//ACT
		int resultado = calc.realizarOperacion(operando1, operando2, operador);
		
		//ASSERT
		Assert.assertTrue( resultado == 5 );
		
	}
	
	@Test
	public void realizarOperacion5() {
		
		//ARRANGE
		int operando1 = 20;
		int operando2 = 4;
		String operador = "*";
		Calculadora calc = new Calculadora();
		
		//ACT
		int resultado = calc.realizarOperacion(operando1, operando2, operador);
		
		//ASSERT
		Assert.assertTrue( resultado == 80 );
		
	}
	
}
