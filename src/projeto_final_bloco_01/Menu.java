package projeto_final_bloco_01;

import java.io.IOException;

import projeto_final_bloco_01.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public static void menuLogin() {
	    System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_GREEN_BOLD);
	    System.out.println("╔═══════════════════════════════════════════╗");
	    System.out.println("║                                           ║");
	    System.out.println("║           Duduzinho Gameplays             ║");
	    System.out.println("║              LOJA DE GAMES!               ║");
	    System.out.println("║                                           ║");
	    
	    System.out.print(Cores.TEXT_YELLOW_BOLD);
	    System.out.println("║   ╔═══════════════════════════════════╗   ║");
	    System.out.println("║   ║                                   ║   ║");
	    System.out.println("║   ║   1 - Acessar Estoque             ║   ║");
	    System.out.println("║   ║   0 - Encerrar                    ║   ║");
	    System.out.println("║   ║                                   ║   ║");
	    System.out.println("║   ╚═══════════════════════════════════╝   ║");

	    System.out.print(Cores.TEXT_GREEN_BOLD);
	    System.out.println("║                                           ║");
	    System.out.println("╚═══════════════════════════════════════════╝");
	    System.out.print(Cores.TEXT_RESET + "Digite a opção desejada: ");
	}


	
	public static void menuPrincipal() {
	    System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_GREEN_BOLD);
	    System.out.println("╔════════════════════════════════════════════════════════════════════╗");
	    System.out.println("║                                                                    ║");
	    System.out.println("║                     Duduzinho Gameplays                            ║");
	    System.out.println("║                       LOJA DE GAMES!                               ║");
	    System.out.println("║                                                                    ║");

	    System.out.print(Cores.TEXT_YELLOW_BOLD);
	    System.out.println("║   ╔════════════════════════════════════════════════════════════╗   ║");
	    System.out.println("║   ║                                                            ║   ║");
	    System.out.println("║   ║   1 - Comprar                                              ║   ║");
	    System.out.println("║   ║   2 - Vender                                               ║   ║");
	    System.out.println("║   ║   4 - Produtos                                             ║   ║");
	    System.out.println("║   ║   5 - Voltar                                               ║   ║");
	    System.out.println("║   ║   0 - Sair                                                 ║   ║");
	    System.out.println("║   ║                                                            ║   ║");
	    System.out.println("║   ╚════════════════════════════════════════════════════════════╝   ║");

	    System.out.print(Cores.TEXT_GREEN_BOLD);
	    System.out.println("║                                                                    ║");
	    System.out.println("╚════════════════════════════════════════════════════════════════════╝");
	    System.out.print(Cores.TEXT_RESET + "Digite a opção desejada: ");
	}

		
	public static void menuListar() {
		System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_GREEN_BOLD);
		System.out.println("╔════════════════════════════════════════════════════════════════════╗");
		System.out.println("║                                                                    ║");
		System.out.println("║                     Duduzinho Gameplays                            ║");
		System.out.println("║                       LOJA DE GAMES!                               ║");
		System.out.println("║                                                                    ║");


	    System.out.print(Cores.TEXT_YELLOW_BOLD);
	    System.out.println("║   ╔════════════════════════════════════════════════════════════╗   ║");
	    System.out.println("║   ║                                                            ║   ║");
	    System.out.println("║   ║   1 - Listar Jogos                                         ║   ║");
	    System.out.println("║   ║   2 - Listar Consoles                                      ║   ║");
	    System.out.println("║   ║   0 - Voltar                                               ║   ║");
	    System.out.println("║   ║                                                            ║   ║");
	    System.out.println("║   ╚════════════════════════════════════════════════════════════╝   ║");

	    System.out.print(Cores.TEXT_GREEN_BOLD);
	    System.out.println("║                                                                    ║");
	    System.out.println("╚════════════════════════════════════════════════════════════════════╝");
	    System.out.print(Cores.TEXT_RESET + "Digite a opção desejada: ");
	}

	

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Eduardo Tosta");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/EduardoTosta");
		System.out.println("*********************************************************");
	}
	
	//Antes de cada break do switch case, deve-se colocar uma chamada para o KeyPress
	public static void keyPress() {
 		try {
  
 			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
 			System.in.read();
  
 		} catch (IOException e) {
  
 			System.err.println("Ocorreu um erro ao tentar ler o teclado");
  
 		}
	}
}
