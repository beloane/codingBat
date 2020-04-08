package WarmupOne;

public class stringE {
    public boolean stringE(String str) {
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') a++;
        }
        return (a >= 1 && a <= 3);
    }
}
