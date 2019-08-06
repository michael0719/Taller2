package empleado;

import main.Main;

import static constantes.Strings.*;
import javax.swing.*;

public class SalariosLogica extends Salarios {

    public void calcularMaximoSalario(){
        int sw=0;
        int acum=0;
        this.setCantidadSalarios(Integer.parseInt(JOptionPane.showInputDialog(null,MENSAJE_DATOS_EMPLEADO.getMensaje())));
        for (int i=1;i<=this.getCantidadSalarios();i++){
            int salario=Integer.parseInt(JOptionPane.showInputDialog(null,MENSAJE_EMPLEADO.getMensaje()+" "+i));
            if(sw==0){
                this.setMaximoSalario(salario);
                sw=1;
            }
            if(salario>this.getMaximoSalario()){
                this.setMaximoSalario(salario);
            }
            acum=acum+salario;
        }
        this.setAcumuladorSalario(acum);
    }

    public int calcularPromedio(){
        return this.getAcumuladorSalario()/this.getCantidadSalarios();
    }

    public void imprimirResultados(double promedio){

        JOptionPane.showMessageDialog(null,MENSAJE_TOTAL_SALARIOS.getMensaje()+this.getCantidadSalarios()+
                "\n"+MENSAJE_PROMEDIO.getMensaje()+promedio+"\n"+
                MENSAJE_SALARIO_MAXIMO.getMensaje()+this.getMaximoSalario());

        Main.main(null);
    }

}
