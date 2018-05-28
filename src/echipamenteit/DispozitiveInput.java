package echipamenteit;

public class DispozitiveInput extends EchipamenteIT {

    String conectivitate;

    DispozitiveInput() {
        super();
        conectivitate = " ";
    }

    DispozitiveInput(String marca, double pret, String con) {
        super(marca, pret);
        conectivitate = con;
    }

    DispozitiveInput(DispozitiveInput c) {
        conectivitate = c.conectivitate;
    }

    public void afisareDispozitiveInput() {
        super.afisare();
        System.out.println("Conectivitate(USB/Wireless): "+conectivitate);
    }

    public String toString() {
        return super.toString() + "\nConectivitate(USB/Wireless): " + conectivitate;
    }

}
