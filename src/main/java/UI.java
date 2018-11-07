import Tekst.Tekst;

import Tekst.TekstController;

import java.util.Scanner;

public class UI {
    Scanner input = new Scanner(System.in);


    public void vaelgSprog(){
        int sprog;

        System.out.println(Tekst.saetSprog());
        int antalSprog = TekstController.getAlleSprog().length;
        for(int i = 0; i<antalSprog;i++){
            System.out.println(i + " "+TekstController.getAlleSprog()[i]);
        }

        int tal = 0;

        while (true){

            tal = input.nextInt();

            if (tal >= 0 && tal <antalSprog){
                break;
            }
            else{
                System.out.println(Tekst.forkertInput());
            }
        }

        TekstController.setSprog(tal);

    }


    /**
     * @author Filip
     * Metode der printer spillets intro
     */
    public void printIntro(){

        System.out.println("----------------------");
        System.out.println(Tekst.velkommen());
        System.out.println(Tekst.spilNavn());
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

    }

    /**
     * @author Malte
     * @param spillerTur hvis spiller tur skal printes */
    public void printTur(int spillerTur){
        System.out.println(Tekst.spillerTur1()+" "+spillerTur+" "+Tekst.spillerTur2());
    }

    /**
     * @author Andreas & Malte
     */
    public void slåRaflebaeger(){

        System.out.println(Tekst.slaaMedTerning());

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
        System.out.println(Tekst.landetPaa());
        System.out.println(Tekst.feltTitel(feltNr));
        System.out.println(Tekst.feltBeskrivelse(feltNr));
    }

    public void printSpillerPenge(int spillerPenge){
        System.out.println(Tekst.penge1()+" "+spillerPenge+" "+Tekst.penge2());
    }

    /**
     * @author Malte
     * @param SpillerNr Spillerens nummer, der har vundet
     */
    public void printVinder(int SpillerNr){
        System.out.println(Tekst.spillerMedStort()+" "+SpillerNr+" "+Tekst.harVundet2());
    }

    /**
     * @author Filip
     * Metode der printer et farvel når spillet er slut
     */
    public void farvelPrint(){

        System.out.println("----------------------");
        System.out.println(Tekst.farvel());
        System.out.println("----------------------");

    }

}
