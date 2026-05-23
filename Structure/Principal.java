public class Principal {
    public static void main(String[] args) {
        int opcao = 1;

        while (opcao != 3) {
            System.out.println("MENU");
            System.out.println("1 - Criar uma loja");
            System.out.println("2 - Criar um produto");
            System.out.println("3 - Sair");

            if(opcao == 1) {
                Endereco endereco = new Endereco("Rua Felipe Coimbra", "São Leopoldo", "RS", "Brasil", "11111-111", "51999999999", "Casa");

                Data fundacao = new Data(05, 12, 2007);

                Loja loja = new Loja("Loja Felipe Coimbra", 1, 2000, endereco, fundacao);
                System.out.println("Loja criada com sucesso!");
                System.out.println("Nome: " + loja.getNome());
                System.out.println("Número de funcionários: " + loja.getQuantidadeFuncionarios());

                opcao = 2;
            } else if(opcao == 2) {
                Data validade = new Data(31, 01, 2040);
                Produto produto = new Produto("HotWheels", 19.9, validade);

                Data dataToday = new Data(20, 01, 2040);

                if(produto.estaVencido(dataToday)) {
                    System.out.println("Produto está vencido!");
                } else {
                    System.out.println("Produto não está vencido!");
                }

                opcao = 3;
            }

        }
    }
}