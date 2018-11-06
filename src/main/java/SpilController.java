public class SpilController {

    UI ui = new UI();
    public static void main(String[] args) {
        SpilController spilController = new SpilController();

        spilController.koerSpil();
    }

    void koerSpil(){

        setup();

        ui.startSpil();

        do {
            spillerTur(Spilfunktioner.getSpiller(1));
        }
        while (!Spilfunktioner.harSpillerVundet(Spilfunktioner.getSpiller(1)));


        ui.printVinder(1);
        // Print vinder

        ui.farvelPrint();
        // Slut Spil

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
    }

}
