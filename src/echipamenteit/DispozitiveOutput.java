package echipamenteit;

public class DispozitiveOutput extends EchipamenteIT {

    String categorie;

    DispozitiveOutput() {
        super();
        categorie = " ";
    }

    DispozitiveOutput(String marca, double pret, String cat) {
        super(marca, pret);
        categorie = cat;
    }

    DispozitiveOutput(DispozitiveOutput c) {
        categorie = c.categorie;
    }

    public void afisareDispozitiveOutput() {
        super.afisare();
        System.out.println("Categorie: "+categorie);
    }

    public String toString() {
        return super.toString() + "\nCategorie: " + categorie;
    }
}
