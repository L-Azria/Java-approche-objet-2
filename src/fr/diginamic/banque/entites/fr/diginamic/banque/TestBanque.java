package fr.diginamic.banque.entites.fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {


    public static void main(String[] args) {
        Compte compte1 = new Compte(1234, 60);
        //System.out.println(compte1);

        CompteTaux compteTaux1 =  new CompteTaux(2345, 80, 0.25f);

        Compte[] tableauCompte = {compte1, compteTaux1};

        for(int i = 0; i < tableauCompte.length; i++){
            System.out.println(tableauCompte[i]);
        }

    }

}
