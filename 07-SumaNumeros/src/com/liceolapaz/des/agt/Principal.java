package com.liceolapaz.des.agt;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Pedir numeros al usuario
		askNumbers();
		// Crear variable para almacenar los números
		int[] numbers = new int[10];
		// Leer números
		int contador = 0;
		do {
			numbers[contador] = readNumber();
			contador++;
		} while (contador < 10);
		
		// Calcular suma y almacenarla
		int sum = calculateSum(numbers);
		// Escribir el resultado
		writeResult(sum);

	}

	private static void writeResult(int sum) {
		System.out.println("La suma de los números seleccionados es: " + (sum));
		
	}

	private static int calculateSum(int[] numbers) {
		int total = 0;
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i]; // total = total + numeros [i];
		}
		return total;
	}

	private static int readNumber() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void askNumbers() {
		System.out.println("Escriba 10 números enteros: ");
		
	}

}
