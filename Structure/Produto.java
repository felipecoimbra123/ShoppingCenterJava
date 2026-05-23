public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = null;
    }

    //get e set do nome do produto
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //get e set do preco do produto
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }   

    public Data getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data dataHoje) {
        if(dataValidade.getAno() < dataHoje.getAno()) {
            return true;
        }
        if(dataValidade.getAno() > dataHoje.getAno()) {
            return false;
        }
        if(dataValidade.getMes() < dataHoje.getMes()) {
            return true;
        }
        if(dataValidade.getMes() > dataHoje.getMes()) {
            return false;
        }
        return dataValidade.getDia() < dataHoje.getDia();
    }

    @Override
    public String toString() {
        return "Produto {" +
           "nome='" + nome + '\'' +
           ", preco=" + preco +
           ", dataValidade=" + dataValidade +
           '}';
}
}
