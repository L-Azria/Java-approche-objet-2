package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get ("/Users/Lan/Desktop/DIginamic/Java - POO/TP/tp 15 - recensement.csv");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        // afficher les 100 premières lignes
        //for (int i=0; i < 100; i++){
        //    System.out.println(lines.get(i));
        //}

        // créer arrayListe pour ajouter les lignes à écrire dans le nouveau fichier
        List<String> addedlines = new ArrayList<>();
        for (int i=0; i < 100; i++){
            addedlines.add(lines.get(i));
        }
        // écrire dans le nouveau fichier avec les éléments de arrayListe
        Path pathCible = Paths.get("/Users/Lan/Desktop/DIginamic/Java - POO/TP/tp 15 - recensement - 100lignes.csv");
        Files.write(pathCible, addedlines, StandardCharsets.UTF_8);

        System.out.println("recensement - 100lignes");
        List<String> lines100 = Files.readAllLines(pathCible, StandardCharsets.UTF_8);
        for (int i=0; i < 100; i++){
            System.out.println(lines100.get(i));
        }



    }
}
