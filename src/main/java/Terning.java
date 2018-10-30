
import java.util.Random;
/**
 * @author Jacob
 * Terning klassen, som har en Terning konstruktør
 * og metoder der ruller en terning og returner værdien.
 */
public class Terning
{
    //Variable der beskriver hvilken side der er op (sider) og max side side antal (MAX)
    private int sider;
    private final int MAX = 6;

    //Konstruktør til at lave Terning objekter. Den sætter default værdi til 1, så man ikke kan slå 0
    public Terning()
    {
        sider = 1;
    }

    //Ruller en terning og setter værdien til en integer fra 1-6 vha. Math.random (skal måske bruges)
    public void setSider()
    {
        sider = (int)(Math.random()*MAX)+1;
    }

    //Returnerer værdien af den rullede terning (skal måske bruges)
    public int getSider()
    {
        return sider;
    }

    //Ruller med terning og returnerer værdi (den der bliver brugt)
    public int rul()
    {
        sider = (int)(Math.random()*MAX)+1;
        return sider;
    }


}
