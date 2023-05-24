package tri;


import java.util.ArrayList;
import java.util.Collections;

public class TestTri {
    public static void main(String[] args) {
            Ville ville1 = new Ville("Nice", 343000);
            Ville ville2 = new Ville("Carcassonne", 47800);
            Ville ville3 = new Ville("Narbonne", 53400);
            Ville ville4 = new Ville("Lyon", 484000);
            Ville ville5 = new Ville("Foix", 9700);
            Ville ville6 = new Ville("Pau", 77200);
            Ville ville7 = new Ville("Marseille", 850700);
            Ville ville8 = new Ville("Tarbes", 40600);

            ArrayList<Ville> villes = new ArrayList<>();
            villes.add (ville1);
            villes.add (ville2);
            villes.add (ville3);
            villes.add (ville4);
            villes.add (ville5);
            villes.add (ville6);
            villes.add (ville7);
            villes.add (ville8);

        // Triez la liste par l'ordre alphabétique
        //Collections.sort(villes);
        //System.out.println("liste des villes par l'ordre alphabétique");
        //System.out.println(villes);

        //Triez la liste par l'ordre nb d'habitants croissant
        //Collections.sort(villes);
        //System.out.println("la liste par l'ordre nb d'habitants croissant");
        //System.out.println(villes);


        //Triez la liste par l'ordre nb d'habitants croissant avec Comparator
        Collections.sort(villes, new ComparatorHabitant());
        System.out.println("la liste par l'ordre nb d'habitants croissant");
        System.out.println(villes);

        // Triez la liste par l'ordre alphabétique
        Collections.sort(villes, new ComparatorNom());
        System.out.println("la liste par l'ordre alphabétique");
        System.out.println(villes);

    }
}
