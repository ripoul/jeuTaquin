package controleur;

import model.Takin;
import model.exception.MouvementException;
import view.Vue;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.event.KeyEvent.*;

/**
 * Created by zapoutou on 31/01/17.
 */
public class Ctrl implements KeyListener{
    Takin jeu;
    Vue vue;

    public Ctrl(Takin jeu, Vue vue){
        this.jeu=jeu;
        this.vue=vue;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode()==VK_UP){
            System.out.println("haut");
            try{
                jeu.haut();
                vue.maj();
            }catch (MouvementException e){
                JOptionPane.showMessageDialog(null,"on ne peut pas aller en haut","ERREUR",JOptionPane.ERROR_MESSAGE);
            }
            if(jeu.gagne()){
                JOptionPane.showMessageDialog(null,"GAGNE");
            }
        }

        if (keyEvent.getKeyCode()==VK_DOWN){
            System.out.println("bas");
            try{
                jeu.bas();
                vue.maj();
            }catch (MouvementException e){
                JOptionPane.showMessageDialog(null,"on ne peut pas aller en bas","ERREUR",JOptionPane.ERROR_MESSAGE);
            }

            if(jeu.gagne()){
                JOptionPane.showMessageDialog(null,"GAGNE");
            }
        }

        if (keyEvent.getKeyCode()==VK_LEFT){
            System.out.println("gauche");
            try{
                jeu.gauche();
                vue.maj();
            }catch (MouvementException e){
                JOptionPane.showMessageDialog(null,"on ne peut pas aller a gauche","ERREUR",JOptionPane.ERROR_MESSAGE);
            }
            if(jeu.gagne()){
                JOptionPane.showMessageDialog(null,"GAGNE");
            }
        }

        if (keyEvent.getKeyCode()==VK_RIGHT){
            System.out.println("droite");
            try{
                jeu.droite();
                vue.maj();
            }catch (MouvementException e){
                JOptionPane.showMessageDialog(null,"on ne peut pas aller a droite","ERREUR",JOptionPane.ERROR_MESSAGE);
            }
            if(jeu.gagne()){
                JOptionPane.showMessageDialog(null,"GAGNE");
            }
        }

        if(keyEvent.getKeyCode()==VK_F1){
            System.out.println("F1");
            jeu.setCv(3);
            jeu.setLv(4);

            int cpt=0;
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    if(i==4 && j==4){
                        this.jeu.setCase(i, j, null);
                    }
                    else{
                        this.jeu.setCase(i, j, cpt);
                        cpt++;
                    }
                }
            }

            jeu.setCase(4,4,23);
            jeu.setCase(4,3,null);
            vue.maj();
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
