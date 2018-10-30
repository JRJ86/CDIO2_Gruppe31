import java.util.Random;
public class Terning
{

    private int sider;
    private final int MAX = 6;

    public Terning()
    {
        sider = 1;
    }

    public void setSider()
    {
        sider = (int)(Math.random()*MAX)+1;
    }

    public int getSider()
    {
        return sider;
    }

    public int rul()
    {
        sider = (int)(Math.random()*MAX)+1;
        return sider;
    }

}
