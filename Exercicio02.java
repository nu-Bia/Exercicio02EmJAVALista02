//2) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos,
//nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.  

import java.util.Scanner;

public class Exercicio02 {
		
	public static void main (String[]args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o número de eleitores");

	int eleitores = sc.nextInt();

	System.out.println("Digite o votos válidos");

	int valido= sc.nextInt();

	System.out.println("Digite o votos  nulos");

	int nulos= sc.nextInt();
	
	System.out.println("Digite o votos brancos");

	int brancos= sc.nextInt();

   System.out.println ((valido/eleitores)*100);
   System.out.println ((nulos/eleitores)*100);
   System.out.println ((brancos/eleitores)*100);
   

}

		}

