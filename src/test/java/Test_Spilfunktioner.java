import org.junit.*;

import static org.junit.Assert.assertTrue;


public class Test_Spilfunktioner {


    @Test
    public void Test_lavSpillere() {
        int antalSpillere = 3;

        Spilfunktioner.lavSpillere(antalSpillere);

        for (int i = 0; i < Spilfunktioner.getSpillerListe().length; i++) {
            System.out.println(Spilfunktioner.getSpillerListe()[i].getId());

        }
    }

    /**
     * @Author andreas
     * Der testes om et slag med raflebægeret slår værdier imellem 2 og 12, som er de maksimale og de laveste værdier der kan slås.
     * Herefter testes det igen om værdierne slår inde for værdierne , men her kaldes metoden rafleKast()
     * fra klassen Spilfunktioner.
     * Resultat af test: god
     */

    @Test
    public void Test_rafleKast() {
        final int NUMBEROFROOLS = 1000;

        //Setup
        Raflebaeger raflebaeger = new Raflebaeger();
        int dieTotalValue;

        int oevreGrænse = 12;
        int nedreGrænse = 2;

        //Test
        for (int i = 0; i < NUMBEROFROOLS; i++) {
            Spilfunktioner.rafleKast();

            raflebaeger.kast();
            dieTotalValue = Raflebaeger.getTerningSum();
            assertTrue(dieTotalValue >= nedreGrænse && dieTotalValue <= oevreGrænse);
            assertTrue(Spilfunktioner.rafleKast() >= nedreGrænse && Spilfunktioner.rafleKast() <= oevreGrænse);

        }

    }
}
