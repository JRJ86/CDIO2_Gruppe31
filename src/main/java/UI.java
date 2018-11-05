import Tekst.Tekst;

import Tekst.TekstController;

import java.util.Scanner;

public class UI {
    Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        UI ui = new UI();

        ui.startSpil();

        ui.printFelt(8);

        ui.printVinder(2);

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
        System.out.println(Tekst.spillerTur1()+" "+spillerTur+Tekst.spillerTur2());
    }

    public void slåRaflebaeger(){}

    public void printTerning(int terningVerdi){

    }

    /**
     * @author Malte
     * @param feltNr For hvilket felt nummer man gerne vil printe */
    public void printFelt(int feltNr){
        System.out.println(Tekst.landetPaa());
        System.out.println(Tekst.feltTitel(feltNr));
        System.out.println(Tekst.feltBeskrivelse(feltNr));
    }

    public void printSpillerPenge(int spillerPenge){}

    /**
     * @author Malte
     * @param SpillerNr Spillerens nummer, der har vundet
     */
    public void printVinder(int SpillerNr){
        System.out.println(Tekst.spillerMedStort()+" "+SpillerNr+" "+Tekst.harVundet2());
    }

    public void farvelPrint(){}


}
