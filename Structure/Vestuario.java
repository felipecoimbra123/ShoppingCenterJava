public class Vestuario extends Loja {
    private double produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }

    //get e set dos produtos importados
    public double getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(double produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return super.toString() + "Produtos importados: " + produtosImportados;
    }
}
