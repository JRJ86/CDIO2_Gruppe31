import org.junit.Test;
import Tekst.Tekst;

import Tekst.TekstController;


public class Test_vaelgSprog {

    /**@Author Andreas
     * Tesy type- Integrationstest: Tester UI og TekstController smat tilknyttede tekstfiler
     * Formål: at se om vi kan indhente en tekst fil.
     * Fremgangsmåde: vi har en tekstfil på dansk, engels og fransk.
     * - Vi læser de samme linjer i filerne og ser om vi får det samme tekststreng ud \n
     * men på forskellige sprog.
     * Forventet resultat: Det forventes at den samme tekststreng bliver skrevet ud men på forskellige sprog.
     * Faktisk resultat:
     */

@Test
public void Test_vaelgSprog() {
    TekstController.setSprog(0);
    System.out.println(Tekst.velkommen());
    TekstController.setSprog(1);
    System.out.println(Tekst.velkommen());
    TekstController.setSprog(2);
    System.out.println(Tekst.velkommen());

}
}
