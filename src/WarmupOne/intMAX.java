package WarmupOne;

public class intMAX {
    public int intMax(int a, int b, int c) {
        if((a>b)&&(a>c)) return a;
        else if((c>b)&&(c>a)) return c;
        else return b;
    }
}
