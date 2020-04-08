package WarmupOne;

public class max1020 {
    public int max1020(int a, int b) {
        boolean ainrange = (a>=10) && (a<=20);
        boolean binrange = (b>=10) && (b<=20);

        if((ainrange&&binrange) && (a>b)){ return a;}
        if((ainrange&&binrange) && (b>a)){ return b;}

        if(ainrange && !binrange) return a;
        if(binrange && !ainrange) return b;

        else return 0;


    }

}
