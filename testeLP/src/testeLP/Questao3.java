package testeLP;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		int opcao, num=0, qtde;
		String item, autor, local, data, descricao;
		
		
		String [] itens = new String[2];
				
		
		
		do {
			
			System.out.println("(1) Cadastrar Item Perdido\n(2) Buscar Item\n(3) Sair");
			opcao = entrada.nextInt();
			
			switch(opcao)
		{
			case 1:
				
								
				for(int i = 0; i<2; i++)
				{							
					System.out.println("Item: ");
					item = entrada.next();
					System.out.println("Autor: ");
					autor = entrada.next();
					System.out.println("Local: ");
					local = entrada.next();
					System.out.println("Data: ");
					data = entrada.next();
					System.out.println("Descri��o: ");
					descricao = entrada.next();
					num++;
					itens[i]=item;
				}
				
				break;
				
			case 2:
				System.out.println("Informe o item: ");
				item = entrada.next();
				
				for(int i = 0; i<10; i++) {
					if(itens[i].contains(item)) {
						System.out.println("Item encontrado");
						
					}
					else {
						System.out.println("Item n�o encontrado");
					}
				}
				break;
				
			case 3:
				System.out.println("N�mero total de itens cadastrados: " + num);
				break;
				
					
		}
				
		
		} while(opcao != 3);
}
}