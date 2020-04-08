package WarmupOne;

public class everyNth {
    public static String everyNth(String str, int n) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++)
            if (i % n == 0) str1 = str1 + str.charAt(i);
         return str1;
    }

    public static void main(String[] args) {
        System.out.println(everyNth("Miracle",2));
        System.out.println(everyNth("abcdefg",2));
        System.out.println(everyNth("abcdefg",3));
        System.out.println(everyNth("Chocolate",3));
    }
}
