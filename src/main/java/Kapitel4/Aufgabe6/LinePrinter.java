package Kapitel4.Aufgabe6;

public class LinePrinter {
    int r;
    public static void main(String[] args) {
        line( 5, "*=" );
    }

    static void line(int len) {
        System.out.println("-".repeat(len));
    }
    static void line(int len,char c){
        System.out.println((""+c).repeat(len)) ;
    }
    static void line(String prefix, int len, char c, String suffix){
        System.out.println(prefix+(""+c).repeat(len)+suffix);
    }

    //Optional
    static void line(int len, String s){
        System.out.println(s.repeat(len/s.length())+s.substring(0,len%s.length()));
    }
}
