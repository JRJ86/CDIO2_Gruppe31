/**
 * @Author Jacob
 *Raflebaeger klassen, som har en Raflebaeger konstruktør
 *og metoder der ruller med to terninger og returnerer samlr værdi.
 */

import java.util.Random;
public class Raflebaeger {

    //Variabel der beskriver terningesummen af kast med raflebæger
    private int terningSum;

    // To Variabler der beskriver to terninger,
    private Terning terning1;
    private Terning terning2;

    //Raflebaeger konstruktør, som indeholder to Terning objekter.
    public Raflebaeger()
    {
        terning1 = new Terning();
        terning2 = new Terning();
    }

    //Metode der ruller med raflebægeret (skal måske revideres)
    public void rulRaflebaeger()
    {
        terningSum = terning1.rul()+terning2.rul();

    }

    //Metode der returnerer den samlede terning værdi ved rul med raflebaeger
    public int getRaflebaeger()
    {
        return terningSum;
    }

    //Samme metode som rulRaflebaeger (skal måske revideres)
    public void setRaflebaeger()
    {
        terningSum = terning1.rul()+terning2.rul();
    }





}
