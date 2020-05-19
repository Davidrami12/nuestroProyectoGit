package nuestroProyecto.proyectoGit;




public class Fraccion {
	private int numerador;
	private int denominador;

	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}
/*
 * 	Añadir las siguientes operaciones a Fracción
 * 
 * 
 * 
	public static Fraccion simplifica(Fraccion entrada) {
	}
	
	public static Fraccion suma(Fraccion sumando1, Fraccion sumando2) {
	
	//comentario de David
	//comentario2
	}
	
	public static Fraccion multiplicacion(Fraccion sumando1, Fraccion sumando2) {
	
	}*/
	
	//faltan testear
	public static Fraccion suma(Fraccion sumando1, Fraccion sumando2) {
		
		Fraccion resultadoSum;
		
		int denominador = ((sumando1.denominador)*(sumando2.denominador));
		int numerador = ((sumando1.numerador)*(sumando2.denominador)) + ((sumando1.denominador)*(sumando2.numerador));
		
		resultadoSum = new Fraccion (numerador, denominador);
		
		return resultadoSum;
	}
	
	public static Fraccion division(Fraccion sumando1, Fraccion sumando2) {
		
		Fraccion resultadoDiv;
		
		int numerador = ((sumando1.numerador)*(sumando2.denominador));
		int denominador = ((sumando1.denominador)*(sumando2.numerador));
		
		resultadoDiv = new Fraccion (numerador, denominador);
		
		return resultadoDiv;
		
	}
	
	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}


	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(numerador).append(" / ").append(denominador);
		return sb.toString();
	}

}
