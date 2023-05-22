package fr.diginamic.banque.entites;

public class Credit extends Operation{
    public Credit(String dateOperation, float montant) {
        super(dateOperation, montant);
    }

    @Override
    public String getType(){
        return "CREDIT";
    }


}
