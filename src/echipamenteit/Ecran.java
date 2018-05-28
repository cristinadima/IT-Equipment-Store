package echipamenteit;

public class Ecran extends DispozitiveOutput {

    int rezolutie, rataRefresh;
    String formatEcran;

    Ecran() {
        super();
        rezolutie = 0;
        rataRefresh = 0;
        formatEcran = " ";
    }

    Ecran(String marca, double pret, String cat, int rez, int rF, String fE) {
        super(marca, pret, cat);
        rezolutie = rez;
        rataRefresh = rF;
        formatEcran = fE;
    }

    Ecran(Ecran c) {
        rezolutie = c.rezolutie;
        rataRefresh = c.rataRefresh;
        formatEcran = c.formatEcran;
    }

    public void afisareEcran() {
        System.out.println("\n====| ECRAN |====");
        super.afisareDispozitiveOutput();
        System.out.println("Rezolutie: " + rezolutie + "\nRata Refresh: " + rataRefresh + "\nFormat Ecran: " + formatEcran);
    }

    public String toString() {
        return "\n====| ECRAN |====" + super.toString() + "\nRezolutie: " + rezolutie + "\nRata Refresh: " + rataRefresh + "\nFormat Ecran: " + formatEcran+"\n";
    }
}
