package nuestroProyecto.proyectoGit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FraccionTest {

	//test metodo division
	@ParameterizedTest
	@CsvSource(value = {"2,5,3,4,8,15", "4,3,1,3,4,1", "1,4,1,5,5,4", "1,2,3,4,2,3", "3,7,9,14,2,3"})
	public void divisionTest(int numerador1, int denominador1, int numerador2, int denominador2, int numeradorR, int denominadorR) {
	
		Fraccion sumando1 = new Fraccion(numerador1, denominador1);
		Fraccion sumando2 = new Fraccion(numerador2, denominador2);
		
		assertEquals(numeradorR, Fraccion.division(sumando1, sumando2).getNumerador());
		assertEquals(denominadorR, Fraccion.division(sumando1, sumando2).getDenominador());
	}
	
	
	//test metodo suma
	@ParameterizedTest
	@CsvSource(value = {"1,2,1,4,3,4", "0,1,0,1,0,1", "1,4,1,4,1,2"})
	public void sumaTest(int numerador1, int denominador1, int numerador2, int denominador2, int numeradorR, int denominadorR) {
	
		Fraccion sumando1 = new Fraccion(numerador1, denominador1);
		Fraccion sumando2 = new Fraccion(numerador2, denominador2);
		
		assertEquals(numeradorR, Fraccion.suma(sumando1, sumando2).getNumerador());
		assertEquals(denominadorR, Fraccion.suma(sumando1, sumando2).getDenominador());
	}
	
	
	
	
}
