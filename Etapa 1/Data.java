public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)) {        
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    private boolean dataValida(int dia, int mes, int ano) {
        if(mes < 1 || mes > 12) {
            return false;
        }

        int diasMes;

        if(mes == 2) {
            if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                diasMes = 29;
            } else {
                diasMes = 28;
            }
        }
        else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasMes = 30;
        } else {
            diasMes = 31;
        }
        return dia >= 1 && dia <= diasMes;
    }

    private boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    //get e set do dia
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    //get e set do me
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    //get e set do ano
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}
