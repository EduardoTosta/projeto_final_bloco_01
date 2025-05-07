
# 🎮 Projeto Final - Gerenciamento de Produtos (Consoles e Jogos)

Este é um sistema em Java desenvolvido para gerenciar produtos de uma loja de videogames, permitindo o cadastro, listagem, atualização, remoção, compra e venda de **Consoles** e **Jogos**.

## 📁 Estrutura do Projeto

O projeto está organizado nos seguintes pacotes:

- `model`: contém as classes de domínio (`Produto`, `Console`, `Jogo`);
- `repository`: define a interface `ProdutoRepository` para o repositório de dados;
- `controller`: contém a classe `ProdutoController` com a lógica de gerenciamento dos produtos;
- `util`: define a classe `Cores` para manipulação de cores no terminal;
- `main`: possui a classe `Menu` com a interface de interação do usuário.

## 🧩 Classes Principais

### `Produto` (abstract)
Classe base para os produtos com atributos como:
- `numero`
- `tipo` (1: Console, 2: Jogo)
- `nome`
- `preco`
- `qntEstoque`

Métodos:
- `comprar(int quantidade)`
- `vender(int quantidade)`
- `vizualizar()`

### `Console` e `Jogo`
Extensões da classe `Produto` com atributos específicos:
- `Console`: `marca`
- `Jogo`: `produtora`

### `ProdutoRepository` (interface)
Define as operações de CRUD e manipulação de estoque:
```java
void procurarPorNumero(int numero);
void listarTodas();
void cadastrar(Produto produto);
void atualizar(Produto produto);
void deletar(int numero);
void listarPorTipo(int tipo);
void comprar(int numero, int quantidade);
void vender(int numero, int quantidade);
```

### `ProdutoController`
Implementa `ProdutoRepository` e contém a lista de produtos, com métodos para gerenciamento completo.

### `Menu`
Classe principal com a interface via terminal para interação do usuário com o sistema.

## 🎨 Utilitário

### `Cores`
Classe que define constantes ANSI para aplicar cores ao texto exibido no terminal.

## ▶️ Como Executar

1. Certifique-se de ter o Java instalado (Java 17+ recomendado).
2. Compile os arquivos:
   ```bash
   javac projeto_final_bloco_01/**/*.java
   ```
3. Execute o menu principal:
   ```bash
   java projeto_final_bloco_01.Menu
   ```

## ✅ Funcionalidades

- Cadastro de Consoles e Jogos
- Listagem geral ou por tipo
- Busca por código
- Atualização de dados
- Exclusão de produtos
- Compra e venda com controle de estoque

## 📌 Observações

- O projeto segue uma arquitetura simples baseada em MVC.
- O uso de cores melhora a interface no terminal.
- O sistema é totalmente baseado em listas em memória (não usa banco de dados).

## 📃 Licença

Este projeto é de uso educacional e livre para modificação.
