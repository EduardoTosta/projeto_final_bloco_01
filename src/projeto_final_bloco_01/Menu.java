package projeto_final_bloco_01;

import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

import projeto_final_bloco_01.model.Produto;
import projeto_final_bloco_01.model.Console;
import projeto_final_bloco_01.model.Jogo;
import projeto_final_bloco_01.util.Cores;
import projeto_final_bloco_01.controller.ProdutoController;

public class Menu {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ProdutoController produtoController = new ProdutoController();

        int opcao, numero, codigo, tipo, qntEstoque,quantidade;
        String nome, marca, produtora;
        double preco;

        while (true) {
            menuLogin();
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    boolean controleMenuPrincipal = true;
                    while (controleMenuPrincipal) {
                        menuPrincipal();
                        int opcaoMenu = leia.nextInt();

                        switch (opcaoMenu) {
                            case 1:
                                System.out.println("COMPRAR");
                                System.out.print("Digite o codigo do produto: ");
                                codigo = leia.nextInt();
                                System.out.print("Digite a quantidade do produto: ");
                                quantidade = leia.nextInt();
                                produtoController.comprar(codigo, quantidade);
                                keyPress();
                                break;

                            case 2:
                                System.out.println("VENDER");
                                System.out.print("Digite o codigo do produto: ");
                                codigo = leia.nextInt();
                                System.out.print("Digite a quantidade do produto: ");
                                quantidade = leia.nextInt();
                                produtoController.vender(codigo, quantidade);
                                keyPress();
                                break;

                            case 3:
                                System.out.println("Atualizar Produto");
                                System.out.print("Digite o número do Produto: ");
                                numero = leia.nextInt();

                                Optional<Produto> produto = produtoController.buscarNaCollection(numero);
                                if (produto.isPresent()) {
                                    System.out.print("Digite o codigo do produto: ");
                                    codigo = leia.nextInt();

                                    System.out.print("Digite o nome: ");
                                    leia.skip("\\R");
                                    nome = leia.nextLine();

                                    tipo = produto.get().getTipo();

                                    System.out.print("Digite a quantidade em estoque: ");
                                    qntEstoque = leia.nextInt();

                                    System.out.print("Digite o valor do Produto: ");
                                    preco = leia.nextDouble();

                                    switch (tipo) {
                                        case 1 -> {
                                            System.out.print("Digite a marca do Console: ");
                                            leia.skip("\\R");
                                            marca = leia.nextLine();
                                            produtoController.cadastrar(new Console(numero, tipo, qntEstoque, preco, nome, marca));
                                        }
                                        case 2 -> {
                                            System.out.print("Digite a produtora do Jogo: ");
                                            leia.skip("\\R");
                                            produtora = leia.nextLine();
                                            produtoController.cadastrar(new Jogo(numero, tipo, qntEstoque, preco,nome, produtora));
                                        }
                                    }
                                } else {
                                    System.out.printf("\nO Produto %d não existe!", numero);
                                }
                                keyPress();
                                break;
                            case 4:
                                System.out.println("Listar Produtos");
                                System.out.println("Listar todos - 1");
                                System.out.println("Listar pot tipo - 2");
                                opcao = leia.nextInt();
                                switch (opcao) {
                                case 1 -> {
                                    System.out.print("Listar todos ");
                                    produtoController.listarTodas();
                                }
                                case 2 -> {
                                    System.out.print("Digite O TIPO: ");
                                    tipo = leia.nextInt();
                                    produtoController.listarPorTipo(tipo);
                                	}
                                }
                                
                                controleMenuPrincipal = false;
                                keyPress();
                                break;
                                
                            case 6:
                                System.out.println("Cadastrar Produto");
                                System.out.print("Digite o codigo do produto: ");
                                codigo = leia.nextInt();

                                System.out.print("Digite o nome: ");
                                leia.skip("\\R");
                                nome = leia.nextLine();

                                System.out.print("Digite o tipo do produto: ");
                                tipo = leia.nextInt();

                                System.out.print("Digite a quantidade em estoque: ");
                                qntEstoque = leia.nextInt();

                                System.out.print("Digite o valor do Produto: ");
                                preco = leia.nextDouble();

                                switch (tipo) {
                                    case 1 -> {
                                        System.out.print("Digite a marca do Console: ");
                                        leia.skip("\\R");
                                        marca = leia.nextLine();
                                        produtoController.cadastrar(new Console(codigo, tipo, qntEstoque, preco, nome, marca));
                                    }
                                    case 2 -> {
                                        System.out.print("Digite a produtora do Jogo: ");
                                        leia.skip("\\R");
                                        produtora = leia.nextLine();
                                        produtoController.cadastrar(new Jogo(codigo, tipo, qntEstoque, preco,nome, produtora));
                                    }
                                }
                                
                                controleMenuPrincipal = false;
                                keyPress();
                                break;
                                
                            case 5:
                                System.out.println("VOLTANDO AO MENU ANTERIOR...");
                                controleMenuPrincipal = false;
                                keyPress();
                                break;

                            case 0:
                                System.out.println("SAINDO DO SISTEMA...");
                                sobre();
                                leia.close();
                                System.exit(0);
                                break;

                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                keyPress();
                                break;
                        }
                    }
                    break;

                case 0:
                    System.out.println("Fim da execução");
                    sobre();
                    leia.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    keyPress();
                    break;
            }
        }
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
        System.out.println("║   ║   1 - Acessar Estoque             ║   ║");
        System.out.println("║   ║   0 - Encerrar                    ║   ║");
        System.out.println("║   ╚═══════════════════════════════════╝   ║");
        System.out.print(Cores.TEXT_GREEN_BOLD);
        System.out.println("║                                           ║");
        System.out.println("╚═══════════════════════════════════════════╝");
        System.out.print(Cores.TEXT_RESET + "Digite a opção desejada: ");
    }

    public static void menuPrincipal() {
        System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_GREEN_BOLD);
        System.out.println("╔════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                     Duduzinho Gameplays                            ║");
        System.out.println("║                       LOJA DE GAMES!                               ║");
        System.out.print(Cores.TEXT_YELLOW_BOLD);
        System.out.println("║   ╔════════════════════════════════════════════════════════════╗   ║");
        System.out.println("║   ║   1 - Comprar                                              ║   ║");
        System.out.println("║   ║   2 - Vender                                               ║   ║");
        System.out.println("║   ║   3 - Atualizar Produtos                                   ║   ║");
        System.out.println("║   ║   4 - Listar Produtos                                      ║   ║");
        System.out.println("║   ║   5 - Voltar                                               ║   ║");
        System.out.println("║   ║   0 - Sair                                                 ║   ║");
        System.out.println("║   ╚════════════════════════════════════════════════════════════╝   ║");
        System.out.print(Cores.TEXT_GREEN_BOLD);
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

    public static void keyPress() {
        try {
            System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
            System.in.read();
        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao tentar ler o teclado");
        }
    }
}