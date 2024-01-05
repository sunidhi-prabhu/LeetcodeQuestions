//Print numbers from 1 to N without the help of loops.
public class NoLoop {
    public static void main(String[] args) {
        int n = 10;
        noloop(n);
    }

    private static void noloop(int n) {
        if(n==0)
            return;
        System.out.println(n);
        noloop(n-1);
    }
}
