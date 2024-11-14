package projeto_final_bloco_01;

import java.util.Scanner;

public class tenismenu {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int opcao;
		
		while(true) {
			
			System.out.println("****************************************************");
			System.out.println("                                                    ");
			System.out.println("                    Escolha a marca                 ");
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.println("****************************************************");
			System.out.println("                                                    ");
			System.out.println("                     1 - Olympikus                  ");
			System.out.println("                     2 - Converse All Star          ");
			System.out.println("                     3 - Adidas                     ");
			System.out.println("                     4 - Nike                       ");
			System.out.println("                     5 - Asics                      ");
			System.out.println("                     6 - Fila                       ");
			System.out.println("                     7 - Mizuno                     ");
			System.out.println("                     8 - Sair                       ");
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.println("                                                    ");
			System.out.println("Digite a opção desejada:                            ");
			
			opcao = ler.nextInt();
			
			if(opcao==8) {
				System.out.println("\nAgradecemos pela preferencia, fique a vontade para voltar ;)");
				ler.close();
				System.exit(0);
			}
			
			
			switch(opcao) {
			case 1:
				System.out.println("\nOlympikus\n");
				break;
				
			case 2:
				System.out.println("\\nConverse All Star\n");
				break;
				
			case 3:
				System.out.println("\nAdidas\n");
				break;
				
			case 4:
				System.out.println("\nNike\n");
				break;
				
			case 5:
				System.out.println("\nAsics\n");
				break;
				
			case 6:
				System.out.println("\nMizuno\n");
				break;
				
				default:
					System.out.println("\nOpção inválida! Tente novamente.\n");
			}
			
		}
	}

}
