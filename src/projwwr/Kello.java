package projwwr;

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

    // public static void main(String[] args) {
    // Kello kello = Kello.getInstance();
    // kello.asetaAika(007);
    // System.out.println("Kellonaika: " + kello.haeAika());
    // }
}
