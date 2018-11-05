import Tekst.Tekst;

import Tekst.TekstController;

import java.util.Scanner;

import static Tekst.Tekst.saetSprog;

public class UI {
    Scanner input = new Scanner(System.in);


    public void vaelgSprog(){
        int sprog;

        System.out.println(saetSprog());
        for(int i = 0; i<TekstController.getAlleSprog().length;i++){
            System.out.println(i + " "+TekstController.getAlleSprog()[i]);
        }

        TekstController.setSprog(input.nextInt());

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

    public void printTur(int spillerTur){
        System.out.println(Tekst.spillerTur1()+" "+spillerTur+Tekst.spillerTur2());
    }

    public void slåRaflebaeger(){
        System.out.println(Tekst.slaaMedTerning());
    }

    public void printTerning(int terningVerdi){

    }

    public void printFelt(int FeltNr){}

    public void printSpillerPenge(int spillerPenge){}

    public void printVinder(int SpillerNr){}

    public void farvelPrint(){}


    public static void main(String[] args) {
        UI hej = new UI();

        hej.printTur(1);

    }

}
