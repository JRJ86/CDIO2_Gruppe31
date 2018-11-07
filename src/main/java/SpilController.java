public class SpilController {
    Spiller spillerTur;
    UI ui = new UI();

    public static void main(String[] args) {
        SpilController spilController = new SpilController();

        spilController.koerSpil();
    }

    void koerSpil(){



        setup();
        spillerTur = Spilfunktioner.getSpillerListe()[0];
        ui.startSpil();

        do {
            spillerTur(spillerTur);
            skiftTur();
        }
        while (!Spilfunktioner.harSpillerVundet(spillerTur));


        ui.printVinder(spillerTur.getId());
        // Print vinder

        ui.farvelPrint();
        // Slut Spil

    }

    /**
     * @author Andreas og Filip
     * Metode der skifter tur mellem spillerne
     */

    void skiftTur(){


        for (int i = 0; i < Spilfunktioner.getSpillerListe().length; i++){

           Spiller nySpiller = Spilfunktioner.getSpillerListe()[i];

            if (spillerTur != nySpiller){
                 spillerTur = nySpiller;
                 break;
            }
        }

    }

    void spillerTur(Spiller spiller){

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


    void setup(){
        ui.vaelgSprog();
        ui.printIntro();


        Spilfunktioner.lavfelter();

        Spilfunktioner.lavSpillere(2);

        // Lav felter

        // Lav spillere

    }



}
