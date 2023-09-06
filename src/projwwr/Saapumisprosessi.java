
package projwwr;

import java.util.List;
import eduni.distributions.Uniform;

public class Saapumisprosessi {
    private Kello kello;
    private Uniform uniformJakauma;

    public Saapumisprosessi(Kello kello) {
        this.kello = kello;
        this.uniformJakauma = new Uniform(5, 10);
    }

    public void luoSaapumisia(List<Arrival> tapahtumalista, int maara) {
        for (int i = 0; i < maara; i++) {
            long saapumisaika = kello.haeAika();
            tapahtumalista.add(new Arrival(saapumisaika));
            // Päivitä kellonaikaa saapumisen jälkeen
            long saapumisvaliaika = (long) uniformJakauma.sample();

            kello.asetaAika(saapumisaika + saapumisvaliaika);
        }
    }
}
