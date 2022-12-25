package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string -> xxxx-yyy-xxxx-yyy-xyxy" +
                "\nfor example 0123-ABc-4567-dEf-8G9H: ");
        String documentNumber = input.nextLine();

        System.out.print("Method 1 -> ");
        MethodForString.twoBlockOfFourDigits(documentNumber);
        System.out.print("Method 2 -> ");
        MethodForString.replaceBlocksOfThreeLetters(documentNumber);
        System.out.print("Method 3 -> ");
        MethodForString.printLettersInLowercase(documentNumber);
        System.out.print("Method 4 -> ");
        MethodForString.printLettersInUppercase(documentNumber);
        System.out.print("Method 5 -> ");
        MethodForString.abcEqualsIgnoreCase(documentNumber);
        System.out.print("Method 6 -> ");
        MethodForString.equalsFirstDigits(documentNumber);
        System.out.print("Method 7 -> ");
        MethodForString.equalsLastBlock(documentNumber);
    }
}
