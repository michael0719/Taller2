package zodiaco;

import main.Main;

import javax.swing.*;

import static constantes.Strings.*;
import static constantes.Enteros.*;

public class SignoLogica extends Signo {

    public void signoZodiacal() {

        int sw = 0;
        while (sw == 0) {
            this.setDias(Integer.parseInt(JOptionPane.showInputDialog(null, MENSAJE_DIAS.getMensaje())));
            this.setMes(Integer.parseInt(JOptionPane.showInputDialog(null, MENSAJE_MES.getMensaje())));


           if ((this.getDias() >= UNO.getValor() && this.getDias() <= TREINTAYUNO.getValor()) && (this.getMes() >= UNO.getValor() && this.getMes() <= DOCE.getValor())) {
               this.signoAries();
               this.signoTauro();
               this.signoGeminis();
               this.signoCancer();
               this.signoLeo();
               this.signoVirgo();
               this.signoLibra();
               this.signoEscorpio();
               this.signoSagitario();
               this.signoCapricornio();
               this.signoAcuario();
               this.signoPiscis();
                sw = 1;
            } else {
                JOptionPane.showMessageDialog(null, MENSAJE_ERROR_DIAS.getMensaje() + "\n" +
                        MENSAJE_ERROR_MES.getMensaje());
            }

        }
        Main.main(null);

    }

    public void signoAries(){
        if ((this.getDias() >= VEINTIUNO.getValor() && this.getMes() == TRES.getValor()) || (this.getDias() <= VEINTE.getValor()) && this.getMes() == CUATRO.getValor()) {
            JOptionPane.showMessageDialog(null, MENSAJE_ARIES.getMensaje());
        }
    }

    public void signoTauro(){
        if ((this.getDias() >= VEINTIUNO.getValor() && this.getMes() == CUATRO.getValor()) || (this.getDias() <= VEINTE.getValor() && this.getMes() == CINCO.getValor())) {
            JOptionPane.showMessageDialog(null, MENSAJE_TAURO.getMensaje());
        }
    }

    public void signoGeminis(){
        if ((this.getDias() >= VEINTIUNO.getValor() && this.getMes() == CINCO.getValor()) || (this.getDias() <= VEINTE.getValor() && this.getMes() == SEIS.getValor())) {
            JOptionPane.showMessageDialog(null, MENSAJE_GEMINIS.getMensaje());
        }
    }

    public void signoCancer(){
        if ((this.getDias() >= VEINTIDOS.getValor() && this.getMes() == SEIS.getValor()) || (this.getDias() <= VEINTIDOS.getValor() && this.getMes() == SIETE.getValor())) {
            JOptionPane.showMessageDialog(null, MENSAJE_CANCER.getMensaje());
        }
    }

    public void signoLeo(){
        if ((this.getDias() >= VEINTITRES.getValor() && this.getMes() == SIETE.getValor()) || (this.getDias() <= VEINTITRES.getValor() && this.getMes() == OCHO.getValor())) {
            JOptionPane.showMessageDialog(null, MENSAJE_LEO.getMensaje());
        }
    }

    public void signoVirgo(){
        if ((this.getDias() >= VEINTICUATRO.getValor() && this.getMes() == OCHO.getValor()) || (this.getDias() <= VEINTITRES.getValor() && this.getMes() == NUEVE.getValor())) {
            JOptionPane.showMessageDialog(null, MENSAJE_VIRGO.getMensaje());
        }
    }

    public void signoLibra(){
        if ((this.getDias() >= VEINTICUATRO.getValor() && this.getMes() == NUEVE.getValor()) || (this.getDias() <= VEINTIDOS.getValor() && this.getMes() == DIEZ.getValor())) {
            JOptionPane.showMessageDialog(null, MENSAJE_LIBRA.getMensaje());
        }
    }

    public void signoEscorpio(){
        if ((this.getDias() >= VEINTITRES.getValor() && this.getMes() == DIEZ.getValor()) || (this.getDias() <= VEINTIDOS.getValor() && this.getMes() == ONCE.getValor())) {
            JOptionPane.showMessageDialog(null, MENSAJE_ESCORPIO.getMensaje());
        }
    }

    public void signoSagitario(){
        if ((this.getDias() >= VEINTITRES.getValor() && this.getMes() == ONCE.getValor()) || (this.getDias() <= VEINTIUNO.getValor() && this.getMes() == DOCE.getValor())) {
            JOptionPane.showMessageDialog(null, MENSAJE_SAGITARIO.getMensaje());
        }
    }

    public void signoCapricornio(){
        if ((this.getDias() >= VEINTIDOS.getValor() && this.getMes() == DOCE.getValor()) || (this.getDias() <= DIECINUEVE.getValor() && this.getMes() == UNO.getValor())) {
            JOptionPane.showMessageDialog(null, MENSAJE_CAPRICORNIO.getMensaje());
        }
    }

    public void signoAcuario(){
        if ((this.getDias() >= VEINTE.getValor() && this.getMes() == UNO.getValor()) || (this.getDias() <= DIECINUEVE.getValor() && this.getMes() == DOS.getValor())) {
            JOptionPane.showMessageDialog(null, MENSAJE_ACUARIO.getMensaje());
        }
    }

    public void signoPiscis(){
        if ((this.getDias() >= VEINTE.getValor() && this.getMes() == DOS.getValor()) || (this.getDias() <= VEINTE.getValor() && this.getMes() == TRES.getValor())) {
            JOptionPane.showMessageDialog(null, MENSAJE_PISCIS.getMensaje());
        }
    }



}
