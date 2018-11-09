import org.junit.Test;
import Tekst.Tekst;

import Tekst.TekstController;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Test_TekstController {

    /** Test af TekstControllers metode setSprog() og Tekst's velkommen metode
     * @author Andreas & Malte
     * Testtype- Integrationstest:
     * Formål: At se om den String som Tekst.velkommen() returnerer bliver justeret efter sproget.
     * - Vi læser de samme linjer i filerne og ser om vi får det samme tekststreng ud \n
     * men på forskellige sprog.
     */
    @Test
    public void Test_setSprog() {

        // Dansk
        TekstController.setSprog(0);
        assertEquals( "Velkommen til", Tekst.velkommen());

        // Engelsk
        TekstController.setSprog(1);
        assertEquals("Welcome to",Tekst.velkommen() );

        //Fransk
        TekstController.setSprog(2);
        assertEquals("Bienvenue à", Tekst.velkommen() );

    }

}
