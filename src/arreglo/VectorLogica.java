package arreglo;

import main.Main;

import javax.swing.*;

import static constantes.Strings.*;

public class VectorLogica extends Vector{

    public void ingresarValores(){
        int cont1=0;
        int cont2=0;
        double acumPositivos=0;
        double acumNegativos=0;

        this.settVector(Integer.parseInt(JOptionPane.showInputDialog(null,MENSAJE_VECTOR_VALORES.getMensaje())));
        double[] vectorPositivo = new double[this.gettVector()];
        double[] vectorNegativo = new double[this.gettVector()];
        for(int i =0;i<this.gettVector();i++){
            double num=Double.parseDouble(JOptionPane.showInputDialog(null,MENSAJE_PEDIR_NUMERO.getMensaje()));
            if(num<0){
               vectorNegativo[i]=num;
               cont1=cont1+1;
            }else{
                vectorPositivo[i]=num;
                cont2=cont2+1;
            }
        }
        this.setContNegativos(cont1);
        this.setContPositivos(cont2);

        for(int i=0;i<this.gettVector();i++){

            acumPositivos=acumPositivos+vectorPositivo[i];
            acumNegativos=acumNegativos+vectorNegativo[i];

        }

        JOptionPane.showMessageDialog(null,MENSAJE_PROMEDIO_POSITIVOS.getMensaje()+ (acumPositivos/this.getContPositivos())
                +"\n"+MENSAJE_PROMEDIO_NEGATIVOS.getMensaje()+(acumNegativos/this.getContNegativos()));

        Main.main(null);
    }

}
