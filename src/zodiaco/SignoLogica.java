package zodiaco;

import main.Main;

import javax.swing.*;

import static constantes.Strings.*;
import static constantes.Enteros.*;

public class SignoLogica extends Signo {

    public void signoZodiacal() {

        int sw=0;
        while(sw==0) {
            this.setDias(Integer.parseInt(JOptionPane.showInputDialog(null, MENSAJE_DIAS.getMensaje())));
            this.setMes(Integer.parseInt(JOptionPane.showInputDialog(null, MENSAJE_MES.getMensaje())));


            if((this.getDias()>=UNO.getValor() && this.getDias()<=TREINTAYUNO.getValor()) && (this.getMes()>=UNO.getValor() && this.getMes()<=DOCE.getValor())){
                if((this.getDias()>=VEINTIUNO.getValor() && this.getMes()==TRES.getValor()) || (this.getDias()<=VEINTE.getValor())&& this.getMes() ==CUATRO.getValor()){
                    JOptionPane.showMessageDialog(null,MENSAJE_ARIES.getMensaje());
                }else if((this.getDias()>=VEINTIUNO.getValor()&& this.getMes()==CUATRO.getValor()) || (this.getDias()<=VEINTE.getValor() && this.getMes()==CINCO.getValor())){
                    JOptionPane.showMessageDialog(null,MENSAJE_TAURO.getMensaje());
                }else if((this.getDias()>=VEINTIUNO.getValor()&& this.getMes()==CINCO.getValor()) || (this.getDias()<=VEINTE.getValor() && this.getMes()==SEIS.getValor())){
                    JOptionPane.showMessageDialog(null,MENSAJE_GEMINIS.getMensaje());
                }else if((this.getDias()>=VEINTIDOS.getValor()&& this.getMes()==SEIS.getValor()) || (this.getDias()<=VEINTIDOS.getValor() && this.getMes()==SIETE.getValor())) {
                    JOptionPane.showMessageDialog(null, MENSAJE_CANCER.getMensaje());
                }else if((this.getDias()>=VEINTITRES.getValor()&& this.getMes()==SIETE.getValor()) || (this.getDias()<=VEINTITRES.getValor() && this.getMes()==OCHO.getValor())) {
                    JOptionPane.showMessageDialog(null, MENSAJE_LEO.getMensaje());
                }else if((this.getDias()>=VEINTICUATRO.getValor()&& this.getMes()==OCHO.getValor()) || (this.getDias()<=VEINTITRES.getValor() && this.getMes()==NUEVE.getValor())) {
                    JOptionPane.showMessageDialog(null, MENSAJE_VIRGO.getMensaje());
                }else if((this.getDias()>=VEINTICUATRO.getValor()&& this.getMes()==NUEVE.getValor()) || (this.getDias()<=VEINTIDOS.getValor() && this.getMes()==DIEZ.getValor())){
                    JOptionPane.showMessageDialog(null,MENSAJE_LIBRA.getMensaje());
                }else if((this.getDias()>=VEINTITRES.getValor()&& this.getMes()==DIEZ.getValor()) || (this.getDias()<=VEINTIDOS.getValor() && this.getMes()==ONCE.getValor())) {
                    JOptionPane.showMessageDialog(null, MENSAJE_ESCORPIO.getMensaje());
                }else if((this.getDias()>=VEINTITRES.getValor()&& this.getMes()==ONCE.getValor()) || (this.getDias()<=VEINTIUNO.getValor() && this.getMes()==DOCE.getValor())) {
                    JOptionPane.showMessageDialog(null, MENSAJE_SAGITARIO.getMensaje());
                }else if((this.getDias()>=VEINTIDOS.getValor()&& this.getMes()==DOCE.getValor()) || (this.getDias()<=DIECINUEVE.getValor() && this.getMes()==UNO.getValor())) {
                    JOptionPane.showMessageDialog(null, MENSAJE_CAPRICORNIO.getMensaje());
                }else if((this.getDias()>=VEINTE.getValor()&& this.getMes()==UNO.getValor()) || (this.getDias()<=DIECINUEVE.getValor() && this.getMes()==DOS.getValor())) {
                    JOptionPane.showMessageDialog(null, MENSAJE_ACUARIO.getMensaje());
                }else if((this.getDias()>=VEINTE.getValor()&& this.getMes()==DOS.getValor()) || (this.getDias()<=VEINTE.getValor() && this.getMes()==TRES.getValor())) {
                    JOptionPane.showMessageDialog(null, MENSAJE_GEMINIS.getMensaje());
                }
                sw=1;
            }else{
                JOptionPane.showMessageDialog(null,MENSAJE_ERROR_DIAS.getMensaje()+"\n"+
                        MENSAJE_ERROR_MES.getMensaje());
            }
        }
        Main.main(null);

    }

}
