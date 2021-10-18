package com.liceolapaz.des.agt;

import java.util.Scanner;

public class Principal {
	private static final int actualYear = 20;

	public static void main(String[] args) {
		// Pedir a�o de nacimiento
		askYear();
		// Leer a�o y almacenarlo
		int year = readYear();
		// Escribir mensaje
		writeMessage(year);
	}

	private static void writeMessage(int year) {
		// Crear una variable para almacenar el mensaje
		String message = "";
		// Comprobar "year" y almacenar mensaje en la variable
		if (year > 2021) {
			message = "Este a�o est� en el futuro";
		} else if (2021 - year > 150) {
			message = "Deber�as estar muerto";
		} else if (2021 - year >= 18) {
			message = "Puede pasar";
		} else {
			message = "No puede pasar";
		}
		// Escribir mensaje por pantalla
		System.out.println(message);
	}

	private static int readYear() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void askYear() {
		System.out.println("Escriba su a�o de nacimiento: ");

	}

}
