package com.liceolapaz.des.agt;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Crear men�
		writeMenu();
		//Pedir una opci�n
		askOption();
		// Leer opci�n y almacenarla
		int option = readOption();
		// Escribir mensaje por pantalla
		writeMessage(option);
		// Generar n�mero aleatorio
		generateRandomNumber();
		

	}

	private static void generateRandomNumber() {
		int min = 1;
		int max = 10;
		
		System.out.println();
			
		
	}

	private static void writeMessage(int option) {
		// Crear una variable para almacenar el mensaje
		String message = "";
		// Darle valor a la variable message en funcion de la opcion escogida
		switch(option) {
		case 0:
			System.exit(0);
			break;
			
		case 1:
			message = "Opci�n 1 elegida\n"
					+ "por favor, diga un n�mero del 1 al 10 ";
			break;
		
		case 2:
			message = "Opci�n 2 elegida ";
			break;
		default:
			message = "Opci�n no v�lida, por favor, escoja otra ";
			break;
			
		}
		
		System.out.print(message + ": ");
		
	}

	private static int readOption() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void askOption() {
		System.out.print("Por favor, escoja una opci�n: ");
		
	}

	private static void writeMenu() {
		System.out.println("ADIVINA EL N�MERO\n"
				+ "1. Del 1 al 10 (3 intentos)\n"
				+ "2. Del 1 al 50 (5 intentos)\n"
				+ "0. Salir");
				
		
	}

}
