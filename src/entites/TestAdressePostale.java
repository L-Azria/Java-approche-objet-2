package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale(1, "rue 1", 12345, "Montpellier");
        AdressePostale adr2 = new AdressePostale(2, "rue 2", 12345, "Montpellier");
        System.out.println(adr2);
    }
}
