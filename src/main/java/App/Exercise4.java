package App;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = scanner.next();
        System.out.print("Enter a verb: ");
        String verb = scanner.next();
        System.out.print("Enter a adjective: ");
        String adjective = scanner.next();
        System.out.print("Enter a adverb: ");
        String adverb = scanner.next();
        System.out.println("Do you " + verb + " your "+ adjective + " " + noun + " " + adverb + "? That's hilarious" );
    }
}