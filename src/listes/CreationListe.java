package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> nombre = new ArrayList<>();
        for (int i=0; i<100; i++){
            nombre.add (i+1);
            System.out.println(nombre.get(i));
        }
        System.out.println("taille de la liste : " + nombre.size());
    }
}
