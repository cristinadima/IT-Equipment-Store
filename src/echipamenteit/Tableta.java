
package echipamenteit;


public class Tableta extends Sisteme {

    float camera;
    double diagonala;
    String soft;

    Tableta() {
        super();
        diagonala = 0.0f;
        camera = 0.0f;
        soft = " ";
    }

    Tableta(String marca, double pret, double fp, double diag, float cam, String softw) {
        super(marca, pret, fp);
        diagonala = diag;
        camera = cam;
        soft = softw;
    }

    Tableta(Tableta c) {
        diagonala = c.diagonala;
        camera = c.camera;
        soft = c.soft;
    }

    public void afisareTableta() {
        System.out.println("\n====| TABLETA |====");
        super.afisareSisteme();
        System.out.println("Diagonala: " + diagonala + "\nCamera: " + camera + "\nSoft: " + soft);
    }

    public String toString() {
        return "\n====| TABLETA |====" + super.toString() + "\nDiagonala: " + diagonala + "\nCamera: " + camera + "\nSoft: " + soft+"\n";
    }
}
