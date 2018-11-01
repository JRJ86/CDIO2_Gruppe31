import org.junit.*;


public class Test_Spilfunktioner {


    @Test
    public void Test_lavSpillere(){
        int antalSpillere=3;

        Spilfunktioner.lavSpillere(antalSpillere);

        for(int i=0;i<Spilfunktioner.getSpillerListe().length;i++) {
            System.out.println(Spilfunktioner.getSpillerListe()[i].getId());

        }
    }
}
