package fr.diginamic.banque.entites;

public abstract class Operation {
    String dateOperation;
    float montant;

    @Override
    public String toString() {
        return "dateOperation=" + dateOperation +", montant" + montant + " " + getType();
    }

    public Operation(String dateOperation, float montant) {
        this.dateOperation = dateOperation;
        this.montant = montant;

    }
    public abstract String getType();

    public String getDateOperation() {
        return dateOperation;
    }

    public float getMontant() {
        return montant;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }
}
