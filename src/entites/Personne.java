package entites;

import entites.AdressePostale;



public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adressePostale;

    public Personne(String nom, String prenom, AdressePostale adressePostale){
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }
    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public void afficherIdentite(String[] args) {
        System.out.println(prenom + " " + nom.toUpperCase());
    }
    public void modifierNom(String nvNom){
        this.nom = nvNom;
    }
    public void modifierAdresse(AdressePostale nvAdresse){
        this.adressePostale = nvAdresse;
    }

}
