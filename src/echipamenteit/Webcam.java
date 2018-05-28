package echipamenteit;

public class Webcam extends DispozitiveInput {

    int rezolutie;
    String microfon, inregistrareVideo;

    Webcam() {
        super();
        rezolutie = 0;
        microfon = " ";
        inregistrareVideo = " ";
    }

    Webcam(String marca, double pret, String con, int rez, String mic, String regv) {
        super(marca, pret, con);
        rezolutie = rez;
        microfon = mic;
        inregistrareVideo = regv;
    }

    Webcam(Webcam c) {
        rezolutie = c.rezolutie;
        microfon = c.microfon;
        inregistrareVideo = c.inregistrareVideo;
    }

    public void afisareWebcam() {
        System.out.println("\n====| WEBCAM |====");
        super.afisareDispozitiveInput();
        System.out.println("Rezolutie: " + rezolutie + "\nMicrofon: " + microfon + "\nInregistrare Video: " + inregistrareVideo);
    }

    public String toString() {
        return "\n====| WEBCAM |====" + super.toString() + "\nRezolutie: " + rezolutie + "\nMicrfon: " + microfon + "\nInregistrare Video: " + inregistrareVideo+"\n";
    }
}
