public class Spiller {


    private int id;
    private int penge=1000;
    static int count =0;

    /**@author Andreas
     * Constroctor kan i dette tilfælde udelades, da der ikke anvendes parametre. Har dog valgt at tage den med idet det, det fremmer forståelsen syntes jeg
     */
    public Spiller () {

    }

    /**
     *
     * @param a
     */
    public void setId(int a) {id=a;}

    /**
     *
     * @return
     */
    public int getPenge() {return penge;}

    /**
     *
     * @param nyPenge
     */
    public void setPenge(int nyPenge) {this.penge=nyPenge;}

    /**
     *
     * @return
     */
    public int getId(){
        return id;
    }
}
