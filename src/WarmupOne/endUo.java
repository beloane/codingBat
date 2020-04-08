package WarmupOne;

public class endUo {
    public String endUp(String str) {
        if (str.length() < 3) return str.toUpperCase();
        else {
            String str1;
            String str2;
            str1 = str.substring(0, str.length() - 3);
            str2 = str.substring(str.length() - 3).toUpperCase();
            return str1 + str2;
        }

    }
}
