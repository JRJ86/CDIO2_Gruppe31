package Tekst;

import java.io.*;
import java.util.Scanner;

public class TekstController {
    private static String FOLDERSTI = "tekst"+File.separator;
    private static File nuvaerendeTekstFil = null;


    private static String[] getSprog(){
        File[] sprogFiler = getSprogFiler();
        String[] sprog = new String[sprogFiler.length];
        for( int i = 0; i<sprogFiler.length; i++){
            sprog[i] = fjernEtiket(getLinjeFraFil(sprogFiler[i],0));
        }
        return sprog;
    }

    private static File[] getSprogFiler(){
        File f = new File(FOLDERSTI);
        File[] allFiles = f.listFiles();
        return allFiles;
    }

    private static void setSprog(int index){
        File[] sprogFiler = getSprogFiler();
        nuvaerendeTekstFil = sprogFiler[index];
    }

    private static File getTekstFil(){
        if(nuvaerendeTekstFil == null){
            nuvaerendeTekstFil = new File(FOLDERSTI+"dansk.txt");
        }
        return nuvaerendeTekstFil;
    }

    static String fjernEtiket(String tekst){
        for(int i=0; i<tekst.length(); i++ ){
            if(tekst.charAt(i)=='"'){
                for(int ii=i+1; ii<tekst.length(); ii++ ){
                    if(tekst.charAt(ii)=='"'){
                        tekst = tekst.substring(i+1,ii);
                        break;
                    }
                }
                break;
            }
        }
        return tekst;
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

        return fjernEtiket(tekst);
    }

    private static void getFile()throws IOException {
        File f = new File("tekst"+File.separator+"dansk.txt");

        String msg = (f.createNewFile()) ? "Created new file" : "Didn't create new file";

        String dir = System.getProperty("user.dir");
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String[] sprog = getSprog();

        for(int i=0; i<sprog.length; i++){
            System.out.println(""+i+") "+sprog[i]);
        }


        do {
            int input = scanner.nextInt();

            if(input>=0 && input<sprog.length){
                setSprog(input);
                break;
            }else if (input==999){
                break;
            }else{
                System.out.println("Forkert input");
            }

        }while(true);

        System.out.println(Tekst.guldMineTitel());
        System.out.println(Tekst.guldMineBeskrivelse());

        scanner.close();
    }
}
