public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int capacidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[capacidadeLojas];
    }

    //get e set do nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //get e set do endereço
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    //get e set das lojas
    public Loja[] getLojas() {
        return lojas;
    }
    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja(Loja loja) {
        for(int i = 0; i < lojas.length; i++) {
            if(lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for(int i = 0; i < lojas.length; i++) {
            if(lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipo) {
        int contador = 0;

        for(Loja loja : lojas) {
            if(loja == null) continue;

            switch (tipo) {
                case "Cosmetico":
                    if(loja instanceof Cosmetico) contador++;
                    break;
                case "Vestuario":
                    if(loja instanceof Vestuario) contador++;
                    break;
                case "Bijuteria":
                    if(loja instanceof Bijuteria) contador++;
                    break;
                case "Alimentacao":
                    if(loja instanceof Alimentacao) contador++;
                    break;
                case "Informatica":
                    if(loja instanceof Informatica) contador++;
                    break;
                
                default:
                    return -1;
            }
        }
        return contador;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica maisCara = null;
        double maiorSeguro = 0;

        for(Loja loja : lojas) {
            if(loja instanceof Informatica) {
                Informatica info = (Informatica) loja;

                if(maisCara == null || info.getSeguroEletronicos() > maiorSeguro) {
                    maisCara = info;
                    maiorSeguro = info.getSeguroEletronicos();
                }
            }
        }
        return maisCara;
    }

    @Override
    public String toString() {
        String resultado = "Shopping: " + nome + "\nEndereço: " + endereco + "\nLojas:\n";

        for (Loja loja : lojas) {
            if (loja != null) {
                resultado += loja + "\n";
            }
        }
        return resultado;
    }
}
