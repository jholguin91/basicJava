package gNumericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) {
		System.out.print("ingresa float1: "); // funcion para imprimir en consola
		float f = Input.get_float();

		System.out.print("ingresa float2: "); // funcion para imprimir en consola
		float f2 = Input.get_float();
		
		Input.print("f1/f2 = " + (f/f2));

	}

}
