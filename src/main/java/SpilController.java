public class SpilController {

    UI ui = new UI();
    public static void main(String[] args) {
        SpilController spilController = new SpilController();

        spilController.koerSpil();
    }

    void koerSpil(){

        setup();

        ui.startSpil();

        spillerTur(Spilfunktioner.getSpiller(1));

        Spilfunktioner.harSpillerVundet(Spilfunktioner.getSpiller(1));

        // Print vinder

        // Slut Spil

    }


    void spillerTur(Spiller spiller){

        ui.slåRaflebaeger();

        int feltnummer = Spilfunktioner.rafleKast();

        int point = Spilfunktioner.getVaerdi(feltnummer-2); //feltnummer listen går fra 0 til 10, men terningeslagene går fra 2 til 12, derfor -2

        Spilfunktioner.justerSpillerPenge(spiller , point);

    }


    void setup(){
        ui.vaelgSprog();
        ui.printIntro();

        Spilfunktioner.lavfelter();

        Spilfunktioner.lavSpillere(2);
    }

}
