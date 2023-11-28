//given a rotated array find the target element using binary search and return the index

public class BSR {
    public static void main(String[] args) {
        int array[] = {5,6,7,1,2,3};
        int target = 3;
        int ans = BSR(array, target, 0, array.length -1);
        System.out.println(ans);

    }
    static int BSR(int array[], int target, int s, int e){
        int m =(s + e) / 2;
        if(array[m] == target)
            return m;
        if(s>e)
            return -1;
        if(array[s] <= array[m]) {
            if (array[s] < target && array[m] > target)
                return BSR(array, target, s, m - 1);
            else
                return BSR(array, target, m + 1, e);
        }
        if(array[s] > array [m]) {
            if (array[s] < target && array[m] > target)
                return BSR(array, target, s, m - 1);
            else
                return BSR(array, target, m + 1, e);
        }
        return -1;
}}

