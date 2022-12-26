package task3;

import java.util.Arrays;

public class StringMethod {
    public static void findMinRepetition(String mainString) {
        int min = 25;
        int count = 0;
        int res = 0;

        String[] strSplit = mainString.split(", ");

        for (String word : strSplit) {
            StringBuilder stringBuilderWord = new StringBuilder(word);
            char[] lettersArray = word.toCharArray();

            for (int j = 0; j < lettersArray.length; j++) {
                int findSimilarLetters = word.indexOf(lettersArray[j], j + 1);
                
                if (findSimilarLetters >= 0) {
                    stringBuilderWord.deleteCharAt(j);
                    word = stringBuilderWord.toString();
                    j--;
                }
            }
            if (word.length() < min) {
                min = word.length();
                res = count;
            }
            count++;
        }
        System.out.println(strSplit[res]);
    }
}


