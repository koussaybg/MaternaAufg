package Kapitel4.Aufgabe6;

public class multip {



    public static void main(String[] args) {
        System.out.println(htmlTable(5));
    }

    static String htmlTable(int quantity){
        String quantityString=buildbody(quantity) ;
        return String.format("<html>\n<table>\n%s</table>\n</html>",quantityString);

    }

    private static String buildbody(int quantity) {
        int FLAMETHROWER=500;
        int FIRE_EXTINGUISHER =100 ;
        String body="<tr><th>Quantity</th><th>Flamethrower</th><th>Fire extinguisher</th></tr>\n";
        for (int i = 1; i <= quantity; i++) {
            body=body.concat(String.format("<tr><td>%d</td><td>%d</td><td>%d</td></tr>\n",i,FLAMETHROWER*i,FIRE_EXTINGUISHER*i));
        }
        return body ;
    }
}
