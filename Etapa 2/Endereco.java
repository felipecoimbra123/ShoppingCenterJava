public class Endereco {
    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;

    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String numero, String complemento) {
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    //get e set do nome da rua
    public String getNomeDaRua() {
        return nomeDaRua;   
    }
    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }
    //get e set do nome da cidade
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    //get e set do nome do estado
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    //get e set do nome do país
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    //get e set do cep
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    //get e set do numero
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    //get e set do complemento
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
