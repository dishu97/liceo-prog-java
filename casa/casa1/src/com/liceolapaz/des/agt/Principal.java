package com.liceolapaz.des.agt;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Pedirle el nombre al usuario
		askName();
		//Leer el nombre y almacenarlo
		String username = readName();
		//Escribir el saludo
		writeName(username);

	}

	private static void writeName(String username) {
		System.out.println("Hola " + username + "!");
		
	}

	private static String readName() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	private static void askName() {
		System.out.print("Escriba su nombre: ");
		
	}

}
