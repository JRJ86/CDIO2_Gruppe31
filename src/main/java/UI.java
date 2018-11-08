import Tekst.Tekst;

import Tekst.TekstController;

import java.io.IOException;
import java.util.Scanner;

public class UI {
    Scanner input = new Scanner(System.in);


    /**
     * @author Abhishek-Kashyap (Stackoverflow.com)
     * https://stackoverflow.com/questions/2979383/java-clear-the-console
     *
     * En metode der rydder konsollen. Er kun dokumenteret til at fungere på Windows.
     * Hvis den laver en fejl, er der indsat en try catch statement, så programmet ikke
     * crasher.
     */
    public void rydKonsol(){
        //Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }


    public void vaelgSprog(){

        rydKonsol();
        System.out.println(Tekst.saetSprog());
        int antalSprog = TekstController.getAlleSprog().length;
        for(int i = 0; i<antalSprog;i++){
            System.out.println("\t"+(i+1) + ") "+TekstController.getAlleSprog()[i]);
        }

        int tal = 0;

        while (true){

            tal = input.nextInt();

            if (tal >= 1 && tal <antalSprog+1){
                break;
            }
            else{
                System.out.println(Tekst.forkertInput());
            }
        }

        TekstController.setSprog(tal-1);

    }


    /**
     * @author Filip
     * Metode der printer spillets intro
     */
    public void printIntro(){

        rydKonsol();

        System.out.println("----------------------");
        System.out.println(Tekst.velkommen());
        System.out.println("'"+Tekst.spilNavn()+"'");
        System.out.println("----------------------");
        System.out.println(Tekst.spilBeskrivelse());
        System.out.println("----------------------");

    }

    /**
     * @author Filip
     * Metode der beder spilleren om at taste 1 for at starte spillet
     * og fortsætter indtil spilleren angiver det rigtige input
     */
    public void startSpil(){

        while (true){

            System.out.println(Tekst.startSpil());

            int tal = input.nextInt();

            if (tal > 1){

                System.out.println("Forkert input, prøv igen");

            }

            if (tal < 1){

                System.out.println("Forkert input, prøv igen");

            }

            else if (tal == 1){

                break;

            }
        }
        rydKonsol();

    }


    /**
     * @author Malte
     * @param spillerTur hvis spiller tur skal printes */
    public void printTur(int spillerTur){
        System.out.println("\n" +
                            "\n"+Tekst.spillerTur1()+" "+spillerTur+" "+Tekst.spillerTur2());
    }


    /**
     * @author Andreas & Malte
     */
    public void slåRaflebaeger(){

        System.out.println("\n" +
                            Tekst.slaaMedTerning());

        while (true){

            int tal = input.nextInt();

            if (tal == 1){
                break;
            }
            else{
                System.out.println("Forkert input, prøv igen");
            }
        }
    }


    public void printTerning(int terningVerdi){
        System.out.println(Tekst.printTerning()+" "+terningVerdi);
    }

    /**
     * @author Malte
     * @param feltNr For hvilket felt nummer man gerne vil printe */
    public void printFelt(int feltNr){

        System.out.println("\n" +
                            Tekst.landetPaa());
        System.out.println(Tekst.feltTitel(feltNr));
        System.out.println(Tekst.feltBeskrivelse(feltNr));
    }

    public void printSpillerPenge(int spillerPenge){
        System.out.println("\n" +
                            Tekst.penge1()+" "+spillerPenge+" "+Tekst.penge2());
    }

    /**
     * @author Malte
     * @param SpillerNr Spillerens nummer, der har vundet
     */
    public void printVinder(int SpillerNr){
        System.out.println("\n" +
                            "\n" +
                            Tekst.spillerMedStort()+" "+SpillerNr+" "+Tekst.harVundet2());
    }

    /**
     * @author Filip
     * Metode der printer et farvel når spillet er slut
     */
    public void farvelPrint(){

        System.out.println("\n" +
                            "----------------------");
        System.out.println(Tekst.farvel());
        System.out.println("----------------------");

    }

}
