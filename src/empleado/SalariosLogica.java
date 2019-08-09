package empleado;

import main.Main;

import static constantes.Strings.*;
import javax.swing.*;

public class SalariosLogica extends Salarios {

    public void calcularMaximoSalario(){
        int sw=0;
        int acum=0;
        int cont=0;
        int op=0;
        while(op==0){
            int valor=JOptionPane.showConfirmDialog(null,MENSAJE_DATOS_EMPLEADO.getMensaje(),MENSAJE.getMensaje(),JOptionPane.YES_NO_OPTION);
            if(valor==0){
                int salario=Integer.parseInt(JOptionPane.showInputDialog(null,MENSAJE_EMPLEADO.getMensaje()));


                if(sw==0){
                    this.setMaximoSalario(salario);
                    sw=1;
                }
                if(salario>this.getMaximoSalario()){
                    this.setMaximoSalario(salario);
                }
                acum=acum+salario;
                cont=cont+1;

            }else{
                op=1;
            }
        }
        this.setAcumuladorSalario(acum);
        this.setCantidadSalarios(cont);

        if(cont!=0) {
            JOptionPane.showMessageDialog(null, MENSAJE_TOTAL_SALARIOS.getMensaje() + this.getCantidadSalarios() +
                    "\n" + MENSAJE_PROMEDIO.getMensaje() + "" + this.getAcumuladorSalario() / cont + "\n" +
                    MENSAJE_SALARIO_MAXIMO.getMensaje() + this.getMaximoSalario());
            Main.main(null);
        }else{
            Main.main(null);
        }

    }
}
