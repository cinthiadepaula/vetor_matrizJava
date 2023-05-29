package vetor_matriz;

import java.util.Scanner;
public class Matriz01 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int matriz[][] = new int [3] [3];
		int soma = 0, soma2 = 0;
		
		 System.out.println("Digite os numeros da Matriz: ");
		 
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.println("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
					matriz[i][j] = in.nextInt();
				}
			}
		 
			System.out.println("Elementos da Diagonal Principal:");
			for (int i = 0; i < matriz.length; i++) {
				System.out.print(matriz[i][i] + " ");
			}
		 
			
			System.out.println("\n\nElementos da Diagonal Secundária:");
			for (int i = 0; i < matriz.length; i++) {
				System.out.print(matriz[i][matriz.length - i - 1] + " ");
			}
		 
			for (int i = 0; i < matriz.length; i++) {

				soma += matriz[i][i];
				soma2 += matriz[i][matriz.length - i - 1];
			}
			
			System.out.println("Soma dos Elementos da Diagonal Principal: " + soma);
		    System.out.println("Soma dos Elementos da Diagonal Secundária: " + soma2);

	}

}
