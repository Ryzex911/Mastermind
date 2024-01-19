package package1;

import java.util.*;

public class Class10 {

    public static void main(String[] args) {
        Scanner raden = new Scanner(System.in);
        Random codeMaker = new Random();
        
        int maxgetal = 6;
        int code1, code2, code3, code4;
    
        do { 
            code1 = 1 + codeMaker.nextInt(maxgetal);
            code2 = 1 + codeMaker.nextInt(maxgetal);
            code3 = 1 + codeMaker.nextInt(maxgetal);
            code4 = 1 + codeMaker.nextInt(maxgetal);
        } while (code1 == code2 || code1 == code3 || code1 == code4 || code2 == code3 || code2 == code4 || code3 == code4);

        System.out.println("Geheime Code: " + code1 + " " + code2 + " " + code3 + " " + code4);

        Integer Tries = 0;

        while (Tries < 10) {
            Tries++;

            System.out.println("Voer je gok in, let erop dat je spaties moet gebruiken per cijfer:");
            int attempt1 = raden.nextInt();
            int attempt2 = raden.nextInt();
            int attempt3 = raden.nextInt();
            int attempt4 = raden.nextInt();

            if (attempt1 == code1) {
                System.out.println("○!");
            } else if (attempt1 == code2 || attempt1 == code3 || attempt1 == code4) {
                System.out.println("●");
            } else {
                System.out.println("-!");
            }

            if (attempt2 == code2) {
                System.out.println("○!");
            } else if (attempt2 == code1 || attempt2 == code3 || attempt2 == code4) {
                System.out.println("●");
            } else {
                System.out.println("-!");
            }

            if (attempt3 == code3) {
                System.out.println("○!");
            } else if (attempt3 == code1 || attempt3 == code2 || attempt3 == code4) {
                System.out.println("●");
            } else {
                System.out.println("-!");
            }

            if (attempt4 == code4) {
                System.out.println("○!");
            } else if (attempt4 == code1 || attempt4 == code2 || attempt4 == code3) {
                System.out.println("●");
            } else {
                System.out.println("-!");
            }

            if (attempt1 == code1 && attempt2 == code2 && attempt3 == code3 && attempt4 == code4) {
                System.out.println("Gefeliciteerd! Je hebt de code geraden!");
                break;
            } else {
                System.out.println("Dat was niet helemaal goed, probeer het opnieuw.");
            }
        }

        if (Tries == 10) {
            System.err.println("Sorry! Je hebt al je pogingen gebruikt.");
            System.err.println("Probeer het spel opnieuw!");
        }
    }
}
 //Ryzex//
