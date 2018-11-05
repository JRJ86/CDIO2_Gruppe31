
import java.util.Random;
/**
 *@author Jacob
 *Raflebaeger klassen, som har en Raflebaeger konstruktør
 *og metoder der ruller med to terninger og returnerer samlr værdi.
 */
public class Raflebaeger {

    //Variabel der beskriver terningesummen af kast med raflebæger
    private int terningSum;


     //To Variabler der beskriver to terninger.
    private Terning terning1;
    private Terning terning2;

    /**@author Jacob
     * Raflebaeger konstruktør, som indeholder to Terning objekter.
     */
    public Raflebaeger()
    {
        terning1 = new Terning();
        terning2 = new Terning();
    }

    /**@author Jacob
     * Metode der ruller med raflebægeret (skal måske revideres)
     */
    public void kast()
    {
        terningSum = terning1.rul()+terning2.rul();
    }

    /**@author Jacob
     * Metode der returnerer den samlede terning værdi ved rul med raflebaeger
     */
    public int getTerningSum()
    {
        return terningSum;
    }


}
