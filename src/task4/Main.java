package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mainString = "pop, rock, stop, mom, poop, bacab, clock";

        System.out.print(mainString + "\nenter a position: ");
        int position = input.nextInt();
        StringMethod.palindromeMethod(mainString, position);

        System.out.println("\nprint all palindromes: ");
        StringMethod.checkAllWords(mainString);
    }
}
