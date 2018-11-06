public class SpilController {


    public static void main(String[] args) {
        SpilController spilController = new SpilController();

        spilController.koerSpil();
    }

    static void koerSpil(){

        setup();

        UI ui = new UI();
        ui.startSpil();

        // Kør tur

        // For vinder

        // Print vinder

        // Slut Spil

    }


    static void spillerTur(Spiller spiller){

        // Sla raflebæger (slaa og print)
        // land på felt
        // Juster spiller penge

    }


    static void setup(){
        UI ui = new UI();
        ui.vaelgSprog();
        ui.printIntro();

        Spilfunktioner.lavfelter();

        Spilfunktioner.lavSpillere(2);
    }

}
