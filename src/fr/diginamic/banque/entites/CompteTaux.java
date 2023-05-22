package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    private float tauxRemuneration;
    public CompteTaux(long numeroDeCompte, float soldeDuCompte, float tauxRemuneration) {
        super(numeroDeCompte, soldeDuCompte);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return super.toString() + " \n  tauxRemuneration=" + tauxRemuneration;
    }
}
