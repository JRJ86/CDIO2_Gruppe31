import java.util.Scanner;

public class Spiller {

    private int id;
    private int penge=1000;
    static int count =0;

    /**@author Andreas
     * Constroctor kan i dette tilfælde udelades, da der ikke anvendes parametre. Har dog valgt at tage den med idet det, det fremmer forståelsen syntes jeg
     */
    public Spiller () {


    }


    public void setId(int a) {id=a;}

    public int getPenge() {return penge;}

    public void setPenge(int penge) {this.penge=penge;}

    public int getId(){
        return id;
    }

}
