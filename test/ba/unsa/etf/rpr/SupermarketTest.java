package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    private Supermarket supermarket;
    private Artikl artikl;

    @BeforeEach
    void setUp() {
        supermarket = new Supermarket();
        artikl = new Artikl("Junk", 100, "0001");
    }

    @Test
    void dodajArtikl() {
        supermarket.dodajArtikl(artikl);
    }

    @Test
    void izbaciArtiklSaKodom() {
        supermarket.dodajArtikl(artikl);

        Artikl a = supermarket.izbaciArtiklSaKodom("0001");
        assertEquals(a.getKod(),"0001");
    }


    @Test
    void izbaciNepostojeciArtiklSaKodom() {
        supermarket.dodajArtikl(artikl);

        Artikl a = supermarket.izbaciArtiklSaKodom("0002");
        assertNull(a);
    }


}