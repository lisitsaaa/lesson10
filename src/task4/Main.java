package task4;

public class Main {
    public static void main(String[] args) {
        String mainString = "pop, rock, stop, mom, poop, bacab, clock";

        StringMethod.palindromeMethod(mainString,5);

        System.out.println();

        StringMethod.checkAllWords(mainString);
    }
}
