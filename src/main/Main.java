package main;

import javax.swing.*;


import arreglo.VectorLogica;
import empleado.SalariosLogica;
import imc.IndiceLogica;
import zodiaco.SignoLogica;

import static constantes.Strings.*;

public class Main {

    public static void main(String [] args){

       int num=Integer.parseInt(JOptionPane.showInputDialog(null, MENSAJE_MENU.getMensaje()+"\n"+
                MENSAJE_MENU1.getMensaje()+"\n"+
                MENSAJE_MENU2.getMensaje()+"\n"+
                MENSAJE_MENU3.getMensaje()+"\n"+
                MENSAJE_MENU4.getMensaje()+"\n"+
                MENSAJE_MENU5.getMensaje()+"\n"));

       if(num<0 || num >4){
           JOptionPane.showMessageDialog(null,MENSAJE_OPCION_NO_VALIDA.getMensaje());
           Main.main(null);
       }else{
           switch (num){
               case 1:
                   IndiceLogica indiceLogica=new IndiceLogica();
                   indiceLogica.pedirValores();
                   double imc=indiceLogica.calcularIMC();
                   indiceLogica.mostrarResultado(imc);
                   break;
               case 2:
                   SignoLogica signoLogica=new SignoLogica();
                   signoLogica.signoZodiacal();
                   break;
               case 3:
                   SalariosLogica salariosLogica=new SalariosLogica();
                   salariosLogica.calcularMaximoSalario();
                   int valor=salariosLogica.calcularPromedio();
                   salariosLogica.imprimirResultados(valor);
                   break;
               case 4:
                   VectorLogica vectorLogica=new VectorLogica();
                   vectorLogica.ingresarValores();
                   break;
               case 0:
                   System.exit(0);
                   break;
               default:
                   break;

           }
       }

    }

}
