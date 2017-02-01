/*
*@author : Jules LE BRIS
 */

package view;

import controleur.Ctrl;
import model.Takin;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.*;

//proxyPort 1 à 65535
//http://proxyetu.iut-nantes.univ-nantes.prive:3128


public class Vue {


    //modele
    private Takin jeu;
    private JLabel l00, l01, l02, l03, l04, l10, l11, l12, l13, l14, l20, l21, l22, l23, l24, l30, l31, l32, l33, l34, l40, l41, l42, l43, l44;

    public Vue(){
        JFrame f = new JFrame("Jeu du takin");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pannel = new JPanel();
        jeu=new Takin();
        f.addKeyListener(new Ctrl(jeu, this));

        pannel.setLayout(new GridLayout(5,5));

        l00 = new JLabel(jeu.getCase(0, 0).toString());
        l01 = new JLabel(jeu.getCase(0, 1).toString());
        l02 = new JLabel(jeu.getCase(0, 2).toString());
        l03 = new JLabel(jeu.getCase(0, 3).toString());
        l04 = new JLabel(jeu.getCase(0, 4).toString());
        l10 = new JLabel(jeu.getCase(1, 0).toString());
        l11 = new JLabel(jeu.getCase(1, 1).toString());
        l12 = new JLabel(jeu.getCase(1, 2).toString());
        l13 = new JLabel(jeu.getCase(1, 3).toString());
        l14 = new JLabel(jeu.getCase(1, 4).toString());
        l20 = new JLabel(jeu.getCase(2, 0).toString());
        l21 = new JLabel(jeu.getCase(2, 1).toString());
        l22 = new JLabel(jeu.getCase(2, 2).toString());
        l23 = new JLabel(jeu.getCase(2, 3).toString());
        l24 = new JLabel(jeu.getCase(2, 4).toString());
        l30 = new JLabel(jeu.getCase(3, 0).toString());
        l31 = new JLabel(jeu.getCase(3, 1).toString());
        l32 = new JLabel(jeu.getCase(3, 2).toString());
        l33 = new JLabel(jeu.getCase(3, 3).toString());
        l34 = new JLabel(jeu.getCase(3, 4).toString());
        l40 = new JLabel(jeu.getCase(4, 0).toString());
        l41 = new JLabel(jeu.getCase(4, 1).toString());
        l42 = new JLabel(jeu.getCase(4, 2).toString());
        l43 = new JLabel(jeu.getCase(4, 3).toString());
        l44 = new JLabel();

        l00.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l01.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l02.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l03.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l04.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l10.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l11.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l12.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l13.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l14.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l20.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l21.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l22.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l23.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l24.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l30.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l31.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l32.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l33.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l34.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l40.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l41.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l42.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l43.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        l44.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));

        pannel.add(l00);
        pannel.add(l01);
        pannel.add(l02);
        pannel.add(l03);
        pannel.add(l04);
        pannel.add(l10);
        pannel.add(l11);
        pannel.add(l12);
        pannel.add(l13);
        pannel.add(l14);
        pannel.add(l20);
        pannel.add(l21);
        pannel.add(l22);
        pannel.add(l23);
        pannel.add(l24);
        pannel.add(l30);
        pannel.add(l31);
        pannel.add(l32);
        pannel.add(l33);
        pannel.add(l34);
        pannel.add(l40);
        pannel.add(l41);
        pannel.add(l42);
        pannel.add(l43);
        pannel.add(l44);

        f.getContentPane().add(pannel);
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.pack();
        f.setSize(500, 500);
        //f.setExtendedState(Frame.MAXIMIZED_BOTH);

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

    public void maj() {

        if (jeu.getCase(0, 0) == null) {
            l00.setText("");
        } else {
            l00.setText(jeu.getCase(0, 0).toString());
        }

        if (jeu.getCase(0, 1) != null) {
            l01.setText(jeu.getCase(0, 1).toString());
        } else {
            l01.setText("");
        }
        if (jeu.getCase(0, 2) != null) {
            l02.setText(jeu.getCase(0, 2).toString());
        } else {
            l02.setText("");
        }
        if (jeu.getCase(0, 3) != null) {
            l03.setText(jeu.getCase(0, 3).toString());
        } else {
            l03.setText("");
        }
        if (jeu.getCase(0, 4) != null) {
            l04.setText(jeu.getCase(0, 4).toString());
        } else {
            l04.setText("");
        }
        if (jeu.getCase(1, 0) != null) {
            l10.setText(jeu.getCase(1, 0).toString());
        } else {
            l10.setText("");
        }
        if (jeu.getCase(1, 1) != null) {
            l11.setText(jeu.getCase(1, 1).toString());
        } else {
            l11.setText("");
        }
        if (jeu.getCase(1, 2) != null) {
            l12.setText(jeu.getCase(1, 2).toString());
        } else {
            l12.setText("");
        }
        if (jeu.getCase(1, 3) != null) {
            l13.setText(jeu.getCase(1, 3).toString());
        } else {
            l13.setText("");
        }
        if (jeu.getCase(1, 4) != null) {
            l14.setText(jeu.getCase(1, 4).toString());
        } else {
            l14.setText("");
        }
        if (jeu.getCase(2, 0) != null) {
            l20.setText(jeu.getCase(2, 0).toString());
        } else {
            l20.setText("");
        }
        if (jeu.getCase(2, 1) != null) {
            l21.setText(jeu.getCase(2, 1).toString());
        } else {
            l21.setText("");
        }
        if (jeu.getCase(2, 2) != null) {
            l22.setText(jeu.getCase(2, 2).toString());
        } else {
            l22.setText("");
        }
        if (jeu.getCase(2, 3) != null) {
            l23.setText(jeu.getCase(2, 3).toString());
        } else {
            l23.setText("");
        }
        if (jeu.getCase(2, 4) != null) {
            l24.setText(jeu.getCase(2, 4).toString());
        } else {
            l24.setText("");
        }
        if (jeu.getCase(3, 0) != null) {
            l30.setText(jeu.getCase(3, 0).toString());
        } else {
            l30.setText("");
        }
        if (jeu.getCase(3, 1) != null) {
            l31.setText(jeu.getCase(3, 1).toString());
        } else {
            l31.setText("");
        }
        if (jeu.getCase(3, 2) != null) {
            l32.setText(jeu.getCase(3, 2).toString());
        } else {
            l32.setText("");
        }
        if (jeu.getCase(3, 3) != null) {
            l33.setText(jeu.getCase(3, 3).toString());
        } else {
            l33.setText("");
        }
        if (jeu.getCase(3, 4) != null) {
            l34.setText(jeu.getCase(3, 4).toString());
        } else {
            l34.setText("");
        }
        if (jeu.getCase(4, 0) != null) {
            l40.setText(jeu.getCase(4, 0).toString());
        } else {
            l40.setText("");
        }
        if (jeu.getCase(4, 1) != null) {
            l41.setText(jeu.getCase(4, 1).toString());
        } else {
            l41.setText("");
        }
        if (jeu.getCase(4, 2) != null) {
            l42.setText(jeu.getCase(4, 2).toString());
        } else {
            l42.setText("");
        }
        if (jeu.getCase(4, 3) != null) {
            l43.setText(jeu.getCase(4, 3).toString());
        } else {
            l43.setText("");
        }
        if (jeu.getCase(4, 4) != null) {
            l44.setText(jeu.getCase(4, 4).toString());
        } else {
            l44.setText("");
        }
    }
}
