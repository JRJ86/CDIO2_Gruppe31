/**
 * Klassen der styrer hele spillet, og bestemmer hvilke ting der sker hvornår.
 * Den laver ikke selv nogen beregninger (på nær at skifte tur mellem spillere), men
 * er den, der forbinder metoder fra UI og Spilfunktioner.
 */
public class SpilController {

    private Spiller spillerTur;
    private UI ui = new UI();

    /** Sætter spillet i gang */
    public static void main(String[] args) {
        SpilController spilController = new SpilController();
        spilController.koerSpil();
    }


    /**
     * Mian loopet i spillet, der styrer hvor langt spillet er, og hvis tur det er.
     * Det er her spillet bliver startet fra, og sluttet igen.
     */
    private void koerSpil(){
        setup();
        spillerTur = Spilfunktioner.getRandomSpiller();
        ui.startSpil();

        do {
            spillerTur(spillerTur);
            skiftTur();
        }
        while (!Spilfunktioner.harSpillerVundet(spillerTur));

        ui.printVinder(spillerTur.getId());

        ui.farvelPrint();
    }


    /**
     * @author Andreas og Filip
     * Metode der skifter tur mellem spillerne
     */
    private void skiftTur(){

        for (int i = 0; i < Spilfunktioner.getSpillerListe().length; i++){

           Spiller nySpiller = Spilfunktioner.getSpillerListe()[i];

            if (spillerTur != nySpiller){
                 spillerTur = nySpiller;
                 break;
            }
        }
    }


    /**
     * @author Chua
     * Kører en tur for en vilkårlig spiller, herunder slår med terninger, lander på felt og justerer scorer.
     * @param spiller Hvilken spiller turen skal køre for
     */
    private void spillerTur(Spiller spiller){

        ui.printTur(spiller.getId());

        ui.printSpillerPenge(Spilfunktioner.getSpillerPenge(spiller));

        ui.slåRaflebaeger();

        int feltnummer = Spilfunktioner.rafleKast();

        ui.printTerning(feltnummer);

        int point = Spilfunktioner.getVaerdi(feltnummer-2); //feltnummer listen går fra 0 til 10, men terningeslagene går fra 2 til 12, derfor -2

        ui.printFelt(feltnummer);

        Spilfunktioner.justerSpillerPenge(spiller , point);

        ui.printSpillerPenge(Spilfunktioner.getSpillerPenge(spiller));
    }


    /**
     * @author Chua
     * Laver start setup for spillet, hvor der bliver indstillet kørt vaelgsprog funktion i UI,
     * samt der bliver lavet spillere og felter.
     */
    private void setup(){

        ui.vaelgSprog();

        ui.printIntro();

        Spilfunktioner.lavfelter();

        Spilfunktioner.lavSpillere(2);

    }

}
