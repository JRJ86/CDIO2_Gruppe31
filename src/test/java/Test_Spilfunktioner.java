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

    /**@author Andreas
     * Tester om metoden justerSpillerPenge virker.
     * Fremgangsmåde: Oprettet to objekter: begges pengebeholdning er som udgangspunkt = 1000. For spiller 1 bliver der trukket 500 fra beløbet og -
     * for spiller 2 bliver der trukket 1002 fra det eksisterende beløb. Det kan forventes at beløbet for spiller 1 efter metoden er kladt er på 1500 og beløbet -
     * for spiller 2 er 0 (ikke -2 idet der er lavet et if statement der lukker af for dette).
     * Testen er godkendt.
     */

    @Test
    public void Test_justerSpillerPenge() {
        Spiller[] spillerListe = new Spiller[2];
        spillerListe[0] = new Spiller();
        spillerListe[0].setId(1);

        spillerListe[1] = new Spiller();
        spillerListe[1].setId(2);
        int pengeJustering = -1002;
        int pengeJusteringSP2 = 500;
        Spiller a = new Spiller();
        int spillerId = a.getId();


        System.out.println("Spiller 1 har: " + spillerListe[0].getPenge());
        System.out.println("Spiller 2 har " + spillerListe[1].getPenge());

        int nyPenge = spillerListe[0].getPenge() + pengeJustering;
        spillerListe[0].setPenge(nyPenge);

        System.out.println("Efter pengejustering har spiller 1: " + spillerListe[0].getPenge());

        int nyPenge2 = spillerListe[1].getPenge() + pengeJusteringSP2;
        spillerListe[1].setPenge(nyPenge2);

        System.out.println("Efter pengejustering har spiller 2: " + spillerListe[1].getPenge());
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
