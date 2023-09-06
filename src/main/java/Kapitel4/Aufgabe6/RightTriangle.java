package Kapitel4.Aufgabe6;

public class RightTriangle {
    public static void main(String[] args) {


        System.out.println(isRightTriangle(5, 4, 3));
    }


        public static boolean isRightTriangle( double a, double b, double c ) {
            return a*a+b*b==c*c ||
                    a*a+c*c==b*b ||
                    c*c+b*b==a*a ;
    }
}



