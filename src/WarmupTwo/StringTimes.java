package WarmupTwo;

public class StringTimes {
    public String stringTimes(String str, int n) {
        String str1="";
        while(n>0){
            str1=str1+str;
            n--;
        }
        return str1;
    }

}
