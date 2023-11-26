//using recursion return if the array is sorted or not

public class SortedArray {
    public static void main(String[] args) {
        int array[] = {1,2,3,10,7,9};
        boolean ans = SortedArray(array,0);
        if(ans == true)
            System.out.println("the array is sorted");
        else
            System.out.println("the array is not sorted");
    }


    static boolean SortedArray(int array[] , int index){

        if(index == array.length - 1)
            return true;
        return array[index] < array[index + 1] && SortedArray(array , index + 1);
    }

}

