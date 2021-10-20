package com.liceolapaz.des.agt;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Pedimos al usuario el número a usar
		askNumber();
		// Leemos el número a buscar y o almacenamos
		int searchNumber = readAllNumber();
		// Pedimos al usuario el numero maximo de intentos
		askMaxTries();
		// Leemos el numero maximo de intentos y lo almacenamos
		int maxTries = readAllNumber(); 
		// Almacenar número de intentos
		int triesNumber = 0;
		while (triesNumber < maxTries) {
		// Generar numero aleatorio y almacenarlo
		int randomNumber = generateRandomNumber(1, 10);		
		// Imprimir el número generado
		System.out.println("El número generado es: " + randomNumber);
		// Sumar 1 a los intentos
		triesNumber++; //numeroIntentos = numeroIntentos
		// Comprobar si el numero generado es igual al numero buscado
		checkNumber(searchNumber, randomNumber, triesNumber, maxTries);
		// Si econtramos el número salir del programa
		if (triesNumber == searchNumber) {
			break;
		}
		}
		
	}

	private static void checkNumber(int searchNumber, int randomNumber, int triesNumber, int maxTries) {
		// Si lo es, imprimir mensaje
		if (searchNumber == randomNumber) {
			System.out.println("Número encontrado en " + triesNumber + " intento(s)");
		}
		// Si no lo es y hay mas intentos, repetir
		
		else if (triesNumber < maxTries) {
			return;
		}
			
		// Si no hay mas intentos, escrbir mensaje
		else {
			System.out.println("No se ha podido encontrar el número en " + maxTries + " intento(s)");		}
		
	}

	private static int generateRandomNumber(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min) + min;
	}

	private static void askMaxTries() {
		System.out.print("Escriba el número máximo de intentos: ");
		
	}

	private static int readAllNumber() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void askNumber() {
		System.out.print("Introduzca el número deseado (1-10): ");
		
	}

}
