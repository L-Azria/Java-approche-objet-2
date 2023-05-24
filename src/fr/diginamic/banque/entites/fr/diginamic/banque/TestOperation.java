package fr.diginamic.banque.entites.fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

import java.util.Objects;

public class TestOperation {
    public static void main(String[] args) {
        Debit debit1 = new Debit("20/05/2023", 34.8f);
        Debit debit2 = new Debit("22/05/2023", 56.2f);
        Credit credit1= new Credit("18/05/2023", 34.5f);
        Credit credit2= new Credit("19/05/2023", 76.0f);
        Operation[] op = {debit1,debit2,credit1,credit2};
        float montantGlobal = 0f;

        for (int i=0; i < op.length; i++){
            System.out.println(op[i]);
        }
        //System.out.println(debit1.getType());
        //System.out.println(debit1.getMontant());

        for (int i=0; i< op.length; i++) {
            if (op[i].getType().equals("CREDIT")) {
                //System.out.println("+++");
                montantGlobal = montantGlobal + op[i].getMontant();
            } else if (op[i].getType().equals("DEBIT")) {
               //System.out.println("---");
                montantGlobal = montantGlobal - op[i].getMontant();
            }

        }
        System.out.println("montantGlobal : " + montantGlobal);

    }


}
