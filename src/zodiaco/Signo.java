package zodiaco;

import static constantes.Enteros.CERO;

public class Signo {
    private int dias;
    private int mes;

    public Signo(){
        this.dias=CERO.getValor();
        this.mes=CERO.getValor();
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
}
