package WarmupTwo;

public class doubleX {
    boolean doubleX(String str) {
        int primuX=str.indexOf('x');
        if((str.length()<=1)||(str.indexOf('x')==str.length()-1)) return false;
        else
            return str.charAt(primuX + 1) == 'x';
    }
}
