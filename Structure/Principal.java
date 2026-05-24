import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        Loja lojaCriada = null;

        while (opcao != 3) {
            System.out.println("MENU");
            System.out.println("1 - Criar uma loja");
            System.out.println("2 - Criar um produto");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            if (opcao == 1) {

                sc.nextLine();

                System.out.print("Nome da loja: ");
                String nomeLoja = sc.nextLine();

                System.out.print("Quantidade de funcionários: ");
                int qtdFunc = sc.nextInt();

                System.out.print("Salário base do funcionário: ");
                double salario = sc.nextDouble();
                sc.nextLine();

                System.out.print("Rua: ");
                String rua = sc.nextLine();

                System.out.print("Cidade: ");
                String cidade = sc.nextLine();

                System.out.print("Estado: ");
                String estado = sc.nextLine();

                System.out.print("País: ");
                String pais = sc.nextLine();

                System.out.print("CEP: ");
                String cep = sc.nextLine();

                System.out.print("Número: ");
                String numero = sc.nextLine();

                System.out.print("Complemento: ");
                String complemento = sc.nextLine();

                Endereco endereco = new Endereco(
                    rua, cidade, estado, pais, cep, numero, complemento
                );

                System.out.print("Dia da fundação: ");
                int dia = sc.nextInt();

                System.out.print("Mês da fundação: ");
                int mes = sc.nextInt();

                System.out.print("Ano da fundação: ");
                int ano = sc.nextInt();

                Data fundacao = new Data(dia, mes, ano);

                lojaCriada = new Loja(
                        nomeLoja,
                        qtdFunc,
                        salario,
                        endereco,
                        fundacao
                );

                System.out.println("\nLoja criada com sucesso!");
                System.out.println(lojaCriada);

            } else if (opcao == 2) {

                if (lojaCriada == null) {
                    System.out.println("Crie uma loja antes de criar produtos!");
                } else {

                    sc.nextLine();

                    System.out.print("Nome do produto: ");
                    String nomeProduto = sc.nextLine();

                    System.out.print("Preço do produto: ");
                    double preco = sc.nextDouble();

                    System.out.print("Dia da validade: ");
                    int diaVal = sc.nextInt();

                    System.out.print("Mês da validade: ");
                    int mesVal = sc.nextInt();

                    System.out.print("Ano da validade: ");
                    int anoVal = sc.nextInt();

                    Data validade = new Data(diaVal, mesVal, anoVal);
                    Produto produto = new Produto(nomeProduto, preco, validade);

                    boolean inserido = lojaCriada.insereProduto(produto);

                    if (inserido) {
                        System.out.println("Produto inserido com sucesso!");

                        System.out.print("Dia de hoje: ");
                        int diaHoje = sc.nextInt();

                        System.out.print("Mês atual: ");
                        int mesHoje = sc.nextInt();

                        System.out.print("Ano atual: ");
                        int anoHoje = sc.nextInt();

                        Data dataHoje = new Data(diaHoje, mesHoje, anoHoje);

                        if (produto.estaVencido(dataHoje)) {
                            System.out.println("Produto está vencido!");
                        } else {
                            System.out.println("Produto não está vencido!");
                        }

                    } else {
                        System.out.println("Estoque cheio! Não foi possível inserir o produto.");
                    }
                }

            } else if (opcao == 3) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida!");
            }

            System.out.println();
        }

        sc.close();
    }
}