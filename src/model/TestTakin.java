package model;

import model.exception.MouvementException;

/**
 * Created by E155251B on 31/01/17.
 */
public class TestTakin {
    public static void main(String[] args) {
        Takin jeu=new Takin();
        System.out.println(jeu.getJeu());
        try{
            jeu.bas();
        }catch (MouvementException e){
            e.printStackTrace();
        }
        try {
            jeu.haut();
        }
        catch (MouvementException ee){
            ee.printStackTrace();
        }

    }
}
