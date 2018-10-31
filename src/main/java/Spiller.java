import java.util.Scanner;

public class Spiller {

    private int id;
    private String navn;
    private int penge=1000;
    private int antalSpillere =2;
    private Spiller[] spillerListe = new Spiller[antalSpillere];

    public void lavSpillere(Spiller[] spillerListe) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<getSpillerListe().length;i++) {
            spillerListe[i] = new Spiller();
            spillerListe[i].setId(i);
            spillerListe[i].setNavn(sc.nextLine());
        }
    }

    public Spiller[] getSpillerListe() {return spillerListe;}

    public void setId(int a) {id=a;}

    public int getPenge() {return penge;}

    public void setPenge(int penge) {this.penge=penge;}

    public void setNavn(String navn) {
        this.navn = navn;
    }


}
