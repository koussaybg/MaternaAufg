package Kapitel4;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String[] args) {
        double rand=Math.random()*10+10 ;
        System.out.println(rand);

//        System.out.printf(
//                "<svg height=\"100\" width=\"1000\">\n "
//                        + "<circle cx=\"%d\" cy=\"%d\" r=\"%s\" />\n</svg>\n%n",
//                100, 100, rand );


        Aufgabe159();

    }

    static void Aufgabe123 (){
        double rand=Math.random()*10+10 ;
        int  cx = new java.util.Scanner( System.in ).nextInt();
        int  cy = new java.util.Scanner( System.in ).nextInt();
        System.out.printf( "Aufgabe123 \n " +
                "<svg height=\"100\" width=\"1000\">\n "
                        + "<circle cx=\"%d\" cy=\"%d\" r=\"%s\" />\n</svg>\n%n",
                cx, cy, rand );

    }

    static void Aufgabe131(){
        double CosimoFatface=new java.util.Scanner(System.in).nextDouble() ;
        double LuciaRubberneck=new java.util.Scanner(System.in).nextDouble() ;
        double SlickFootVito=new java.util.Scanner(System.in).nextDouble() ;


        if (CosimoFatface+LuciaRubberneck+SlickFootVito<1E6) {
            System.out.println("Smaller than 1M");
            System.out.println(false);
        }
        else {
            System.out.println("Done greater than 1M");
            System.out.println(false);
        }

    }

    static void Aufgabe132() {

        System.out.println( "Number of bottles in total?" );
        int bottles = new java.util.Scanner( System.in ).nextInt();

        int captainsBottles = bottles / 2;
        int crewsBottles    = bottles - captainsBottles;

        System.out.println( "Bottles for the captain: " + captainsBottles );
        System.out.println( "Bottles for all crew members: " + crewsBottles );

        System.out.println( "Number of crew members?" );
        int crewMembers = new java.util.Scanner( System.in ).nextInt();
        System.out.println( "Fair share without remainder? " + (crewsBottles % crewMembers == 0) );

    }

    static  boolean Aufgabe133(){
        System.out.println( "Number 1 :" );
        int number1 = new java.util.Scanner( System.in ).nextInt();
        System.out.println( "Number 1 :" );
        int number2 = new java.util.Scanner( System.in ).nextInt();
        int number1_1= number1%10 ;
        int number1_2= number1/10 ;
        int number2_1= number2%10 ;
        int number2_2= number2/10 ;
        return number1_1==number2_1 ||
                number1_1==number2_2 ||
                number1_2==number2_1 ||
                number1_2==number2_2 ;
    }

    static void Aufgabe134_CoinMachine(){
    // this is the change making problem : the Greedy Solution is not the Optimal one !
        System.out.println( "Please enter amount of money: :" );
        double number = new java.util.Scanner( System.in ).nextDouble();
        int numberToCent= (int) (number*100);
        double[] Liretta = {2.0, 1.0,0.5 ,0.2,0.1,0.05,0.02,0.01} ;
        System.out.printf ("%d x 2 Liretta %n",numberToCent/200);numberToCent=numberToCent%200;
        System.out.printf ("%d x 1 Liretta %n",numberToCent/100);numberToCent=numberToCent%100;
        System.out.printf ("%d x 50 Lirettacent %n",numberToCent/50);numberToCent=numberToCent%50;
        System.out.printf ("%d x 20 Lirettacent %n",numberToCent/20);numberToCent=numberToCent%20;
        System.out.printf ("%d x 10 Lirettacent %n",numberToCent/10);numberToCent=numberToCent%10;
        System.out.printf ("%d x 5 Lirettacent %n",numberToCent/5);numberToCent=numberToCent%5;
        System.out.printf ("%d x 2 Lirettacent %n",numberToCent/2);numberToCent=numberToCent%2;
        System.out.printf ("%d x 1 Lirettacent %n",numberToCent);

    }

    static void Aufgabe135_grammar(){
        System.out.println("Please enter amount of Bottles:");
        int noOfBottles = new Scanner(System.in).nextInt();
        System.out.printf( "%d bottle%s of rum%n",
                noOfBottles, noOfBottles != 1 ? "s" : "" );
    }

    static void Aufgabe0141(){
        System.out.println("prize of the watch :");
        double prize= new java.util.Scanner(System.in).nextDouble() ;
        System.out.println("Money given :");
        double payment= new java.util.Scanner(System.in).nextDouble() ;
        if(payment>prize*1.20 || payment<prize*0.90) System.out.println("You son of a bi***!") ;
                                                else System.out.println("Good boy!");
    }

    static void Aufgabe142(){
        System.out.println("Enter quantity in liters:\n");
        double quantity= new java.util.Scanner(System.in).nextDouble() ;
        if(quantity>1.0)  {
            System.out.printf("approx. %d l" ,(int)quantity);
            return;
        }
        if(quantity>0.1)  {
            System.out.printf("approx. %.0f cl" ,quantity*100);
            return;
        }
        if (quantity>0.01){
            System.out.printf("approx. %.0f ml" ,quantity*1000);
            return;
        }
        System.out.println("Value too small to display");

    }

    static void Aufgabe143(){
        //Math.random() is a pseudo-random number it's better to use SecureRandom()
        double rand= Math.random() ;
        if (rand<0.33) System.out.println("<circle cx=\"20\" cy=\"20\" r=\"5\" fill=\"blue\" />");
        else {
            if (rand > 0.66) System.out.println("<circle cx=\"20\" cy=\"20\" r=\"5\" fill=\"green\" />");
            else System.out.println("<circle cx=\"20\" cy=\"20\" r=\"5\" fill=\"green\" />");
        }
    }

    static void Aufgabe144(){
        String[] words={"ay", "aye", "ay, ay", "ja","joo"} ;
        System.out.println("Enter the word:");
        String input=new java.util.Scanner(System.in).next();
        if (Arrays.asList(words).contains(input)) System.out.println("Keep it up!") ;
        else System.out.println("Don’t you dare!");


    }

    static void Aufgabe15() {
        String svg = "<svg height=\"200\" width=\"200\">\n" +
                " <rect x=\"50\" y=\"50\" width=\"100\" height=\"100\" stroke=\"black\" fill=\"none\"\n" +
                "       transform=\"rotate(%d 100 100)\" />\n" +
                "</svg>";
        for (int i = 0; i < 360; i+=10) {
            System.out.printf(svg, i);
        }
    }
    static void Aufgabe151(){
        String svg = "<svg height=\"100\" width=\"1000\">\n" +
                "%s"+
                "</svg>" ;
        String emptystr="" ;
        for (int i = 0; i < 50; i++) {
            double random = Math.random();
            String color = random < 1./3 ? "blue" :
                    random < 2./3 ? "green" : "orange";
            emptystr+=String.format("<circle cx=\"20\" cy=\"20\" r=\"5\" fill=\"%s\" />%n",color) ;
        }
        System.out.printf(svg,emptystr);
    }
    static void Aufgabe153(){
        int input ;
        int summe=0;
        do{
             input=new java.util.Scanner(System.in).nextInt() ;
             summe+=input ;
        }while (input!=0);
        System.out.println(summe);
    }
    static void Aufgabe154(){
        double t = Math.random() * 10;
        while (t>0){
            t = t<1 ? t*2 : --t ;
            System.out.println(t);
        }

    }
    static void Aufgabe155(){
        long input=new java.util.Scanner(System.in).nextInt() ;
        long summe=1 ;
        if (input>=0){
            for (long i = input; i > 0; i--) {
                summe=Math.multiplyExact(summe,input--) ;
            }
            System.out.println(summe);
        }
        else System.out.println("Number must not be negative");

    }

    static void Aufgabe156(){
        long input=new java.util.Scanner(System.in).nextInt() ;
        long Originalinput=input ;
        int factor= 0;
        while (input>1){
            if (input%++factor==0 && input>=factor){
                input/=factor ;

            }
            else {
                System.out.printf("%d is not a factorial",Originalinput);
                return;
            }
        }
        System.out.printf("%d!",factor);
    }

    static void Aufgabe157(){
        long input=new java.util.Scanner(System.in).nextLong() ;
        long min=9,max=-1 ; // should be Math.MAX_INTEGER for min ,
        while (input!=0){
            min = Math.min(input % 10, min);
            max = Math.max(input%10,max) ;
            input/=10 ;
        }
        System.out.printf("%d,%d",min,max);
    }

    static void Aufgabe158() {
        int input = new java.util.Scanner(System.in).nextInt();
        for (int i = 1; i < input; i++) {
            for (int index = 0; index < (input - i); index++)
                System.out.print(" ");
            for (int j = 0; j < i; j++) {
                System.out.printf("%d", i);
            }
            System.out.println();
        }
    }
    static void Aufgabe159(){
        System.out.println("Checkerboard width :");
        int width = new java.util.Scanner(System.in).nextInt();
        System.out.println("Checkerboard height :");
        int height = new java.util.Scanner(System.in).nextInt();
        String line="";
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i%2==0) line = j%2==0 ? line.concat("_") : line.concat("#") ;
                else line = j%2==0 ? line.concat("#") : line.concat("_") ;
            }
            line+="\n";
        }
        System.out.println(line);
    }








}

