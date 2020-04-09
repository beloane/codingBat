package WarmupTwo;

public class stringBits {
    public String stringBits(String str) {
        String result = "";
        int n = 0;
        while (n < str.length()) {
            result = result + str.charAt(n);
            n=n+2;
        }
        return result;
    }
}
