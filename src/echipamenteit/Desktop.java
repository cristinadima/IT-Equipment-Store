package echipamenteit;

public class Desktop extends Sisteme {

    String placaVideo;
    int sursa, stocare;

    Desktop() {
        super();
        placaVideo = " ";
        sursa = 0;
        stocare = 0;
    }

    Desktop(String marca, double pret, double fp, String plv, int surs, int st) {
        super(marca, pret, fp);
        placaVideo = plv;
        sursa = surs;
        stocare = st;
    }

    Desktop(Desktop c) {
        placaVideo = c.placaVideo;
        sursa = c.sursa;
        stocare = c.stocare;
    }

    public void afisareDesktop() {
        System.out.println("\n====| Desktop |====");
        super.afisareSisteme();
        System.out.println("Placa Video: " + placaVideo + "\nSursa: " + sursa + "\nStocare: " + stocare);
    }

    public String toString() {
        return "\n====| Desktop |====" + super.toString() + "\nPlaca Video: " + placaVideo + "\nSursa: " + sursa + "\nStocare: " + stocare+"\n";
    }
}
