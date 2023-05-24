package listes;

import java.util.*;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> targetList = new ArrayList<>(Arrays.asList(new Integer[]{-1, 5, 7, 3, -2, 4, 8, 5}));

        Iterator<Integer> iterator = targetList.iterator();
        while (iterator.hasNext()) {
            Integer tL = iterator.next();
        }
        System.out.println(targetList);

        // afficher la taille de la liste
        System.out.println("taille de la liste : "+targetList.size());

        //Recherchez et affichez le plus grand élément de la liste
        Integer elementMax = Collections.max(targetList);
        System.out.println("valeur max : " + elementMax);

        //Supprimez le plus petit élément de la liste et affichez le résultat
        Integer elementMin = Collections.min(targetList);
        System.out.println("min : " + elementMin);

        Iterator<Integer> iter = targetList.iterator();
        while (iter.hasNext()) {
            Integer tL2 = iter.next();
            if (tL2.equals(elementMin)){
                iter.remove();
            }
        }
        System.out.println(targetList);

        // Recherchez tous les éléments négatifs et modifiez les de manière à ce qu’ils deviennent positifs

        ListIterator<Integer> iter3 = targetList.listIterator();
        while (iter3.hasNext()) {
            Integer tL2 = iter3.next();
            if (tL2 < 0){
                iter3.set(-tL2);
            }
        }
        System.out.println(targetList);
        
    }
}




