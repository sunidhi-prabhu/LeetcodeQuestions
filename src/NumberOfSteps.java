//return number of steps to reduce the given number to 0

public class NumberOfSteps {
    public static void main(String[] args) {
        int n = 14;
        int ans = NumberOfSteps(n ,0);

        System.out.println("the number of steps required to reduce the given number to zero is " + ans);
    }


    static int NumberOfSteps(int n, int steps){
        if(n == 0)
            return steps;

        if (n % 2 == 0)
            return NumberOfSteps(n / 2, steps + 1);
        return NumberOfSteps(n - 1, steps + 1);
    }
}
