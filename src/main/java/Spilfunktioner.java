public class Spilfunktioner {

    int raflesum;
    Raflebaeger raflebaeger = new Raflebaeger();

    /**
     * @author Jacob og Andreas
     * Metode som kaster med raflebægeret og return vaerdien
     */
    public int rafleKast(){

        raflesum = raflebaeger.getTerningSum();
        return raflesum;

    }
}
