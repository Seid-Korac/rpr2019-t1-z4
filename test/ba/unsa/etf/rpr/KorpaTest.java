package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    private Korpa korpa;
    private Artikl artikl;

    @BeforeEach
    void setUp() {
        korpa = new Korpa();
        artikl = new Artikl("KFC bucket", 600, "0001");
    }

    @Test
    void izbaciArtiklSaKodom() {
        korpa.dodajArtikl(artikl);
        Artikl a = korpa.izbaciArtiklSaKodom("0001");
        assertEquals(a.getKod(),"0001");
    }

    @Test
    void dodajArtikl() {
        boolean b = korpa.dodajArtikl(artikl);
        assertTrue(b);
    }

    @Test
    void testLimitKorpe() {
        for (int i = 0; i < 50; i++) {
            korpa.dodajArtikl(new Artikl("randomJunk", 600, Integer.toString(i)));
        }
        boolean b = korpa.dodajArtikl(artikl);
        assertFalse(b);
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        for (int i = 0; i < 10; i++) {
            korpa.dodajArtikl(new Artikl("randomJunk", 600, Integer.toString(i)));
        }
        assertEquals(6000, korpa.dajUkupnuCijenuArtikala());
    }
}