package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the word: ");
        String mainString = input.nextLine();
        StringMethod.lettersDuplicate(mainString);
    }
}
