package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private Integer cijena;
    private String kod;

    Artikl(String ime, Integer cijena, String kod) {
        this.setNaziv(ime);
        this.setCijena(cijena);
        this.setKod(kod);
    }


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Integer getCijena() {
        return cijena;
    }

    public void setCijena(Integer cijena) {
        this.cijena = cijena;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
