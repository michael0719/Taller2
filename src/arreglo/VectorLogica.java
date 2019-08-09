package arreglo;

import main.Main;

import javax.swing.*;

import static constantes.Strings.*;

public class VectorLogica extends Vector{

    public void ingresarValores(){
        int cont1=0;
        int cont2=0;
        int valor;
        double acumPositivos=0;
        double acumNegativos=0;
        boolean controlador=true;

        double[] vectorPositivo = new double[200];
        double[] vectorNegativo = new double[200];
        while(controlador) {
            valor = JOptionPane.showConfirmDialog(null, MENSAJE_INGRESAR_NUMERO.getMensaje(), MENSAJE.getMensaje(), JOptionPane.YES_NO_OPTION);
            if (valor == 0) {
                double num=Double.parseDouble(JOptionPane.showInputDialog(null,MENSAJE_PEDIR_NUMERO.getMensaje()));
                if (num < 0) {
                    vectorNegativo[cont1] = num;
                    cont1 = cont1 + 1;
                } else {
                    vectorPositivo[cont2] = num;
                    cont2 = cont2 + 1;
                }
            }else{
                controlador=false;
            }
        }
        this.setContNegativos(cont1);
        this.setContPositivos(cont2);

        for(int i=0;i<=this.getContPositivos();i++){
            acumPositivos=acumPositivos+vectorPositivo[i];
        }
        for(int i=0;i<=this.getContNegativos();i++){
            acumNegativos=acumNegativos+vectorNegativo[i];
        }

        JOptionPane.showMessageDialog(null,MENSAJE_PROMEDIO_POSITIVOS.getMensaje()+ (acumPositivos/this.getContPositivos())
                +"\n"+MENSAJE_PROMEDIO_NEGATIVOS.getMensaje()+(acumNegativos/this.getContNegativos()));

        Main.main(null);
    }

}
