/*
Author: Arinze Okigbo
Last Updated: 12/2/2021
*/
public class Madlib{
    public static void main(String[] args){

        System.out.println("A Story");
        System.out.println(" ");

        System.out.print( "Adjective: ");
        String adjective = StdIn.readString();

        System.out.print( "Male Name: ");
        String name = StdIn.readString();

        System.out.print( "Verb(-ed): ");
        String verbed = StdIn.readString();

        System.out.print( "Place: ");
        String place = StdIn.readString();

        System.out.print( "Noun: ");
        String noun = StdIn.readString();

        System.out.print( "Verb(present tense): ");
        String verb = StdIn.readString();

        System.out.print( "Female Name: ");
        String name2 = StdIn.readString();

        System.out.print("Song: ");
        String song = StdIn.readString();

        System.out.print("Noun: ");
        String noun2 = StdIn.readString();

        System.out.println(" ");

        System.out.print("One ");
        System.out.print(adjective);
        System.out.print("  day, a man named ");
        System.out.print(name);
        System.out.print(" ");
        System.out.print(verbed);
        System.out.print(" into a ");
        System.out.println(place);
        System.out.print(", grabbed a ");
        System.out.print(noun);
        System.out.print(" from his backpack, and proceeded to ");
        System.out.println(verb);
        System.out.print(" his friend ");
        System.out.print(name2);
        System.out.println(" because she had stolen his lucky penny. ");
        System.out.print(" He walked out the ");
        System.out.print(place);
        System.out.print(" listening to ");
        System.out.print(song);
        System.out.print(".");

    }
}