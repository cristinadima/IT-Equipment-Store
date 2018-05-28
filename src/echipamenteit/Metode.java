package echipamenteit;

public class Metode {

    /*======== AFISARI ===== */
    public String afisareLaptop() {

        Laptop[] la = new Laptop[5];
        la[0] = new Laptop("Samsung", 1000.99, 1.8, 800, 1200, 12.3);
        la[1] = new Laptop("Lenovo", 1200.99, 1.9, 1300, 1500, 12.3);
        la[2] = new Laptop("Asus", 3500.99, 2.6, 1920, 2600, 15.6);
        la[3] = new Laptop("Apple", 5000.99, 1.8, 1300, 3000, 15.6);
        la[4] = new Laptop("HP", 4599.99, 1.9, 1920, 4500, 17.5);
        return la[0].toString() + la[1].toString() + la[2].toString() + la[3].toString() + la[4].toString();
    } 
    
    //foloseste metoda creata in fisierul Laptop pentru afisare 
    //afiseaza vectorul folosind metoda toString creata in fisierul Laptop.java
    

    public String afisareDesktop() {
        Desktop[] dk = new Desktop[5];
        dk[0] = new Desktop("Myria", 1200.98, 2.0, "AMD", 400, 1000);
        dk[1] = new Desktop("IBM", 2500.99, 1.8, "AMD", 650, 512);
        dk[2] = new Desktop("Acer", 2100.99, 3.0, "INTEL", 550, 1000);
        dk[3] = new Desktop("Myria", 3200.99, 3.0, "NVIDIA", 600, 2000);
        dk[4] = new Desktop("Asus", 1500.99, 2.0, "NVIDIA", 500, 2000);
        return dk[0].toString() + dk[1].toString() + dk[2].toString() + dk[3].toString() + dk[4].toString();
    }

    public String afisareTableta() {
        Tableta[] tb = new Tableta[5];
        tb[0] = new Tableta("Samsung", 850.99, 2.0, 10, 5, "Android");
        tb[1] = new Tableta("Lenovo", 450.99, 1.5, 7.1, 5, "Android");
        tb[2] = new Tableta("Eboda", 550.99, 1.8, 9, 3, "Windows");
        tb[3] = new Tableta("Allview", 350.99, 1.2, 7.1, 2, "Android");
        tb[4] = new Tableta("Apple", 1600.99, 1.5, 10, 3, "IOS");
        return tb[0].toString() + tb[1].toString() + tb[2].toString() + tb[3].toString() + tb[4].toString();
    }

    public String afisareTastatura() {
        Tastatura[] ts = new Tastatura[5];
        ts[0] = new Tastatura("Trust", 120.99, "USB", "Business", "Nu", "Nu");
        ts[1] = new Tastatura("Natec", 119.99, "Wireless", "Gaming", "Da", "Nu");
        ts[2] = new Tastatura("Microsoft", 135.00, "USB", "Business", "Nu", "Nu");
        ts[3] = new Tastatura("Razer", 1000.00, "USB", "Gaming", "Da", "Da");
        ts[4] = new Tastatura("Logitech", 629.99, "Wireless", "Gaming", "Da", "Da");
        return ts[0].toString() + ts[1].toString() + ts[2].toString() + ts[3].toString() + ts[4].toString();
    }

    public String afisareTabletaGrafica() {
        TabletaGrafica[] tg = new TabletaGrafica[5];
        tg[0] = new TabletaGrafica("Genius", 209.99, "USB", 2560, 133, 1024);
        tg[1] = new TabletaGrafica("Wacom", 312.99, "USB", 2560, 168, 1024);
        tg[2] = new TabletaGrafica("Wacom", 450.99, "Wireless", 2680, 260, 2048);
        tg[3] = new TabletaGrafica("Genius", 600.99, "USB", 2680, 280, 2048);
        tg[4] = new TabletaGrafica("Wacom", 1111.99, "Wireless", 2560, 133, 3056);
        return tg[0].toString() + tg[1].toString() + tg[2].toString() + tg[3].toString() + tg[4].toString();
    }

