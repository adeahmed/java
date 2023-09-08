package Ohjelmointiprojekti.task5;


  public   class Tapahtuma {
        private int aika;
        private TapahtumanTyyppi tyyppi;

        public Tapahtuma(int aika, TapahtumanTyyppi tyyppi) {
            this.aika = aika;
            this.tyyppi = tyyppi;
        }

        public int getAika() {
            return aika;
        }

        public TapahtumanTyyppi getTyyppi() {
            return tyyppi;
        }
    }

