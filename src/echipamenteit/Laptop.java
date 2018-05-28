
package echipamenteit;


public class Laptop extends Sisteme {

    int rezolutie, putereBaterie;
    double diagonala;

    Laptop() {
        super();
        rezolutie = 0;
        putereBaterie = 0;
        diagonala = 0.0f;
    }

    Laptop(String marca, double pret, double fp, int rez, int pB, double diag) {
        super(marca, pret, fp);
        rezolutie = rez;
        putereBaterie = pB;
        diagonala = diag;
    }

    Laptop(Laptop c) {
        rezolutie = c.rezolutie;
        putereBaterie = c.putereBaterie;
        diagonala = c.diagonala;
    }

    public void afisareLaptop() {
        System.out.println("\n====| LAPTOP |====");
        super.afisareSisteme();
        System.out.println("Rezolutie: " + rezolutie + "\nPutere Baterie: " + putereBaterie + "\nDiagonala: " + diagonala);
    }

    public String toString() {
        return "\n====| LAPTOP |====" + super.toString()+ "\nRezolutie: " + rezolutie + "\nPutere Baterie: " + putereBaterie + "\nDiagonala: " + diagonala+"\n";
    }
}
