package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("d1 : " + d1);

        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        String chaine1 = formateur.format(d1);
        System.out.println("chaine 1 : " + chaine1);

        Date d2 = new Date(116,4,19, 23, 59,30);
        System.out.println("d2 : " + d2);

        SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String chaine2 = formateur2.format(d2);
        System.out.println("chaine 2 : " + chaine2);

        String chaine3 = formateur2.format(d1);
        System.out.println("chaine 3 : " + chaine3);

    }
}
