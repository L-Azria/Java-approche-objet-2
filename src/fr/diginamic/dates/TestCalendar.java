package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2016, 4, 19, 23,59,30);
        Date datecal = cal.getTime();
        SimpleDateFormat formateur1 = new SimpleDateFormat("dd/MM/yyyy");

        String chaine1 = formateur1.format(datecal);
        System.out.println("chaine 1 : " + chaine1);

        Calendar cal2 = Calendar.getInstance();
        Date datecal2 = cal2.getTime();
        SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String chaine2 = formateur2.format(datecal2);
        System.out.println("chaine 2 : " + chaine2);


        SimpleDateFormat formateur3 = new SimpleDateFormat("yyyy/MMMM/EEEE HH:mm:ss", Locale.FRANCE);
        String chaineFr = formateur3.format(datecal2);
        System.out.println("chaine FR : " + chaineFr);

        SimpleDateFormat formateur4 = new SimpleDateFormat("yyyy/MMMM/EEEE HH:mm:ss", new Locale("ru","RU"));
        String chaineRu = formateur4.format(datecal2);
        System.out.println("chaine RU : " + chaineRu);

        SimpleDateFormat formateur5 = new SimpleDateFormat("yyyy/MMMM/EEEE HH:mm:ss", Locale.CHINA);
        String chaineCh = formateur5.format(datecal2);
        System.out.println("chaine CH : " + chaineCh);

        SimpleDateFormat formateur6 = new SimpleDateFormat("yyyy/MMMM/EEEE HH:mm:ss", Locale.GERMANY);
        String chaineGer = formateur6.format(datecal2);
        System.out.println("chaine Ger : " + chaineGer);
    }
}
