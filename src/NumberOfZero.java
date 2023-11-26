public class NumberOfZero {
    public static void main(String[] args) {
        int n = 10230;
        int ans = NumberOfZero(n);
        System.out.println("the number of zeroes are "+ ans);
    }
    static int NumberOfZero(int n){
        if(n==0)
            return 0;
        int count = 0;
        int rem = n % 10;
        if(rem == 0)
            count += 1;
        count += NumberOfZero(n / 10);
        return count;
    }
}
