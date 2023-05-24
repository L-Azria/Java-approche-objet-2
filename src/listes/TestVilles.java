package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestVilles {
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


        //Recherchez et affichez la ville la plus peuplée
        Ville villeHabitantMax = new Ville("", 0);

        for(int i = 0; i< villes.size(); i++){
            Ville ville = villes.get(i);
            //System.out.println(ville);
            //System.out.println(ville.getNombreHabitants());
            if (ville.getNombreHabitants() > villeHabitantMax.getNombreHabitants()){
                // villeHabitantMax.setNombreHabitants(ville.getNombreHabitants());
                // villeHabitantMax.setNom(ville.getNom());
                villeHabitantMax = villes.get(i);
            }
        }
        System.out.println("la ville la plus peuplée : " + villeHabitantMax.getNom());

        System.out.println();

        //Supprimez la ville la moins peuplée
        Ville villeHabitantMin = villes.get(0);
        for (int i = 0; i< villes.size(); i++){
            Ville ville = villes.get(i);
            if(ville.getNombreHabitants() < villeHabitantMin.getNombreHabitants()){
                //villeHabitantMin.setNombreHabitants(ville.getNombreHabitants());
                //villeHabitantMin.setNom(ville.getNom());
                 villeHabitantMin = villes.get(i);
            }
        }
        System.out.println("la ville la moin peuplée : " + villeHabitantMin.getNom());

        Iterator<Ville> iter = villes.iterator();
        while (iter.hasNext()) {
            Ville v = iter.next();
            if (v.equals(villeHabitantMin)){
                iter.remove();
            }
        }
        System.out.println(villes);


        // Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules

        for (int i = 0; i< villes.size(); i++){
            Ville ville = villes.get(i);
            if(ville.getNombreHabitants() > 100000){
                ville.setNom(ville.getNom().toUpperCase());
            }

        }
        System.out.println(villes);
        }

    }
