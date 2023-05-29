package vetor_matriz;

import java.util.Scanner;
public class Vetores01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num, vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
	
		
		System.out.println("Digite uma posição");
		num = in.nextInt();
		
		
		for(int i = 0; i < vetor.length; i++) {
			
			if(vetor [i] == num) {
				System.out.println("o numero " + num + " esta na posição " + i);
			}
			
		}
		
		
	}

}