    public String afisareWebcam() {
        Webcam[] wb = new Webcam[5];
        wb[0] = new Webcam("Canyon", 59.99, "USB", 1920, "Nu", "Nu");
        wb[1] = new Webcam("Genius", 72.99, "USB", 720, "Da", "Da");
        wb[2] = new Webcam("Logitech", 159.99, "Wireless", 1920, "Da", "Da");
        wb[3] = new Webcam("Microsoft", 160.99, "USB", 720, "Da", "Nu");
        wb[4] = new Webcam("Logitech", 88.88, "Wireless", 1920, "Nu", "Da");
        return wb[0].toString() + wb[1].toString() + wb[2].toString() + wb[3].toString() + wb[4].toString();
    }

    public String afisareVideoProiector() {
        VideoProiector[] vp = new VideoProiector[5];
        vp[0] = new VideoProiector("Optoma", 1574.99, "Home", "Samsung", "DLP", 1280);
        vp[1] = new VideoProiector("BenQ", 1299.00, "Home", "Samsung", "DLP", 800);
        vp[2] = new VideoProiector("Acer", 999.99, "Home", "Samsung", "DLP", 800);
        vp[3] = new VideoProiector("Epson", 3399.99, "Business", "Apple", "3LCD", 1920);
        vp[4] = new VideoProiector("BenQ", 2599.99, "Business", "Samsung", "DLP 3D", 1920);
        return vp[0].toString() + vp[1].toString() + vp[2].toString() + vp[3].toString() + vp[4].toString();
    }

    public String afisareEcran() {
        Ecran[] ec = new Ecran[5];
        ec[0] = new Ecran("LG", 629.99, "Home", 1600, 66, "16:9");
        ec[1] = new Ecran("Samsung", 899.99, "Gaming", 1920, 70, "16:9");
        ec[2] = new Ecran("BenQ", 1100.00, "Gaming", 1920, 66, "16:9");
        ec[3] = new Ecran("Philips", 700.99, "Home", 1600, 70, "4:3");
        ec[4] = new Ecran("BenQ", 2500.99, "Gaming", 3029, 144, "16:9");
        return ec[0].toString() + ec[1].toString() + ec[2].toString() + ec[3].toString() + ec[4].toString();
    }

    public String afisareBoxe() {
        Boxe[] bx = new Boxe[5];
        bx[0] = new Boxe("Serioux", 349.99, "Home", 5.1, 150, 50);
        bx[1] = new Boxe("Genius", 299.99, "Home", 2.1, 45, 29);
        bx[2] = new Boxe("Logitech", 400.99, "Gaming", 7.1, 200, 50);
        bx[3] = new Boxe("Pioneer", 547.49, "Business", 5.1, 150, 50);
        bx[4] = new Boxe("Bose", 850.99, "Home", 2.1, 100, 29);
        return bx[0].toString() + bx[1].toString() + bx[2].toString() + bx[3].toString() + bx[4].toString();
    }

    /* ===================== Sfarsit afisari ======================== */

 /* ================ SORTARI ==================== */
    //a = 1 -> afiare crescatoare
    //a = alta valoare -> afisare descrescatoare
    //b = 0 -> sortare dupa pret
    //b = 1 -> sortare alfabetica
    public String sortareLaptop(int a, int b) {
        Laptop[] la = new Laptop[5];

        la[0] = new Laptop("Samsung", 1000.99, 1.8, 800, 1200, 12.3);
        la[1] = new Laptop("HP", 4599.99, 1.9, 1920, 4500, 17.5);
        la[2] = new Laptop("Asus", 3500.99, 2.6, 1920, 2600, 15.6);
        la[3] = new Laptop("Apple", 5000.99, 1.8, 1300, 3000, 15.6);
        la[4] = new Laptop("Lenovo", 1200.99, 1.9, 1300, 1500, 12.3);

        for (int i = 0; i < la.length; i++) {
            for (int j = 0; j < la.length; j++) {
                if ((la[i].pret < la[j].pret && b == 0) || (la[j].marca.compareTo(la[i].marca) > 0 && b == 1)) {
                    Laptop aux = la[i];
                    la[i] = la[j];
                    la[j] = aux;
                }
               //sortarea foloseste un element auxiliar pentru a aranja vectorul intial dupa caz,crescator descrescator
               //in functie de pret la[i].pret sau de marca la[i].marca
               //stringurile nu se pot compara ca int-urile folosint > <  si de aia folosim compareTo  iar > 0 inseamna ca prima e mai mare ca a doua
             
            }
        }
        if (a == 1) {
            return la[0].toString() + la[1].toString() + la[2].toString() + la[3].toString() + la[4].toString();
        }
        return la[4].toString() + la[3].toString() + la[2].toString() + la[1].toString() + la[0].toString();
    }

