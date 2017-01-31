/*
*@author : Jules LE BRIS
 */

package view;

import model.Takin;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.*;

//proxyPort 1 à 65535
//http://proxyetu.iut-nantes.univ-nantes.prive:3128


public class Vue {


    //modele
    private Takin takin;

    public Vue(){
        JFrame f = new JFrame("Jeu du takin");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pannel = new JPanel();



        f.getContentPane().add(pannel);
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.pack();
        f.setExtendedState(Frame.MAXIMIZED_BOTH);
    }


    public static void setBestLookAndFeelAvailable(){
        String system_lf = UIManager.getSystemLookAndFeelClassName().toLowerCase();
        if(system_lf.contains("metal")){
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            }catch (Exception e) {}
        }else{
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }catch (Exception e) {}
        }
    }

    public static void main(String[] args) {
        setBestLookAndFeelAvailable();
        Vue fenetre = new Vue();
    }
}
