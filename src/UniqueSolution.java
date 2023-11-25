/*You are given a sorted array consisting of only integers where every
element appears exactly twice, except for one element which appears exactly once.
Return the single element that appears only once.*/

public class UniqueSolution {
    public static void main(String[] args) {
        int array[] = {1, 1, 2, 3, 3};
        int ans = uniqueSolution(array);
        System.out.println(ans);
    }

    static int uniqueSolution(int array[]) {
        int res = 0;
        for (int i = 0; i < array.length; i++)
            res ^= array[i];

        return res;
    }

}