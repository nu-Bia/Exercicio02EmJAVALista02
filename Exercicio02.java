//2) Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o n�mero de votos brancos,
//nulos e v�lidos. Calcular e escrever o percentual que cada um representa em rela��o ao total de eleitores.  

import java.util.Scanner;

public class Exercicio02 {
		
	public static void main (String[]args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o n�mero de eleitores");

	int eleitores = sc.nextInt();

	System.out.println("Digite o votos v�lidos");

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

