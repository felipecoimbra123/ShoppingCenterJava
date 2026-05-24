import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("MENU");
            System.out.println("1 - Criar uma loja");
            System.out.println("2 - Criar um produto");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            if (opcao == 1) {
                Endereco endereco = new Endereco(
                        "Rua Felipe Coimbra",
                        "São Leopoldo",
                        "RS",
                        "Brasil",
                        "11111-111",
                        "51999999999",
                        "Casa"
                );

                Data fundacao = new Data(5, 12, 2007);

                Loja loja = new Loja("Loja Felipe Coimbra", 1, 2000, endereco, fundacao);

                System.out.println("Loja criada com sucesso!");
                System.out.println(loja);

            } else if (opcao == 2) {

                Data validade = new Data(31, 1, 2040);
                Produto produto = new Produto("HotWheels", 19.9, validade);

                Data dataToday = new Data(20, 1, 2040);

                if (produto.estaVencido(dataToday)) {
                    System.out.println("Produto está vencido!");
                } else {
                    System.out.println("Produto não está vencido!");
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