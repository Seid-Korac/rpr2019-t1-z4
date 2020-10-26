package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private int counter = 0;

    Korpa() {}

    public Artikl[] getArtikli() {
        return  artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        ispisiArtikle();
        for (int i = 0; i < counter; i++) {
            if(artikli[i].getKod().equals(kod)) {
                Artikl res = artikli[i];
                for (int j = i+1; j<counter; j++) {
                    artikli[j-1] = artikli[j];
                }
                artikli[counter-1] = null;
                counter = counter - 1;
                return res;
            }
        }
        return null;
    }

    public boolean dodajArtikl(Artikl a) {
        ispisiArtikle();
        if (counter >= 50) return false;
        artikli[counter] = a;
        counter = counter + 1;
        return true;
    }

    public int dajUkupnuCijenuArtikala() {
        int sum = 0;
        for (int i = 0; i < counter; i++) {
            sum = sum + artikli[i].getCijena();
        }
        return sum;
    }

    private void ispisiArtikle() {
        for (int i = 0; i < counter; i++) {
            System.out.println(artikli[i].getNaziv() + " " + artikli[i].getCijena() + " " + artikli[i].getKod());
        }
    }
}
