package model;

import model.exception.MouvementException;

import java.util.*;

/**
 * Created by E155251B on 31/01/17.
 */
public class Takin {
    private Integer[][] jeu;
    private int lv;
    private int cv;

    public Takin(){
        this.jeu = new Integer[5][5];
        ArrayList<Integer> l=new ArrayList(25);

        for(int cpt=0; cpt<25; cpt++){
            l.add(cpt);
        }
        Random ran=new Random();
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                int index=ran.nextInt(l.size());
                // on remplis le tableau avec l'element du vector qui a pour indice (index)
                jeu[i][j]=l.get(index);
                // on supprime l'element utitlisé pour ne pas avoir de doublons
                l.remove(index);
            }
        }
        lv=4;
        cv=4;
        this.jeu[4][4]=null;
    }

    public void haut() throws MouvementException{
        if(lv==0){
            throw new MouvementException("Mouvement impossible : case vide déja en haut");
        }else{
            jeu[lv][cv]=jeu[lv-1][cv];
            lv=lv-1;
            jeu[lv][cv]=null;
        }

    }

    public void bas() throws MouvementException{
        if(lv==4){
            throw new MouvementException("Mouvement impossible : case vide déja en bas");
        }else{
            jeu[lv][cv]=jeu[lv+1][cv];
            lv=lv+1;
            jeu[lv][cv]=null;
        }
    }

    public void droite() throws MouvementException{
        if(cv==4){
            throw new MouvementException("Mouvement impossible : case vide déja à droite");
        }else{
            jeu[lv][cv]=jeu[lv][cv+1];
            cv=cv+1;
            jeu[lv][cv]=null;
        }
    }

    public void gauche() throws MouvementException{
        if(cv==0){
            throw new MouvementException("Mouvement impossible : case vide déja à gauche");
        }else{
            jeu[lv][cv]=jeu[lv][cv+1];
            cv=cv-1;
            jeu[lv][cv]=null;
        }
    }

    public Boolean gagne(){
        if(jeu[0][0]==0 && jeu[0][1]==1 && jeu[0][2]==2 && jeu[0][3]==3 && jeu[0][4]==4 &&
                jeu[1][0]==5 && jeu[1][1]==6 && jeu[1][2]==7 && jeu[1][3]==8 && jeu[1][4]==9 &&
                jeu[2][0]==10 && jeu[2][1]==11 && jeu[2][2]==12 && jeu[2][3]==13 && jeu[2][4]==14 &&
                jeu[3][0]==15 && jeu[3][1]==16 && jeu[3][2]==17 && jeu[3][3]==18 && jeu[3][4]==19 &&
                jeu[4][0]==20 && jeu[4][1]==21 && jeu[4][2]==22 && jeu[4][3]==23 && jeu[4][4]==null){
            return true;
        } else{
           return false;
        }
    }

    public Integer[][] getJeu() {
        return jeu;
    }

    public int getLv() {
        return lv;
    }

    public int getCv() {
        return cv;
    }
}
