package echipamenteit;

public class Test {

    public static void main(String[] args) {
        /*
        //Afisare utilizand metoda to String
        Tastatura t;
        t = new Tastatura("Samsung", 59.99, "USB", "Normala ", "Nu", "Da");
        System.out.println(" " + t.toString());

        //Afisare utilizant metoda de afisare
        TabletaGrafica g;
        g = new TabletaGrafica("Wacom", 306, "USB", 2540, 133, 1024);
        g.afisareTabletaGrafica();

        //Afisare constructor fara parametri
        Webcam w;
        w = new Webcam();
        w.afisareWebcam();

        //Afisare constructor cu parametri
        Laptop l;
        l = new Laptop("Lenovo", 4500.0, 3.6, 3200, 2500, 15.6);
        l.afisareLaptop();

        Tableta a;
        a = new Tableta("HUAWEI", 949.90, 1.2, 9.6, 3, "Android 4.4.4");
        a.afisareTableta();

        Desktop d;
        d = new Desktop("Acer Predator", 6190.99, 3.4, "NVIDIA GTX 980", 1200, 500);
        d.afisareDesktop();

        Ecran e;
        e = new Ecran("SAMSUNG", 1299.99, "SMART", 3120, 3, "16:9");
        e.afisareEcran();

        VideoProiector v;
        v = new VideoProiector("BenQ", 2199.99, "Bussines", "Samsung", "3D DLP", 1280);
        v.afisareVideoProiector();

        Boxe b;
        b = new Boxe("GENIUS", 509.99, "HOME", 5.1, 150, 50);
        b.afisareBoxe();*/

        //Afisare vectori
        //Vectori pentru Sisteme
        Laptop[] la = new Laptop[6];
        Desktop[] dk = new Desktop[6];
        Tableta[] tb = new Tableta[6];

        //Vectori pentru DispozitiveInput
        Tastatura[] ts = new Tastatura[6];
        TabletaGrafica[] tg = new TabletaGrafica[6];
        Webcam[] wb = new Webcam[6];

        //Vectori pentru DispozitiveOutput
        VideoProiector[] vp = new VideoProiector[6];
        Ecran[] ec = new Ecran[6];
        Boxe[] bx = new Boxe[6];

        la[0] = new Laptop("Samsung", 1000.99, 1.8, 800, 1200, 12.3);
        la[1] = new Laptop("Lenovo", 1200.99, 1.9, 1300, 1500, 12.3);
        la[2] = new Laptop("Asus", 3500.99, 2.6, 1920, 2600, 15.6);
        la[3] = new Laptop("Apple", 5000.99, 1.8, 1300, 3000, 15.6);
        la[4] = new Laptop("HP", 4599.99, 1.9, 1920, 4500, 17.5);

        dk[0] = new Desktop("Myria", 1200.98, 2.0, "AMD", 400, 1000);
        dk[1] = new Desktop("Asus", 1500.99, 2.0, "NVIDIA", 500, 2000);
        dk[2] = new Desktop("Acer", 2100.99, 3.0, "INTEL", 550, 1000);
        dk[3] = new Desktop("Myria", 3200.99, 3.0, "NVIDIA", 600, 2000);
        dk[4] = new Desktop("IBM", 2500.99, 1.8, "AMD", 650, 512);

        tb[0] = new Tableta("Allview", 350.99, 1.2, 7.1, 2, "Android");
        tb[1] = new Tableta("Lenovo", 450.99, 1.5, 7.1, 5, "Android");
        tb[2] = new Tableta("Eboda", 550.99, 1.8, 9, 3, "Windows");
        tb[3] = new Tableta("Samsung", 850.99, 2.0, 10, 5, "Android");
        tb[4] = new Tableta("Apple", 1600.99, 1.5, 10, 3, "IOS");

        ts[0] = new Tastatura("Trust", 120.99, "USB", "Business", "Nu", "Nu");
        ts[1] = new Tastatura("Natec", 119.99, "Wireless", "Gaming", "Da", "Nu");
        ts[2] = new Tastatura("Microsoft", 135.00, "USB", "Business", "Nu", "Nu");
        ts[3] = new Tastatura("Razer", 1000.00, "USB", "Gaming", "Da", "Da");
        ts[4] = new Tastatura("Logitech", 629.99, "Wireless", "Gaming", "Da", "Da");

        tg[0] = new TabletaGrafica("Genius", 209.99, "USB", 2560, 133, 1024);
        tg[1] = new TabletaGrafica("Wacom", 312.99, "USB", 2560, 168, 1024);
        tg[2] = new TabletaGrafica("Wacom", 450.99, "Wireless", 2680, 260, 2048);
        tg[3] = new TabletaGrafica("Genius", 600.99, "USB", 2680, 280, 2048);
        tg[4] = new TabletaGrafica("Wacom", 1111.99, "Wireless", 2560, 133, 3056);

        wb[0] = new Webcam("Canyon", 59.99, "USB", 1920, "Nu", "Nu");
        wb[1] = new Webcam("Genius", 72.99, "USB", 720, "Da", "Da");
        wb[2] = new Webcam("Logitech", 159.99, "Wireless", 1920, "Da", "Da");
        wb[3] = new Webcam("Microsoft", 160.99, "USB", 720, "Da", "Nu");
        wb[4] = new Webcam("Logitech", 88.88, "Wireless", 1920, "Nu", "Da");

        vp[0] = new VideoProiector("Optoma", 1574.99, "Home", "Samsung", "DLP", 1280);
        vp[1] = new VideoProiector("BenQ", 1299.00, "Home", "Samsung", "DLP", 800);
        vp[2] = new VideoProiector("Acer", 999.99, "Home", "Samsung", "DLP", 800);
        vp[3] = new VideoProiector("Epson", 3399.99, "Business", "Apple", "3LCD", 1920);
        vp[4] = new VideoProiector("BenQ", 2599.99, "Business", "Samsung", "DLP 3D", 1920);

        ec[0] = new Ecran("LG", 629.99, "Home", 1600, 66, "16:9");
        ec[1] = new Ecran("Samsung", 899.99, "Gaming", 1920, 70, "16:9");
        ec[2] = new Ecran("BenQ", 1100.00, "Gaming", 1920, 66, "16:9");
        ec[3] = new Ecran("Philips", 700.99, "Home", 1600, 70, "4:3");
        ec[4] = new Ecran("BenQ", 2500.99, "Gaming", 3029, 144, "16:9");

        bx[0] = new Boxe("Serioux", 349.99, "Home", 5.1, 150, 50);
        bx[1] = new Boxe("Genius", 299.99, "Home", 2.1, 45, 29);
        bx[2] = new Boxe("Logitech", 400.99, "Gaming", 7.1, 200, 50);
        bx[3] = new Boxe("Pioneer", 547.49, "Business", 5.1, 150, 50);
        bx[4] = new Boxe("Bose", 850.99, "Home", 2.1, 100, 29);

        for (int i = 1; i < 5; i++) {
            System.out.println(la[i]);
            System.out.println(dk[i]);
            System.out.println(tb[i]);

            System.out.println(ts[i]);
            System.out.println(tg[i]);
            System.out.println(wb[i]);

            System.out.println(vp[i]);
            System.out.println(ec[i]);
            System.out.println(bx[i]);

        }
    }
}
