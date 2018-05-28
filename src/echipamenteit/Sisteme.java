package echipamenteit;

public class Sisteme extends EchipamenteIT {

    double FrecventaProcesor;

    Sisteme() {
        super();
        FrecventaProcesor = 0;
    }

    Sisteme(String marca, double pret, double fp) {
        super(marca, pret);
        FrecventaProcesor = fp;
    }

    Sisteme(Sisteme c) {
        FrecventaProcesor = c.FrecventaProcesor;
    }

    public void afisareSisteme() {
        super.afisare();
        System.out.println("Frecventa Procesor: " + FrecventaProcesor);
    }

    public String toString() {
        return super.toString()+ "\nFrecventa Procesor: " + FrecventaProcesor;
    }
}
