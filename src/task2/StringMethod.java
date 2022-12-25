package task2;

public class StringMethod {
    public static void wordWithMaxLength(String mainString) {
        int max = 0;
        String longestWord = "";

        String[] wordsArray = mainString.split(", ");

        for (String tmpString : wordsArray) {
            if (tmpString.length() >= max) {
                max = tmpString.length();
                longestWord = tmpString;
            }
        }
        System.out.println("the longest word is " + longestWord);
    }

    public static void wordWithMinLength(String mainString) {
        int min = 20;
        String shortestWorld = "";

        String[] wordsArray = mainString.split(", ");

        for (String tmpString : wordsArray) {
            if (tmpString.length() <= min) {
                min = tmpString.length();
                shortestWorld = tmpString;
            }
        }
        System.out.println("the shortest word is " + shortestWorld);
    }
}
