package empleado;

import static constantes.Enteros.CERO;

public class Salarios {

    private int salario;
    private int maximoSalario;
    private int cantidadSalarios;
    private int acumuladorSalario;

    public Salarios(){
        this.salario=CERO.getValor();
        this.maximoSalario=CERO.getValor();
        this.cantidadSalarios=CERO.getValor();
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getMaximoSalario() {
        return maximoSalario;
    }

    public void setMaximoSalario(int maximoSalario) {
        this.maximoSalario = maximoSalario;
    }

    public int getCantidadSalarios() {
        return cantidadSalarios;
    }

    public void setCantidadSalarios(int cantidadSalaros) {
        this.cantidadSalarios = cantidadSalaros;
    }

    public int getAcumuladorSalario() {
        return acumuladorSalario;
    }

    public void setAcumuladorSalario(int acumuladorSalario) {
        this.acumuladorSalario = acumuladorSalario;
    }
}
