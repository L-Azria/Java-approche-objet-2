package fr.diginamic.banque.entites;

public class Compte {
    private long numeroDeCompte;
    private float soldeDuCompte;

    public Compte(long numeroDeCompte, float soldeDuCompte) {
        this.numeroDeCompte = numeroDeCompte;
        this.soldeDuCompte = soldeDuCompte;
    }

    public long getNumeroDeCompte() {
        return numeroDeCompte;
    }

    public void setNumeroDeCompte(long numeroDeCompte) {
        this.numeroDeCompte = numeroDeCompte;
    }

    public float getSoldeDuCompte() {
        return soldeDuCompte;
    }

    public void setSoldeDuCompte(float soldeDuCompte) {
        this.soldeDuCompte = soldeDuCompte;
    }

    @Override
    public String toString() {
        return "NumeroDeCompte=" + numeroDeCompte +
                ", \n  soldeDuCompte=" + soldeDuCompte;
    }
}
