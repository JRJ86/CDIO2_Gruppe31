import java.sql.SQLOutput;
import java.util.Random;

public class Spilfunktioner {

    private static Felt[] felter;


    //OBS!! Alle metoder herinde skal være static

    /**
     * @author Jacob og Andreas
     * Metode som kaster med raflebægeret og return vaerdien
     */
    public static int rafleKast(){

        Raflebaeger raflebaeger = new Raflebaeger();

        raflebaeger.kast();


        return raflebaeger.getTerningSum();

    }

    private static Spiller[] spillerListe;

    /**
     * @author Filip
     * fortæller om en spiller har vundet,
     * ved at tjekke om spilleren har 3000 eller mere
     * @param spiller hvilken spiller man vil tjekke
     * @return har spilleren vundet eller ej (true = har vundet, false = har ikke vundet)
     */
    public static boolean harSpillerVundet(Spiller spiller){

        return (spiller.getPenge() >= 3000);
    }

    /**
     * @author andreas
     * Laver en liste for spillerobjekter.
     * @param antalSpillere det antal af spillere der deltager i spillet. TODO: hvor skal denne variabel defineres?
     */
    public static void lavSpillere(int antalSpillere) {
        spillerListe = new Spiller[antalSpillere];
        for(int i=0;i<antalSpillere;i++) {
            spillerListe[i] = new Spiller();
            spillerListe[i].setId(i);
        }
    }

    public static Spiller[] getSpillerListe(){
        return spillerListe;
    }

    public static Spiller getSpiller(int spillerNr){

       return getSpillerListe()[spillerNr];
    }


    /**
     * @author Filip
     * @param spiller hvilken spiller bliver tjekket
     * @return returnerer spillerens pengebeholdning
     */
    public static int getSpillerPenge(Spiller spiller){

        return spiller.getPenge();
    }


    public static void justerSpillerPenge(int spillerId, int pengeJustering) {


            int nyPenge=getSpiller(spillerId).getPenge()+pengeJustering;
            if(nyPenge<0) {nyPenge=0;}
            getSpiller(spillerId).setPenge(nyPenge);
    }

    /**
     * @author Chua
     * laver en liste for felter
     */
        public static void lavfelter()
        {
            Felt Felt2 = new Felt();
            Felt2.setVaerdi(+250);

            Felt Felt3 = new Felt();
            Felt3.setVaerdi(-100);

            Felt Felt4 = new Felt();
            Felt4.setVaerdi(+100);

            Felt Felt5 = new Felt();
            Felt5.setVaerdi(-20);

            Felt Felt6 = new Felt();
            Felt6.setVaerdi(+180);

            Felt Felt7 = new Felt();
            Felt7.setVaerdi(0);

            Felt Felt8 = new Felt();
            Felt8.setVaerdi(-70);

            Felt Felt9 = new Felt();
            Felt9.setVaerdi(+60);

            Felt Felt10 = new Felt();
            Felt10.setVaerdi(-80);

            Felt Felt11 = new Felt();
            Felt11.setVaerdi(-50);

            Felt Felt12 = new Felt();
            Felt12.setVaerdi(+650);
            //Har lavet objekter med integer værdier for de givne objekter "Felt" fra 2 til 12

            felter = new Felt[11];
            felter[0] = Felt2;
            felter[1] = Felt3;
            felter[2] = Felt4;
            felter[3] = Felt5;
            felter[4] = Felt6;
            felter[5] = Felt7;
            felter[6] = Felt8;
            felter[7] = Felt9;
            felter[8] = Felt10;
            felter[9] = Felt11;
            felter[10] = Felt12;
            //Lavet en liste af objekter fra med index 0 til 11, som indeholder objekterne "Felt" fra 2 til 12

        }
        public static int getVaerdi(int feltnummer){
            return felter[feltnummer].getVaerdi();
        }

    public static Spiller getRandomSpiller() {
        Random rand = new Random(2);

        int spillerNr = rand.nextInt();
        return getSpillerListe()[spillerNr];
    }



}