    public String sortareDesktop(int a, int b) {
        Desktop[] dk = new Desktop[5];
        dk[0] = new Desktop("Myria", 1200.98, 2.0, "AMD", 400, 1000);
        dk[1] = new Desktop("IBM", 2500.99, 1.8, "AMD", 650, 512);
        dk[2] = new Desktop("Acer", 2100.99, 3.0, "INTEL", 550, 1000);
        dk[3] = new Desktop("Myria", 3200.99, 3.0, "NVIDIA", 600, 2000);
        dk[4] = new Desktop("Asus", 1500.99, 2.0, "NVIDIA", 500, 2000);
        for (int i = 0; i < dk.length; i++) {
            for (int j = 0; j < dk.length; j++) {
                if ((dk[i].pret < dk[j].pret && b == 0) || (dk[j].marca.compareTo(dk[i].marca) > 0 && b == 1)) {
                    Desktop aux = dk[i];
                    dk[i] = dk[j];
                    dk[j] = aux;
                }
            }
        }
        if (a == 1) {
            return dk[0].toString() + dk[1].toString() + dk[2].toString() + dk[3].toString() + dk[4].toString();
        }
        return dk[4].toString() + dk[3].toString() + dk[2].toString() + dk[1].toString() + dk[0].toString();
    }

    public String sortareTableta(int a, int b) {
        Tableta[] tb = new Tableta[5];
        tb[0] = new Tableta("Samsung", 850.99, 2.0, 10, 5, "Android");
        tb[1] = new Tableta("Lenovo", 450.99, 1.5, 7.1, 5, "Android");
        tb[2] = new Tableta("Eboda", 550.99, 1.8, 9, 3, "Windows");
        tb[3] = new Tableta("Allview", 350.99, 1.2, 7.1, 2, "Android");
        tb[4] = new Tableta("Apple", 1600.99, 1.5, 10, 3, "IOS");
        for (int i = 0; i < tb.length; i++) {
            for (int j = 0; j < tb.length; j++) {
                if ((tb[i].pret < tb[j].pret && b == 0) || (tb[j].marca.compareTo(tb[i].marca) > 0 && b == 1)) {
                    Tableta aux = tb[i];
                    tb[i] = tb[j];
                    tb[j] = aux;
                }
            }
        }
        if (a == 1) {
            return tb[0].toString() + tb[1].toString() + tb[2].toString() + tb[3].toString() + tb[4].toString();
        }
        return tb[4].toString() + tb[3].toString() + tb[2].toString() + tb[1].toString() + tb[0].toString();
    }

