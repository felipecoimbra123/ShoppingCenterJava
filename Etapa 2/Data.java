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
            if(verificaAnoBissexto(ano)) {
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

    private boolean verificaAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}
