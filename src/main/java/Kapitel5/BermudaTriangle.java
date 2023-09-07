package Kapitel5;


import java.awt.Polygon;
import java.security.SecureRandom;


public class BermudaTriangle {
    static final int DIMENSION = 50;
    static final String RAINBOW = "\uD83C\uDF08";
    static final String FOG     = "\uD83C\uDF2B";
    static final String OCTOPUS = "\uD83D\uDC19";


    public static void main(String[] args) {
        Polygon polygon=new java.awt.Polygon() ;
        //Method called addPoint()
        polygon.addPoint(10,38);
        polygon.addPoint(25,20);
        polygon.addPoint(40,0);

        for ( int i = 0; i < DIMENSION; i++ ) {
            for ( int j = 0; j < DIMENSION; j++ ) {
                if ( j == 0 || i == 0 || j == DIMENSION - 1 || i == DIMENSION - 1 )
                    System.out.print( RAINBOW );
                else
                    System.out.print( polygon.contains( j, i ) ? OCTOPUS : FOG );
            }
        }
     }
    static Polygon resetWithRandomTriangle( Polygon polygon ) {
        polygon.reset();
        SecureRandom secureRandom = new SecureRandom();
        polygon.addPoint(  secureRandom.nextInt(DIMENSION), secureRandom.nextInt(DIMENSION) );
        polygon.addPoint( secureRandom.nextInt(DIMENSION), secureRandom.nextInt(DIMENSION) );
        polygon.addPoint( secureRandom.nextInt(DIMENSION), secureRandom.nextInt(DIMENSION) );
        return polygon ;

    }
    static Polygon createRandomTriangle() {
      return   resetWithRandomTriangle(new Polygon());
    }
}
