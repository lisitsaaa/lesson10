package task1;

import java.util.SplittableRandom;

public class MethodForString {

    public static void twoBlockOfFourDigits(String docNum) {
        String[] split = docNum.split("-");
        System.out.println(split[0] + split[2]);
    }

    public static void replaceBlocksOfThreeLetters(String docNum) {
        String[] split = docNum.split("-");

        String newString = docNum.replace(split[1], "***");
        newString = newString.replace(split[3], "***");

        System.out.println(newString);
    }

    public static void printLettersInLowercase(String docNum) {
        String res = docNum.substring(5, 8) + "/" +
                docNum.substring(14, 17) + "/" +
                docNum.charAt(19) + "/" +
                docNum.charAt(21);

        String lowercase = res.toLowerCase();
        System.out.println(lowercase);
    }

    public static void printLettersInUppercase(String docNum) {
        StringBuilder res = new StringBuilder(docNum.substring(5, 8) + "/" +
                docNum.substring(14, 17) + "/" +
                docNum.charAt(19) + "/" +
                docNum.charAt(21));

        res = new StringBuilder("Letters: " + res.toString().toUpperCase());

        System.out.println(res);
    }

    public static void abcEqualsIgnoreCase(String docNum){
        boolean equals = docNum.equalsIgnoreCase("abc");
        System.out.println(equals);
    }

    public static void equalsFirstDigits(String docNum){
        String temporaryString = docNum.substring(0,3);
        boolean equals = temporaryString.equals("555");
        System.out.println(equals);
    }

    public static void equalsLastBlock(String docNum){
        String[] split = docNum.split("-");
        boolean equals = split[4].equals("1a2b");
        System.out.println(equals);
    }

}
