package ProvaSamuel;
import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int [] vet = new int [10];
		int nota = 0, aux = 0;
		double soma=0;
		
		for(int i = 0; i<vet.length; i++) {
			
			System.out.printf("#%d Insira sua nota: ", i+1);
			nota = ler.nextInt();
			vet[i]=nota;
			soma = soma + nota;
		}
		
		for(int i = 0; i<vet.length; i++) {
			for(int j = 0; j<(vet.length-1); j++) {
				if(vet[j]>vet[j+1])
				{
					aux = vet[j];
					vet[j]=vet[j+1];
					vet[j+1]=aux;
				}
						
			}
		}
		
		double media = soma/10;
		
		System.out.println();
		System.out.println("A maior nota- 1º Lugar: " + vet[9]);
		System.out.println("A segunda maior nota- 2º Lugar: " + vet[8]);
		System.out.println("A terceira maior nota- 3º Lugar: " + vet[7]);
		System.out.println("A menor nota: " + vet[0]);
		System.out.println("A média das notas: " + media);
		
		
		
		
		
	}

}
