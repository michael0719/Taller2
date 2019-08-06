package imc;

import main.Main;

import javax.swing.*;

import java.text.DecimalFormat;

import static constantes.Strings.*;

public class IndiceLogica extends Indice {

    public double calcularIMC(){
        return (this.getPeso()/((this.getAltura()/100)*(this.getAltura()/100)));
    }

    public void pedirValores(){

        this.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null,MENSAJE_IMC_PESO.getMensaje())));
        this.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null,MENSAJE_IMC_ALTURA.getMensaje())));

    }

    public void mostrarResultado(double imc){

        DecimalFormat df = new DecimalFormat("#.00");

        if(imc<18.5){
            JOptionPane.showMessageDialog(null,MENSAJE_PESO_BAJO.getMensaje()+MENSAJE_IMC.getMensaje()+df.format(imc));
        }else if(imc<25){
            JOptionPane.showMessageDialog(null,MENSAJE_PESO_NORMAL.getMensaje()+MENSAJE_IMC.getMensaje()+df.format(imc));
        }else if(imc<30){
            JOptionPane.showMessageDialog(null,MENSAJE_PESO_SOBREPESO.getMensaje()+MENSAJE_IMC.getMensaje()+df.format(imc));
        }else if(imc<35){
            JOptionPane.showMessageDialog(null,MENSAJE_OBECIDAD1.getMensaje()+MENSAJE_IMC.getMensaje()+df.format(imc));
        }else if(imc<40){
            JOptionPane.showMessageDialog(null,MENSAJE_OBECIDAD2.getMensaje()+MENSAJE_IMC.getMensaje()+df.format(imc));
        }else if(imc<50){
            JOptionPane.showMessageDialog(null,MENSAJE_OBECIDAD3.getMensaje()+MENSAJE_IMC.getMensaje()+df.format(imc));
        }else{
            JOptionPane.showMessageDialog(null,MENSAJE_OBECIDAD4.getMensaje()+MENSAJE_IMC.getMensaje()+df.format(imc));
        }

        Main.main(null);
    }
}