    public String sortareTastatura(int a, int b) {
        Tastatura[] ts = new Tastatura[5];
        ts[0] = new Tastatura("Trust", 120.99, "USB", "Business", "Nu", "Nu");
        ts[1] = new Tastatura("Natec", 119.99, "Wireless", "Gaming", "Da", "Nu");
        ts[2] = new Tastatura("Microsoft", 135.00, "USB", "Business", "Nu", "Nu");
        ts[3] = new Tastatura("Razer", 1000.00, "USB", "Gaming", "Da", "Da");
        ts[4] = new Tastatura("Logitech", 629.99, "Wireless", "Gaming", "Da", "Da");
        for (int i = 0; i < ts.length; i++) {
            for (int j = 0; j < ts.length; j++) {
                if ((ts[i].pret < ts[j].pret && b == 0) || (ts[j].marca.compareTo(ts[i].marca) > 0 && b == 1)) {
                    Tastatura aux = ts[i];
                    ts[i] = ts[j];
                    ts[j] = aux;
                }
            }
        }
        if (a == 1) {
            return ts[0].toString() + ts[1].toString() + ts[2].toString() + ts[3].toString() + ts[4].toString();
        }
        return ts[4].toString() + ts[3].toString() + ts[2].toString() + ts[1].toString() + ts[0].toString();
    }

    public String sortareTabletaGrafica(int a, int b) {
        TabletaGrafica[] tg = new TabletaGrafica[5];
        tg[0] = new TabletaGrafica("Genius", 209.99, "USB", 2560, 133, 1024);
        tg[1] = new TabletaGrafica("Wacom", 312.99, "USB", 2560, 168, 1024);
        tg[2] = new TabletaGrafica("Wacom", 450.99, "Wireless", 2680, 260, 2048);
        tg[3] = new TabletaGrafica("Genius", 600.99, "USB", 2680, 280, 2048);
        tg[4] = new TabletaGrafica("Wacom", 1111.99, "Wireless", 2560, 133, 3056);
        for (int i = 0; i < tg.length; i++) {
            for (int j = 0; j < tg.length; j++) {
                if ((tg[i].pret < tg[j].pret && b == 0) || (tg[j].marca.compareTo(tg[i].marca) > 0 && b == 1)) {
                    TabletaGrafica aux = tg[i];
                    tg[i] = tg[j];
                    tg[j] = aux;
                }
            }
        }
        if (a == 1) {
            return tg[0].toString() + tg[1].toString() + tg[2].toString() + tg[3].toString() + tg[4].toString();
        }
        return tg[4].toString() + tg[3].toString() + tg[2].toString() + tg[1].toString() + tg[0].toString();
    }

    public String sortareWebcam(int a, int b) {
        Webcam[] wb = new Webcam[5];
        wb[0] = new Webcam("Canyon", 59.99, "USB", 1920, "Nu", "Nu");
        wb[1] = new Webcam("Genius", 72.99, "USB", 720, "Da", "Da");
        wb[2] = new Webcam("Logitech", 159.99, "Wireless", 1920, "Da", "Da");
        wb[3] = new Webcam("Microsoft", 160.99, "USB", 720, "Da", "Nu");
        wb[4] = new Webcam("Logitech", 88.88, "Wireless", 1920, "Nu", "Da");
        for (int i = 0; i < wb.length; i++) {
            for (int j = 0; j < wb.length; j++) {
                if ((wb[i].pret < wb[j].pret && b == 0) || (wb[j].marca.compareTo(wb[i].marca) > 0 && b == 1)) {
                    Webcam aux = wb[i];
                    wb[i] = wb[j];
                    wb[j] = aux;
                }
            }
        }
        if (a == 1) {
            return wb[0].toString() + wb[1].toString() + wb[2].toString() + wb[3].toString() + wb[4].toString();
        }
        return wb[4].toString() + wb[3].toString() + wb[2].toString() + wb[1].toString() + wb[0].toString();
    }

    public String sortareVideoProiector(int a, int b) {
        VideoProiector[] vp = new VideoProiector[5];
        vp[0] = new VideoProiector("Optoma", 1574.99, "Home", "Samsung", "DLP", 1280);
        vp[1] = new VideoProiector("BenQ", 1299.00, "Home", "Samsung", "DLP", 800);
        vp[2] = new VideoProiector("Acer", 999.99, "Home", "Samsung", "DLP", 800);
        vp[3] = new VideoProiector("Epson", 3399.99, "Business", "Apple", "3LCD", 1920);
        vp[4] = new VideoProiector("BenQ", 2599.99, "Business", "Samsung", "DLP 3D", 1920);
        for (int i = 0; i < vp.length; i++) {
            for (int j = 0; j < vp.length; j++) {
                if ((vp[i].pret < vp[j].pret && b == 0) || (vp[j].marca.compareTo(vp[i].marca) > 0 && b == 1)) {
                    VideoProiector aux = vp[i];
                    vp[i] = vp[j];
                    vp[j] = aux;
                }
            }
        }
        if (a == 1) {
            return vp[0].toString() + vp[1].toString() + vp[2].toString() + vp[3].toString() + vp[4].toString();
        }
        return vp[4].toString() + vp[3].toString() + vp[2].toString() + vp[1].toString() + vp[0].toString();
    }

