/*Given an array of integers nums which is sorted in ascending order,
 and an integer target, write a function to search target in nums. If target exists,
  then return its index. Otherwise, return -1.*/

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the size of the array");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();

        System.out.println("enter a target");
        int target = in.nextInt();
        int ans = binarySearch(arr, n, target);
        System.out.println(ans);
    }

    static int binarySearch(int arr[],int n, int target){

        int high = n - 1, low = 0, mid, found = 0;

        while(low <= high){
            mid = (low + high)/2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;

        }

        return -1;
    }
}
