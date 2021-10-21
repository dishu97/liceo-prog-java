package com.liceolapaz.des.agt;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Crear menú
		writeMenu();
		//Pedir una opción
		askOption();
		// Leer opción y almacenarla
		int option = readOption();
		// Escribir mensaje por pantalla
		writeMessage(option);
		// Generar número aleatorio
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
			message = "Opción 1 elegida\n"
					+ "por favor, diga un número del 1 al 10 ";
			break;
		
		case 2:
			message = "Opción 2 elegida ";
			break;
		default:
			message = "Opción no válida, por favor, escoja otra ";
			break;
			
		}
		
		System.out.print(message + ": ");
		
	}

	private static int readOption() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void askOption() {
		System.out.print("Por favor, escoja una opción: ");
		
	}

	private static void writeMenu() {
		System.out.println("ADIVINA EL NÚMERO\n"
				+ "1. Del 1 al 10 (3 intentos)\n"
				+ "2. Del 1 al 50 (5 intentos)\n"
				+ "0. Salir");
				
		
	}

}
