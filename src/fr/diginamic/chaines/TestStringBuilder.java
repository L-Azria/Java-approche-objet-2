package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {


        long debut = System.currentTimeMillis();

        StringBuilder nombre = new StringBuilder();
        for (int i=1; i<100001; i++){
            nombre.append(i);
        }


        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes StringBuilder :" + (fin - debut));


        long debut2 = System.currentTimeMillis();
        String nombre2 = new String();
        for (int i=1; i<100001; i++){
            nombre2= nombre2 + i;
        }

        long fin2 = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes  Concat + :" + (fin2 - debut2));


    }
}
