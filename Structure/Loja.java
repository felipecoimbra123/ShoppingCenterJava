public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    //etapa 2
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[10];
    }

    //etapa 1
    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    //etapa 1
    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
    }

    //etapa 2 -  - sem salario
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[10];
    }

    //get e set do nome da loja
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //get e set do numero de funcionarios
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    //get e set do salario
    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    //get e set do endereço
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    //get e set do dia da fundação
    public Data getDataFundacao() {
        return dataFundacao;
    }
    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    //get e set do estoque dos produtos
    public Produto[] geEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public double gastosComSalario() {
        if(salarioBaseFuncionario == -1) {
            return -1;
        }
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }

    public char tamanhoDaLoja() {
        if(quantidadeFuncionarios < 10) {
            return 'P';
        }
        if(quantidadeFuncionarios <= 30) {
            return 'M';
        }
        else {
            return 'G';
        }
    }

    public void imprimeProduto() {
        for(Produto p : estoqueProdutos) {
            if(p != null) {
                System.out.println(p);
            }
        }
    }

    public boolean insereProduto(Produto produto) {
        for(int i = 0; i < estoqueProdutos.length; i++) {
            if(estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto) {
        for(int i = 0; i < estoqueProdutos.length; i++) {
            if(estoqueProdutos[i] != null &&
                estoqueProdutos[i].getNome().equals(nomeProduto)) {
                    estoqueProdutos[i] = null;
                    return true;
                }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Loja {" +
               "nome='" + nome + '\'' +
               ", quantidadeFuncionarios=" + quantidadeFuncionarios +
               ", salarioBaseFuncionario=" + salarioBaseFuncionario +
               ", endereco=" + endereco +
               ", dataFundacao=" + dataFundacao +
               ", estoqueProdutos=" + estoqueProdutos.length +
               '}';
    }
}
