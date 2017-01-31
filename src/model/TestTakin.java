package model;

import model.exception.MouvementException;

/**
 * Created by E155251B on 31/01/17.
 */
public class TestTakin {
    public static void main(String[] args) {

        Integer n=new Integer(32);
        System.out.println(n.toString());
        System.out.println();

        Takin jeu=new Takin();

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if (jeu.getCase(i, j)!=null){
                    System.out.print(jeu.getCase(i, j)+" | ");
                }else{

                }
            }
            System.out.println("");
        }

        try {
            jeu.haut();
        }
        catch (MouvementException ee){
            ee.printStackTrace();
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if (jeu.getCase(i, j)!=null){
                    System.out.print(jeu.getCase(i, j)+" | ");
                }else{

                }
            }
            System.out.println("");
        }
    }
}
