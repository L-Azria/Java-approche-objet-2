package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        // Exercice LireFichierAvecInstanciation
        ArrayList<Ville> villes = new ArrayList<>();

        Path path = Paths.get("/Users/Lan/Desktop/DIginamic/Java - POO/TP/tp 15 - recensement.csv");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        ListIterator<String> iter = lines.listIterator();
        iter.next();
        while (iter.hasNext()) {
            String line = iter.next();
            String[] tokens = line.split(";");
            villes.add(new Ville(tokens[6], tokens[2], tokens[1], Integer.parseInt(tokens[9].replaceAll(" ", ""))));
            //System.out.println(tokens[6] + ", " + tokens[2] + ", " + tokens[1] + ", " + Integer.parseInt(tokens[9].replaceAll(" ", "")));
        }
        System.out.println(villes);


        // Exercice GenererFichier
        ArrayList<Ville> villes25k = new ArrayList<>();

        Iterator<Ville> iter2 = villes.iterator();
        while (iter2.hasNext()) {
            Ville v = iter2.next();
            if (v.getPopulationTotale() > 25000){
                villes25k.add(v);
            }
        }
        System.out.println(villes25k);

        //Path v25k = Paths.get("/Users/Lan/Desktop/DIginamic/Java - POO/TP/tp 15 - recensement - villes25k.csv");
       // Files.write(v25k, villes25k, StandardCharsets.UTF_8);
        // il faut convertir le villes 25k en string ?






    }
}






        // Exercice LireFichier
        /*Path path = Paths.get ("/Users/Lan/Desktop/DIginamic/Java - POO/TP/tp 15 - recensement.csv");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        for (String line:lines){
            System.out.println(line);
        }*/

