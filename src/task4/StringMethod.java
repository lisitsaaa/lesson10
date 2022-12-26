package task4;

public class StringMethod {
    public static void palindromeMethod(String mainString, int position) {
        String[] strSplit = mainString.split(", ");
        if (position < strSplit.length) {
            char[] lettersArray = strSplit[position].toCharArray();
            boolean res = false;

            for (int i = 0, j = lettersArray.length - 1;
                 i < j;
                 i++, j--) {
                if (lettersArray[i] == lettersArray[j]) {
                    res = true;
                    break;
                }
            }

            if (res) {
                System.out.println(lettersArray);
            } else {
                System.out.println("sorry, but it isn't a palindrome");
            }
        } else {
            System.out.println(position + " - incorrect digit");
        }
    }

    public static void checkAllWords(String mStr) {
        String[] s = mStr.split(", ");
        boolean res;

        for (String str : s) {
            res = false;
            char[] charArray = str.toCharArray();

            for (int i = 0, j = charArray.length - 1;
                 i < j;
                 i++, j--) {
                if (charArray[i] == charArray[j]) {
                    res = true;
                    break;
                }
            }

            if (res) {
                System.out.println(charArray);
            }
        }
    }
}

