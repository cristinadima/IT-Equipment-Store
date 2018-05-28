package echipamenteit;

public class Tastatura extends DispozitiveInput {

    String tip, iluminata, mecanica;

    Tastatura() {
        super();
        tip = " ";
        iluminata = " ";
        mecanica = " ";
    }

    Tastatura(String marca, double pret, String con, String t, String il, String mec) {
        super(marca, pret, con);
        tip = t;
        iluminata = il;
        mecanica = mec;
    }

    Tastatura(Tastatura c) {
        tip = c.tip;
        iluminata = c.iluminata;
        mecanica = c.mecanica;
    }

    public void afisareTastatura() {
        System.out.println("\n====| TASTATURA |====");
        super.afisareDispozitiveInput();
        System.out.println("TIP(Gaming/Normala): " + tip + "\nIluminata(Da/Nu): " + iluminata + "\nMecanica(Da/Nu): " + mecanica);
    }

    public String toString() {
        return "\n====| TASTATURA |====" + super.toString() + "\nTIP(Gaming/Normala): " + tip + "\nIluminata(Da/Nu): " + iluminata + "\nMecanica(Da/Nu): " + mecanica+"\n";
    }
}
