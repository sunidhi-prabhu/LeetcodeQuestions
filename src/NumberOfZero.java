import java.util.Scanner;
public class NumberOfZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = in.nextInt(); //Its a good practise to take input from user
        int ans = NumberOfZero(n);
        System.out.println("the number of zeroes are "+ ans);
    }
    static int NumberOfZero(int n){
        if(n==0)
            return 1;
        int count = 0;
        int rem = n % 10;
        while(n!=0){
            if(rem==0)
                count += 1; //counting if we get 0
            n/=10; //to check the next digit of n
            rem=n%10;
        }
        //count += NumberOfZero(n / 10);
        return count;
    }
}
