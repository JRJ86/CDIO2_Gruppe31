import Tekst.TekstController;

import java.util.Scanner;

public class UI {
    Scanner input = new Scanner(System.in);


    public void vaelgSprog(){
        int sprog;


        TekstController.getAlleSprog();



        TekstController.setSprog(input.nextInt());

    }

    public void printIntro(){}

    public void startSpil(){}

    public void printTur(int spillerTur){}

    public void slåRaflebaeger(){}

    public void printTerning(int terningVerdi){}

    public void printFelt(int FeltNr){}

    public void printSpillerPenge(int spillerPenge){}

    public void printVinder(int SpillerNr){}

    public void farvelPrint(){}


    public static void main(String[] args) {
        UI hej = new UI();

        hej.vaelgSprog();



    }

}
