package com.liceolapaz.des.agt;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Escribir men�
		writeMenu();
		// Pedir opci�n
		askOption();
		// Leer opci�n y almacenarla
		int option = readOption();
		// Escribir mensaje por pantalla
		writeMessage(option);
	}

	private static void writeMessage(int option) {
		// Crear una variable para almacenar el mensaje
		String message = "";
		// Darle valor a la variable "message" en funci�n de la opci�n escogida
		switch (option) {
		case 0:
			System.exit(0);
			break;
			
		case 1:
			message = "Opci�n 1 elegida";
			break;
			
		case 2:
			message = "Opci�n 2 elegida";
			break;
			
		case 3:
			message = "Opci�n 3 elegida";
			break;

		default:
			message = "Opci�n no v�lida";
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
		System.out.print("Escoja una opci�n: ");	
	}

	private static void writeMenu() {
		System.out.println("MENU PRINCIPAL\n"
				+ "1. Opci�n 1\n"
				+ "2. Opci�n 2\n"
				+ "3. Opci�n 3\n"
				+ "0. Salir");
	}

}
