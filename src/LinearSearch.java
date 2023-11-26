//linear search using recursion

public class LinearSearch {
    public static void main(String[] args) {
        int target = 6;
        int array[] = {2, 4, 6, 8};

        int found = LinearSearch(array, target ,0);
        if(found != -1)
        System.out.println("element found at index " + found);
        else
            System.out.println("element not found");
    }

    static int LinearSearch(int array[] ,int target, int index){

        if(index == array.length - 1)
            return -1;
        else if(array[index] == target)
            return index;
        return LinearSearch(array , target, index + 1);

    }
}
