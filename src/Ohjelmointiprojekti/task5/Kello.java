package Ohjelmointiprojekti.task5;

public class Kello {
    private static Kello instance;
    private long aika;

    private Kello() {
        this.aika = 0;
    }

    public static Kello getInstance() {
        if (instance == null) {
            instance = new Kello();
        }
        return instance;
    }

    public void asetaAika(long uusiAika) {
        this.aika = uusiAika;
    }

    public long haeAika() {
        return aika;
    }

}
