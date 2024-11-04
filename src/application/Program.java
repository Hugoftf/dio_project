package application;

import java.util.Scanner;

public class Program {

	public static void Main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ola usuario, Digite o seu nome:");
		System.out.print("Nome: ");
		
		String nome = sc.nextLine();
		
		System.out.println("Seu nome é: " + nome);
		
		
		
		
		sc.close();
	}
}
