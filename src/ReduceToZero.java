//Given an integer n, return the number of steps to reduce it to zero.
public class ReduceToZero {
    public static void main(String[] args) {
        int n = 123, count =0;
        reduce(n,count);
    }
    private static void reduce(int n,int count) {

        if(n==0)
        {
            System.out.println(count);
            return;
        }
        if(n % 2 == 0)
        {
            n /= 2;
            count++;
        }
        else
        {
            n -= 1;
            count++;
        }
        reduce(n,count);
    }
}
