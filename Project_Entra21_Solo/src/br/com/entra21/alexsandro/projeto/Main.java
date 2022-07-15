package br.com.entra21.alexsandro.projeto;

import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in); // TODO -

	public static void main(String[] args) {

		byte option = 0;

		do {

			System.out.println(writeMenu());
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Going out...");
				break;

			case 1:
				// Login
				break;

			case 2:
				// About
				break;

			default:
				System.out.println("Invalid Option\n");
				break;

			}

		} while (option != 0);
		System.out.println("Thanks!!");

	}

	private static String writeMenu() {

		String menu = "Sports Social Network\n";
		menu += "\n0 - Exit";
		menu += "\n1 - Login";
		menu += "\n2 - About";

		return menu;

	}

}
