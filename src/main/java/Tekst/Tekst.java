package Tekst;

public class Tekst {

    public static String sprogNavn(){ return TekstController.getTekst(0);}

    public static String feltTitel(int feltNummer){ return TekstController.getTekst((feltNummer*2-3));}

    public static String feltBeskrivelse(int feltNummer){ return TekstController.getTekst(feltNummer*2-2);}

    public static String spilNavn(){return TekstController.getTekst(23);}
    public static String velkommen(){return TekstController.getTekst(24);}
    public static String spilBeskrivelse(){return TekstController.getTekst(25);}
    public static String saetSprog(){return TekstController.getTekst(26);}
    public static String startSpil(){return TekstController.getTekst(27);}
    public static String spillerTur1(){return TekstController.getTekst(28);}
    public static String spillerTur2(){return TekstController.getTekst(29);}
    public static String landetPaa(){return TekstController.getTekst(30);}
    public static String penge1(){return TekstController.getTekst(31);}
    public static String penge2(){return TekstController.getTekst(32);}
    public static String farvel(){return TekstController.getTekst(33);}
    public static String harVundet2(){return TekstController.getTekst(34);}
    public static String spillerMedSmaat(){return TekstController.getTekst(35);}
    public static String spillerMedStort(){return TekstController.getTekst(36);}
    public static String slaaMedTerning(){return TekstController.getTekst(37);}
    public static String printTerning(){return TekstController.getTekst(38);}
    public static String forkertInput () {return TekstController.getTekst(39);}

}
