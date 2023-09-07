package Kapitel4.Aufgabe6;

public class Collatz {


    public static void main(String[] args) {
        collatz(7);
    }
    static void collatz(long n){
        if (n>1) {
            System.out.print(n + "->");
             if(n%2==0)  collatz(n/2);
                    else collatz(3*n+1);
        }
        else {
            System.out.print(n);
        }
    }


}
