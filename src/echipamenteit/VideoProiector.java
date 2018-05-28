package echipamenteit;

public class VideoProiector extends DispozitiveOutput {

    String tipLentile, tehnologie;
    int rezolutieN;

    VideoProiector() {
        super();
        tipLentile = " ";
        tehnologie = " ";
        rezolutieN = 0;
    }

    VideoProiector(String marca, double pret, String cat, String tL, String teh, int rezN) {
        super(marca, pret, cat);
        tipLentile = tL;
        tehnologie = teh;
        rezolutieN = rezN;
    }

    VideoProiector(VideoProiector c) {
        tipLentile = c.tipLentile;
        tehnologie = c.tehnologie;
        rezolutieN = c.rezolutieN;
    }

    public void afisareVideoProiector() {
        System.out.println("\n====| VIDEO PROIECTOR |====");
        super.afisareDispozitiveOutput();
        System.out.println("Tip Lentile: " + tipLentile + "\nTehnologie: " + tehnologie + "\nRezolutie Nativa: " + rezolutieN);
    }

    public String toString() {
        return "\n====| VIDEO PROIECTOR |====" + super.toString() + "\nTip Lentile: " + tipLentile + "\n Tehnologie: " + tehnologie + "\nRezolutie Nativa: " + rezolutieN+"\n";
    }
}
