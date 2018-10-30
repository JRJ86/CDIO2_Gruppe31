public class Raflebaeger {

    private int terningSum;

    private Terning terning1;
    private Terning terning2;

    public Raflebaeger()
    {
        Terning terning1 = new Terning();
        Terning terning2 = new Terning();
    }

    public int rulRaflebæger()
    {
        terningSum = terning1.rul()+terning2.rul();
        return terningSum;
    }

    public int getRaflebæger()
    {
        return terningSum;
    }

    public void setRaflebæger()
    {
        terningSum = terning1.rul()+terning2.rul();
    }

    public static void main(String[] args){

        Raflebaeger raflebaeger = new Raflebaeger();

        int kast = raflebaeger.getRaflebæger();
        System.out.println(kast);
    }


}
