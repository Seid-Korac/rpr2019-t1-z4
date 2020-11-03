package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] sviArtilki = new Artikl[1000];
    private int counter = 0;

    Supermarket() {    }

    public void dodajArtikl (Artikl a){
        if (counter >= 1000) {
            System.out.println("Dostignut je kapacitet supermarketa");

            return;
        }
        sviArtilki[counter] = a;
        counter = counter + 1;
    }

    public Artikl[] getArtikli() {
        return  sviArtilki;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i = 0; i < counter; i++) {
            if(sviArtilki[i].getKod().equals(kod)) {
                Artikl res = sviArtilki[i];
                for (int j = i+1; j<counter; j++) {
                    sviArtilki[j-1] = sviArtilki[j];
                }
                sviArtilki[counter-1] = null;
                counter = counter - 1;
                return res;
            }
        }
        return null;
    }

    private void ispisiArtikle() {
        for (int i = 0; i < counter; i++) {
            System.out.println(sviArtilki[i].getNaziv() + " " + sviArtilki[i].getCijena() + " " + sviArtilki[i].getKod());
        }
    }
}

