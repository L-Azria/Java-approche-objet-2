package entites;

public class TestPersonne {

    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale(1, "rue 1", 12345, "Montpellier");
        AdressePostale adr2 = new AdressePostale(2, "rue 2", 12345, "Montpellier");
        Personne pers1 = new Personne("Azria","David", adr1);
        Personne pers2 = new Personne("Azria", "Lan", adr2);
        Personne pers3 = new Personne("nom 3", "prénom 3");
        System.out.println(pers1);

    }
}
