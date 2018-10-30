package Tekst;

import java.io.*;
import java.util.Scanner;

/** @author Malte
 * Indeholder metoder til at håndtere sprog,
 * samt alt tekst oversat til de forskellige sprog.
 */
public class TekstController {

    /* Stien til folderen \tekst inde i programmet. Den sørger
        desuden for at hente den i programmets mappe uanset,
        hvorhenne programmet ligger på computeren. */
    private static String FOLDERSTI = "tekst"+File.separator;

    /*  Indstillingen der styrer hvilket sprog teksterne printes på
        Den henviser til en specifik sprogfil. */
    private static File nuvaerendeSprogFil = null;

    /**
     * @author Malte
     * Henter alle navnene på mulige sprog, med udgangspunkt
     * i hvilke sprog-filer der ligger \tekst\ mappen.
     * Den henter alle de første linjer (navnet på sproget)
     * i alle sprogfiler.
     *
     * @return En liste over navnene på alle sprog. Listen er
     * ordnet efter sprogets nr (dvs. det samme nummer man skal
     * bruge hvis man ønsker at sætte nuværendesprog til det pågælende sprog).
     */
    private static String[] getSprog(){
        File[] sprogFiler = getSprogFiler();
        if(sprogFiler != null) {
            String[] sprog = new String[sprogFiler.length];
            for (int i = 0; i < sprogFiler.length; i++) {
                sprog[i] = findPrintbarTekst(getLinjeFraFil(sprogFiler[i], 0));
            }
            return sprog;
        }else{
            return null;
        }
    }

    /**
     * @author Malte
     * Henter alle sprog-filerne i mappen \tekst\ - giver fejl, hvis der ingen filer er.
     * @return Sprog filerne som en File array
     */
    private static File[] getSprogFiler(){
        File f = new File(FOLDERSTI);
        File[] allFiles = f.listFiles();
        if( allFiles.length == 0){
            System.out.println("FEJL: Ingen sprogfiler i '"+FOLDERSTI+"'");
            return null;
        }else {
            return allFiles; }
    }

    /**
     * @author Malte
     *  Indstiller sproget, alle tekststykker printes på vha. af et id.
     *  Den sætter blot filen som programmet skal hente tekststykker fra
     *  til filen, med det pågældende index.
     * @param index sprogets listeindex, hvis man henter sprog via getSprog()
     */
    private static void setSprog(int index){
        File[] sprogFiler = getSprogFiler();
        if(sprogFiler != null ){
            if(index>0 && index<sprogFiler.length){
                nuvaerendeSprogFil = sprogFiler[index];
            }else{
                System.out.println("FEJL: Forsøgte at sætte ikke-eksisterende sprog!"); } }
    }


    /**
     * @author Malte
     * Henter den nuvaerendeSprogFil. Hvis ikke den er sat (nuvaerendeSprogFil==null)
     * så sætter den filen til at være den standard sprogfil (dansk.txt)
     * @return nuvaerendeSprogFil variabel
     */
    private static File getNuvaerendeSprogFil(){
        if(nuvaerendeSprogFil == null){
            nuvaerendeSprogFil = new File(FOLDERSTI+"dansk.txt");
        }
        return nuvaerendeSprogFil;
    }


    /**
     * @author Malte
     *  Finder den printbare tekst på en vilkårlig linje - dvs.
     *  teksten mellem stjernerne, og altså den tekst der vises i UI.
     * @param linje linje tekst hvori man ønsker at finde den printbare tekst
     * @return Teksten der skal printes i spillet
     */
    static String findPrintbarTekst(String linje){
        String printBarTekst = "";

        int startIndex = 0;
        int slutIndex = 0;

        // Tjekker at linjen overhovedet indeholder printbar tekst.
        if(linje.contains("*")){

            // Gennemgår hver char (bogstav) i String'en 'linje'
            for(int i=0; i<linje.length()-2; i++ ){
                /*  Tjekker kun til og med det 3. sidste char,
                    da der er brug for mindst 2 chars efter stjernen
                    (en tekst/char + en stjerne mere mere)
                 */

                // Checker om char er første citationstegn
                if(linje.charAt(i)=='*'){
                    startIndex = i+1;
                    break; }}

            if( startIndex != 0){

                // Leder efter næste citationstegn, ved at gennemgår resten af bogstaverne i 'linje'
                for(int i=startIndex+1; i<linje.length(); i++ ){
                    if(linje.charAt(i)=='*'){
                        slutIndex = i;
                        break; }} }
        }
        if(startIndex != 0 && slutIndex != 0){ printBarTekst = linje.substring(startIndex,slutIndex); }
        return printBarTekst;
    }


    /**
     * @author Malte
     * Henter en bestemt linje fra en fil, med udgangspunkt i linjens nummer.
     * Denne metode kan bruges i andre sammenhængen, og har ikke specifikt
     * noget at gøre med denne klasse.
     * @param tekstFil tekstfilen man ønsker at finde linjen i
     * @param linjeNummer nummeret på den linje man ønsker at finde
     * @return teksten på den linjer man ønsker som en String. Den returnerer 'null' hvis
     * linjen ikke eksisterer, eller hvis der ikke står noget på linjen.
     */
    private static String getLinjeFraFil(File tekstFil, int linjeNummer){
        String tekst = "";
        /* En try-catch statement, der sikrer at programmet ikke crasher
            hvis der opstår fejl under indlæsningen af filen. */
        try {
            BufferedReader reader = new BufferedReader(new FileReader(tekstFil));
            /* Et for loop der læser hver linje, og stopper, når man
                kommer til den linje man ønsker at få returneret */
            for(int i=0; i<=linjeNummer; i++){
                tekst = reader.readLine();
            }
            return tekst;
        }catch(FileNotFoundException e){
            System.out.println("No File");
        }catch(IOException e){
            System.out.println("IOException");
        }
        return null;
    }


    /**
     * @author Malte
     * Henter printbar tekst fra et tekststykke, med udgangspunkt i linjenummeret.
     * Den holder styr på, hvilket sprog der hentes fra.
     * @param linjeNummer hvilket linjenummer den skal hente teksten fra
     * @return Printbar tekst fra en linje på det nuvaerende sprog
     */
    static String getTekst(int linjeNummer){
        String tekst = getLinjeFraFil(getNuvaerendeSprogFil(), linjeNummer);
        return findPrintbarTekst(tekst);
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String[] sprog = getSprog();

        File fil = getNuvaerendeSprogFil();
        System.out.println(getLinjeFraFil(fil, 10));

        if (sprog != null) {
            for (int i = 0; i < sprog.length; i++) {
                System.out.println("" + i + ") " + sprog[i]);
            }


            do {
                int input = scanner.nextInt();

                if (input >= 0 && input < sprog.length) {
                    setSprog(input);
                    break;
                } else if (input == 999) {
                    break;
                } else {
                    System.out.println("Forkert input");
                }

            } while (true);

            System.out.println(Tekst.guldMineTitel());
            System.out.println(Tekst.guldMineBeskrivelse());

            scanner.close();
        }
    }
}
