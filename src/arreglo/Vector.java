package arreglo;

import static constantes.Enteros.CERO;

public class Vector {

    private double numero;
    private int tVector;
    private int contPositivos;
    private int contNegativos;

    public Vector() {
        this.numero = CERO.getValor();
        this.tVector = CERO.getValor();
        this.contPositivos=CERO.getValor();
        this.contNegativos=CERO.getValor();
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public int gettVector() {
        return tVector;
    }

    public void settVector(int tVector) {
        this.tVector = tVector;
    }

    public int getContPositivos() {
        return contPositivos;
    }

    public void setContPositivos(int contPositivos) {
        this.contPositivos = contPositivos;
    }

    public int getContNegativos() {
        return contNegativos;
    }

    public void setContNegativos(int contNegativos) {
        this.contNegativos = contNegativos;
    }
}


