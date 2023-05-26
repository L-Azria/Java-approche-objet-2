package maps;

import listes.Ville;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapVilles {
    public static void main(String[] args) {

        Ville ville1 = new Ville("Nice", 343000);
        Ville ville2 = new Ville("Carcassonne", 47800);
        Ville ville3 = new Ville("Narbonne", 53400);
        Ville ville4 = new Ville("Lyon", 484000);
        Ville ville5 = new Ville("Foix", 9700);
        Ville ville6 = new Ville("Pau", 77200);
        Ville ville7 = new Ville("Marseille", 850700);
        Ville ville8 = new Ville("Tarbes", 40600);


        HashMap<String,Ville> mapVilles = new HashMap<>();
        mapVilles.put("Nice", ville1);
        mapVilles.put("Carcassonne", ville2);
        mapVilles.put("Narbonne", ville3);
        mapVilles.put("Lyon", ville4);
        mapVilles.put("Foix", ville5);
        mapVilles.put("Pau", ville6);
        mapVilles.put("Marseille", ville7);
        mapVilles.put("Tarbes", ville8);


        //System.out.println(mapVilles.values());


        //trouver une variable qui stocke le nb min d'habitation
        //trouver une variable qui stocke la clé de stockage

        int villeMin = mapVilles.values().iterator().next().getNombreHabitants();

        String cleVilleMin = mapVilles.keySet().iterator().next();

        for (String key: mapVilles.keySet()){
            System.out.println(key);
            Ville ville = mapVilles.get(key);
            if (ville.getNombreHabitants()<villeMin){
                villeMin = ville.getNombreHabitants();
                cleVilleMin = key;
            }
        }

        mapVilles.remove(cleVilleMin);

        for (Ville v: mapVilles.values()){
            System.out.println(v);
        }



    }

}
