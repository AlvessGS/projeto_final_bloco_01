package tenis;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import tenis.controller.TenisController;
import tenis.model.Tenis;
import tenis.model.TenisCorrida;
import tenis.model.chuteira;


public class tenismenu {
	
	public static void main(String[] args) {
		
		TenisController tenis = new TenisController();
		
		Scanner ler = new Scanner(System.in);
	
		
		int opcao, numero, tamanho, tipo;
		String marca;
		float valor;
		
		while(true) {
			
			System.out.println("\n**************************************************");
			System.out.println("                                                    ");
			System.out.println("                  Escolha uma Opção                 ");
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.println("                                                    ");
			System.out.println("               1 - Cadastrar tênis                  ");
			System.out.println("               2 - Listar todos os tênis            ");
			System.out.println("               3 - Apagar                           ");
			System.out.println("               4 - Sair                             ");
			System.out.println("                                                    ");
			System.out.println("                                                    ");
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.println("                                                    ");
			System.out.println("Digite a opção desejada:                            ");
			System.out.println("                                                    ");
			
			try {
				opcao = ler.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				ler.nextLine();
				opcao = 0;
			}
			
			if (opcao==4) {
				System.out.println("A melhor loja de tênis do Brazil com Z!");
				ler.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				
				System.out.println("Digite o nome do tênis");
				ler.skip("\\R");
				marca = ler.nextLine();
				
				System.out.println("Digite o Preço do Produto: ");
				valor = ler.nextFloat();
				
				tenis.cadastrar(new Tenis(tenis.gerarNumero(), marca, valor,));
				
				keyPress();
				break;
				
			case 2:
				System.out.println("Listar todos os tênis\n\n");
				tenis.listarTodas();
				keyPress();
				break;
				
			case 3:
				System.out.println("Apagar \n");
				tenis.deletar(numero);
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