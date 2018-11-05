import Tekst.Tekst;

import Tekst.TekstController;

import java.util.Scanner;

public class UI {
    Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        UI ui = new UI();

        ui.startSpil();


    }


    public void printIntro(){}

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

    public void printTur(int spillerTur){}

    public void slåRaflebaeger(){}

    public void printTerning(int terningVerdi){}

    public void printFelt(int FeltNr){}

    public void printSpillerPenge(int spillerPenge){}

    public void printVinder(int SpillerNr){}

    public void farvelPrint(){}


}
