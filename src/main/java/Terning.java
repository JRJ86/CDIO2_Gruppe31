public class Terning
{

    private int sider = 1;

    public void setSider()
    {
        sider = (int)(Math.random()*6)+1;
    }

    public int getSider()
    {
        return sider;
    }

    public int rul()
    {
        sider = (int)(Math.random()*6)+1;
        return sider;
    }

}
