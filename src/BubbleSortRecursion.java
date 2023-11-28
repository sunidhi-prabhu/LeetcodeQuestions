//bubble sort using recursion

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int array[] = {4,3,2,1};
        bubblesort(array, array.length - 1, 0);
        System.out.println(Arrays.toString(array));
    }


    static void bubblesort(int array[],int n, int index){
        if(n == 0)
            return;

        if(index<n)
        {
            if(array[index] > array[index+1])
            {
                int temp = array[index];//swap
                array[index] = array[index+1];
                array[index+1] = temp;
            }
            bubblesort(array,n, index + 1);
        }

        else
            bubblesort(array,n - 1,0);
    }
}
