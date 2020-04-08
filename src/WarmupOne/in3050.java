package WarmupOne;

public class in3050 {
    public boolean in3050(int a, int b) {
        boolean ainrange30 = (a>=30)&&(a<=40);
        boolean binrange30 = (b>=30)&&(b<=40);
        boolean ainrange40 = (a>=40)&&(a<=50);
        boolean binrange40 = (b>=40)&&(b<=50);
        if(ainrange30 && binrange30) return true;
        else if(ainrange40 && binrange40) return true;
        else return false;
    }
}
