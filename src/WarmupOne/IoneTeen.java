package WarmupOne;

public class IoneTeen {
    public boolean IoneTeen(int a, int b) {
        boolean ateen = (a >= 13 && a <= 19);
        boolean bteen = (b >= 13 && b <= 19);
        return (ateen && !bteen) || (!ateen && bteen);
    }
}
