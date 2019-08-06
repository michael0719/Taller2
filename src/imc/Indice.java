package imc;

import static constantes.Enteros.CERO;

public class Indice {

    private double altura;
    private double peso;

    public Indice(){
        this.altura=CERO.getValor();
        this.peso=CERO.getValor();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
