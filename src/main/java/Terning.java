
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

    /**@author Jacob
     * Konstruktør til at lave Terning objekter. Den sætter default værdi til 1, så man ikke kan slå 0
     */
    public Terning()
    {
        sider = 1;
    }

    /**@author Jacob
     * Ruller en terning og setter værdien til en integer fra 1-6 vha. Math.random (skal måske bruges)
     */
    public void setSider()
    {
        sider = (int)(Math.random()*MAX)+1;
    }

    /**
     * @author Jacob
     * Returnerer værdien af den rullede terning (skal måske bruges)
     * @return sider
     */
    public int getSider()
    {
        return sider;
    }

    /**
     * @author Jacob
     * Ruller med terning og returnerer værdi (den der bliver brugt)
     * @return sider
     */
    public int rul()
    {
        sider = (int)(Math.random()*MAX)+1;
        return sider;
    }


}