    public String sortareEcran(int a, int b) {
        Ecran[] ec = new Ecran[5];
        ec[0] = new Ecran("LG", 629.99, "Home", 1600, 66, "16:9");
        ec[1] = new Ecran("Samsung", 899.99, "Gaming", 1920, 70, "16:9");
        ec[2] = new Ecran("BenQ", 1100.00, "Gaming", 1920, 66, "16:9");
        ec[3] = new Ecran("Philips", 700.99, "Home", 1600, 70, "4:3");
        ec[4] = new Ecran("BenQ", 2500.99, "Gaming", 3029, 144, "16:9");
        for (int i = 0; i < ec.length; i++) {
            for (int j = 0; j < ec.length; j++) {
                if ((ec[i].pret < ec[j].pret && b == 0) || (ec[j].marca.compareTo(ec[i].marca) > 0 && b == 1)) {
                    Ecran aux = ec[i];
                    ec[i] = ec[j];
                    ec[j] = aux;
                }
            }
        }
        if (a == 1) {
            return ec[0].toString() + ec[1].toString() + ec[2].toString() + ec[3].toString() + ec[4].toString();
        }
        return ec[4].toString() + ec[3].toString() + ec[2].toString() + ec[1].toString() + ec[0].toString();
    }

    public String sortareBoxe(int a, int b) {
        Boxe[] bx = new Boxe[5];
        bx[0] = new Boxe("Serioux", 349.99, "Home", 5.1, 150, 50);
        bx[1] = new Boxe("Genius", 299.99, "Home", 2.1, 45, 29);
        bx[2] = new Boxe("Logitech", 400.99, "Gaming", 7.1, 200, 50);
        bx[3] = new Boxe("Pioneer", 547.49, "Business", 5.1, 150, 50);
        bx[4] = new Boxe("Bose", 850.99, "Home", 2.1, 100, 29);
        for (int i = 0; i < bx.length; i++) {
            for (int j = 0; j < bx.length; j++) {
                if ((bx[i].pret < bx[j].pret && b == 0) || (bx[j].marca.compareTo(bx[i].marca) > 0 && b == 1)) {
                    Boxe aux = bx[i];
                    bx[i] = bx[j];
                    bx[j] = aux;
                }
            }
        }
        if (a == 1) {
            return bx[0].toString() + bx[1].toString() + bx[2].toString() + bx[3].toString() + bx[4].toString();
        }
        return bx[4].toString() + bx[3].toString() + bx[2].toString() + bx[1].toString() + bx[0].toString();
    }
    public String cautareAvansata(String text){
        
    
    Boxe[] bx = new Boxe[5];
        bx[0] = new Boxe("Serioux", 349.99, "Home", 5.1, 150, 50);
        bx[1] = new Boxe("Genius", 299.99, "Home", 2.1, 45, 29);
        bx[2] = new Boxe("Logitech", 400.99, "Gaming", 7.1, 200, 50);
        bx[3] = new Boxe("Pioneer", 547.49, "Business", 5.1, 150, 50);
        bx[4] = new Boxe("Bose", 850.99, "Home", 2.1, 100, 29);
        for (int i = 0; i < 6; i++) {
            if(bx[i].marca.compareTo(text) == 0)
                return bx[i].toString();
        }
        return " ";
        
    }
   
    /* =========== Sfarsit Metode ======= */

}