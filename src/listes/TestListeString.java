package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> listeVille = new ArrayList<>(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
        String villeMaxLettre = "";

        for(int i=0; i< listeVille.size(); i++){
            String ville = listeVille.get(i);
            if (ville.length() > villeMaxLettre.length()){
                villeMaxLettre = ville;
            }
        }

        /*for (String ville : listeVille) {
            if (ville.length() > villeMaxLettre.length()) {
                villeMaxLettre = ville;
            }
        }*/
        System.out.println("ville max lettre : " + villeMaxLettre);

        //Modifiez le contenu de la liste de manière à mettre tous les noms de villes en majuscules.
        for (int i = 0; i < listeVille.size(); i++) {
            String villeMasjuscule = listeVille.get(i);
            listeVille.set(i, villeMasjuscule.toUpperCase());
        }
        System.out.println(listeVille);

        //Supprimez de la liste les villes dont le nom commence par la lettre N.
        
        ListIterator<String> iter = listeVille.listIterator();
        while (iter.hasNext()) {
            String  lV = iter.next();
            if (lV.startsWith("N")){
                iter.remove();
            }
        }
        System.out.println(listeVille);


    }
}
