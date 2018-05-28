package echipamenteit;

public class EchipamenteIT {

    String marca;
    double pret;

    EchipamenteIT() {
        marca = " ";
        pret = 0;
    }

    EchipamenteIT(String m, double p) {
        marca = m;
        pret = p;
    }

    EchipamenteIT(EchipamenteIT c) {
        marca = c.marca;
        pret = c.pret;
    }

    public void afisare() {
        System.out.println("Marca: " + marca + "\nPret: " + pret+" Lei");
    }

    public String toString() {
        return "\nMarca: " + marca + "\nPret:" + pret+" Lei";
    }

}
