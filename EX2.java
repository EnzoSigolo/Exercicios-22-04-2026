package DesafiosFOR;

import java.util.Scanner;

public class EX2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, resultado;
		
		System.out.println("informe o numero para tabuada");
		n = ler.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			resultado = n*i;
			System.out.println(n + "*" + i + " = " + resultado);
		}
		ler.close();
	}
}