package Ohjelmointiprojekti.task5;

import java.util.ArrayList;
import  java.util.List;
class Palvelupiste {
    private List<Asiakas> jono = new ArrayList<>();

    public void lisaaJonoon(Asiakas asiakas) {
        jono.add(asiakas);
    }

    public Asiakas haeSeuraavaAsiakas() {
        if (!jono.isEmpty()) {
            Asiakas seuraavaAsiakas = jono.get(0);
            jono.remove(0);
            return seuraavaAsiakas;
        }
        return null;
    }

    public boolean onAsiakkaita() {
        return !jono.isEmpty();
    }
}

