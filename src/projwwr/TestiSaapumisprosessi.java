
package projwwr;
import java.util.ArrayList;
import java.util.List;


public class TestiSaapumisprosessi {
    public static void main(String[] args) {
        List<Arrival> tapahtumalista = new ArrayList<>();
        Kello kello = Kello.getInstance();
       Saapumisprosessi saapumisprosessi = new Saapumisprosessi(kello);
        
        int tapahtumienMaara = 10;
        saapumisprosessi.luoSaapumisia(tapahtumalista, tapahtumienMaara);
        
        for (Arrival tapahtuma : tapahtumalista) {
            System.out.println("Saapumisaika: " + tapahtuma.getAika());
        }
    }
}