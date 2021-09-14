/*
UCF COP3330 FALL 2021 ASSIGNMENT 4 SOLUTION
COPYRIGHT 2021 Jonathan Tsui
 */

import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args){
        String noun, verb, adjective, adverb;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a noun: ");
        noun = scan.nextLine();

        System.out.println("Enter a verb: ");
        verb = scan.nextLine();

        System.out.println("Enter an adjective: ");
        adjective = scan.nextLine();
        System.out.println("Enter an adverb: ");
        adverb = scan.nextLine();

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's Hilarious!");
    }

}
