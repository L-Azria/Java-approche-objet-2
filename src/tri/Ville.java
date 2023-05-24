package tri;

public class Ville implements Comparable<Ville> {
    private String nom;
    private Integer nombreHabitants;

    public Ville(String nom, int nombreHabitants) {
        this.nom = nom;
        this.nombreHabitants = nombreHabitants;
    }

    /*trier les noms dans l'ordre alphabétique
    @Override
    public int compareTo(Ville villes) {

        int result = this.nom.compareTo(villes.getNom());
        return result;
    }*/

    @Override
    public int compareTo(Ville o) {
        if (this.nombreHabitants > o.getNombreHabitants()){
            return 1;
        }
        if(this.nombreHabitants < o.getNombreHabitants()){
            return -1;
        }
        return 0;
    }


    @Override
    public String toString() {
        return "nom = " + nom + " , nombreHabitants=" + nombreHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNombreHabitants() {
        return nombreHabitants;
    }

    public void setNombreHabitants(Integer nombreHabitants) {
        this.nombreHabitants = nombreHabitants;
    }



}
