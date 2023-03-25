package view;

import java.util.Scanner;

import controller.FatControler;
public class main {

	public static void main(String[] args) {
		FatControler FC = new FatControler();
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int num = sc.nextInt();
		while(num > 10 ) {
			System.out.print("Digite um entre 0 e 10: ");
			num = sc.nextInt();
		}
		sc.close();
		int fat = FC.Fat(num);
		System.out.println("O fatorial de " + num + " é " + fat);
	}
}