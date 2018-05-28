package echipamenteit;

public class Boxe extends DispozitiveOutput {

    double tip;
    int putere, putereSubwoofer;

    Boxe() {
        super();
        tip = 0.0f;
        putere = 0;
        putereSubwoofer = 0;
    }

    Boxe(String marca, double pret, String cat, double tipB, int put, int pB) {
        super(marca, pret, cat);
        tip = tipB;
        putere = put;
        putereSubwoofer = pB;
    }

    Boxe(Boxe c) {
        tip = c.tip;
        putere = c.putere;
        putereSubwoofer = c.putereSubwoofer;
    }

    public void afisareBoxe() {
        System.out.println("\n====| BOXE |====");
        super.afisareDispozitiveOutput();
        System.out.println("Tip: " + tip + "\nPutere: " + putere + "\nPutere SubWoofer: " + putereSubwoofer);
    }

    public String toString() {
        return "\n====| BOXE |====" + super.toString() + "\nTip: " + tip + "\nPutere: " + putere + "\nPutere SubWoofer: " + putereSubwoofer+"\n";
    }
}
