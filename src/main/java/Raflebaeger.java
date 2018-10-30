import java.util.Random;
public class Raflebaeger {

    private int terningSum;

    private Terning terning1;
    private Terning terning2;

    public Raflebaeger()
    {
        terning1 = new Terning();
        terning2 = new Terning();
    }

    public void rulRaflebaeger()
    {
        terningSum = terning1.rul()+terning2.rul();

    }

    public int getRaflebaeger()
    {
        return terningSum;
    }

    public void setRaflebaeger()
    {
        terningSum = terning1.getSider()+terning2.getSider();
    }

    public static void main(String[] args){

        Raflebaeger raflebaeger = new Raflebaeger();

        raflebaeger.rulRaflebaeger();
        System.out.println(raflebaeger.getRaflebaeger());
    }


}
