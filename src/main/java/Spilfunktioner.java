public class Spilfunktioner {
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

    public void justerSpillerPenge(int spillerId, int pengeJustering) {

            int nyPenge=getSpiller(spillerId).getPenge()+pengeJustering;
            getSpiller(spillerId).setPenge(nyPenge);
    }

}
