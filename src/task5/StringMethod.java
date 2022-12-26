package task5;

public class StringMethod {
    public static void lettersDuplicate(String mainString) {
        String fi = "hello";
        String s1 = "";
        String str = "";
        for (int i = 0; i < fi.length(); i++) {
            char s = mainString.charAt(i);
            s1 = String.valueOf(s);

        }
        str = s1.concat(s1);
        String f = mainString.replace(s1, str);
        fi = f.concat(f);
        System.out.println(fi);

    }
}
