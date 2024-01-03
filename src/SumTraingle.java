import java.util.Arrays;

/*Given an array of integers, print a sum triangle from it such that the first level has all
 array elements. From then, at each level number of elements is one less than the previous level
 and elements at the level is be the Sum of consecutive two elements in the previous level.
 */
public class SumTraingle {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        sum(array);
    }
    static void sum(int[] array){
        if(array.length == 0)
            return;
        int[] temp=new int[array.length-1];
        for (int i = 0; i < array.length-1; i++) {
            int x= array[i]+array[i+1];
            temp[i] = x;
        }
        System.out.println(Arrays.toString(array));
        sum(temp);
    }
}
