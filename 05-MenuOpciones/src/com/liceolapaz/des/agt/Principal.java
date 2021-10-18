package com.liceolapaz.des.agt;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Escribir menú
		writeMenu();
		// Pedir opción
		askOption();
		// Leer opción y almacenarla
		int option = readOption();
		// Escribir mensaje por pantalla
		writeMessage(option);
	}

	private static void writeMessage(int option) {
		// Crear una variable para almacenar el mensaje
		String message = "";
		// Darle valor a la variable "message" en función de la opción escogida
		switch (option) {
		case 0:
			System.exit(0);
			break;
			
		case 1:
			message = "Opción 1 elegida";
			break;
			
		case 2:
			message = "Opción 2 elegida";
			break;
			
		case 3:
			message = "Opción 3 elegida";
			break;

		default:
			message = "Opción no válida";
			break;
		}
		
		// Escribir ese mensaje por pantalla
		System.out.println(message);
		
	}

	private static int readOption() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	private static void askOption() {
		System.out.print("Escoja una opción: ");	
	}

	private static void writeMenu() {
		System.out.println("MENU PRINCIPAL\n"
				+ "1. Opción 1\n"
				+ "2. Opción 2\n"
				+ "3. Opción 3\n"
				+ "0. Salir");
	}

}
