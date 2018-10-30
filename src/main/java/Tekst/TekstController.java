package Tekst;

import java.io.*;
import java.util.Scanner;

public class TekstController {
    private static String FOLDERSTI = "tekst"+File.separator;
    private static File nuvaerendeTekstFil = null;


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

    private static File[] getSprogFiler(){
        File f = new File(FOLDERSTI);
        File[] allFiles = f.listFiles();
        if( allFiles.length == 0){
            System.out.println("FEJL: Ingen sprogfiler i '"+FOLDERSTI+"'");
            return null;
        }else {
            return allFiles;
        }
    }

    private static void setSprog(int index){
        File[] sprogFiler = getSprogFiler();
        if(sprogFiler != null ){
            if(index>0 && index<sprogFiler.length){
                nuvaerendeTekstFil = sprogFiler[index];
            }else{
                System.out.println("FEJL: Forsøgte at sætte ikke-eksisterende sprog!");
            }
        }
    }



    private static File getTekstFil(){
        if(nuvaerendeTekstFil == null){
            nuvaerendeTekstFil = new File(FOLDERSTI+"dansk.txt");
        }
        return nuvaerendeTekstFil;
    }


    /**
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
                    break;
                }}

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


    static String getLinjeFraFil(File tekstFil, int linjeNummer){
        String tekst = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(tekstFil));
            for(int i=0; i<=linjeNummer; i++){
                tekst = reader.readLine();
            }

        }catch(FileNotFoundException e){
            System.out.println("No File");
        }catch(IOException e){
            System.out.println("IOException");
        }
        return tekst;
    }

    static String getTekst(int linjeNummer){
        String tekst = getLinjeFraFil(getTekstFil(), linjeNummer);

        return findPrintbarTekst(tekst);
    }

    private static void getFile()throws IOException {
        File f = new File("tekst"+File.separator+"dansk.txt");

        String msg = (f.createNewFile()) ? "Created new file" : "Didn't create new file";

        String dir = System.getProperty("user.dir");
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String[] sprog = getSprog();

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
