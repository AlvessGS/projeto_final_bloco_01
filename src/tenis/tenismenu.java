package tenis;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import tenis.model.Tenis;
import tenis.model.TenisCorrida;
import tenis.model.chuteira;

public class tenismenu {
	
	public static void main(String[] args) {
		
		
		//Tenis para corrida
		TenisCorrida t2 = new TenisCorrida(40,"preto", 2, "Nike", 400.0f, 440.0f);
		t2.visualizar();
		
		System.out.println("*******************************************************");
		
		
		chuteira c1 = new chuteira(40,"verde", 6, "Nike", 400.0f, 2);
		c1.visualizar();
		
		Scanner ler = new Scanner(System.in);
		
		int opcao;
		
		while(true) {
			
			System.out.println("\n**************************************************");
			System.out.println("                                                    ");
			System.out.println("                    Escolha a marca                 ");
			System.out.println("                                                    ");
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
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			
			try {
				opcao = ler.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				ler.nextLine();
				opcao = 0;
			}
			
			if (opcao==8) {
				System.out.println("A melhor loja de tênis do Brazil com Z!");
				ler.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println("\nOlympikus\n");
				
				keyPress();
				break;
				
			case 2:
				System.out.println("\\nConverse All Star\n");
				
				keyPress();
				break;
				
			case 3:
				System.out.println("\nAdidas\n");
				
				keyPress();
				break;
				
			case 4:
				System.out.println("\nNike\n");
				
				keyPress();
				break;
				
			case 5:
				System.out.println("\nAsics\n");
				
				keyPress();
				break;
				
			case 6:
				System.out.println("\nMizuno\n");
				
				keyPress();
				break;
				
				default:
					System.out.println("\nOpção inválida! Tente novamente.\n");
					
					keyPress();
					break;
			}
		}
	}
			public static void keyPress() {
				
				try {
					System.out.println("\nPressione Enter para continuar...");
					System.in.read();
				} catch (IOException e) {
					
					System.out.println("Você pressionou uma tecla diferente...");
				
			}
		}
	}