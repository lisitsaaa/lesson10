package task5;

public class StringMethod {
    public static void lettersDuplicate(String mainString) {
        char[] lettersArray = mainString.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char letters : lettersArray){
            sb.append(letters).append(letters);
        }

        System.out.println(sb);
    }
}
