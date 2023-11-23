/*Given two integer arrays nums1 and nums2, return an array of their intersection.
 Each element in the result must be unique. you may return the result in any order.*/

import java.util.Scanner;

public class Intersection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array1[] = {1, 2, 3};
        int array2[] = {2, 3, 4};


        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (array1[i] == array2[j])

                    System.out.print("[" + array1[i] + "]");
            }
        }
    }
}

