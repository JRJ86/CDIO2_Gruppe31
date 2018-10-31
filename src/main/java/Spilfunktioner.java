public class Spilfunktioner {


    /**
     * @author Filip
     * fortæller om en spiller har vundet,
     * ved at tjekke om spilleren har 3000 eller mere
     * @param spiller hvilken spiller man vil tjekke
     * @return har spilleren vundet eller ej (true = har vundet, false = har ikke vundet)
     */
    public boolean harSpillerVundet(Spiller spiller){

        return (spiller.getPenge() >= 3000);
    }


}
