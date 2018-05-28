package echipamenteit;

public class TabletaGrafica extends DispozitiveInput {

    int rezolutie, vitezaPen;
    double presiune;

    TabletaGrafica() {
        super();
        rezolutie = 0;
        vitezaPen = 0;
        presiune = 0;
    }

    TabletaGrafica(String marca, double pret, String con, int rez, int vp, double pres) {
        super(marca, pret, con);
        rezolutie = rez;
        vitezaPen = vp;
        presiune = pres;
    }

    TabletaGrafica(TabletaGrafica c) {

        rezolutie = c.rezolutie;
        vitezaPen = c.vitezaPen;
        presiune = c.presiune;
    }

    public void afisareTabletaGrafica() {
        System.out.println("\n====| TABLETA GRAFICA |====");
        super.afisareDispozitiveInput();
        System.out.println("Rezolutie: " + rezolutie + "\nViteza Pen: " + vitezaPen + "\nPresiune: " + presiune);
    }

    public String toString() {
        return "\n====| TABLETA GRAFICA |====" + super.toString() + "\nRezolutie: " + rezolutie + "\nViteza Pen: " + vitezaPen + "\nPresiune: " + presiune+"\n";
    }
}
