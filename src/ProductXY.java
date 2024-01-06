//Given two numbers x and y find the product using recursion.

public class ProductXY {
    public static void main(String[] args) {
        int x = 6, y = 6;
         int res = prod(x,y);
        System.out.println(res);
    }
    private static int prod(int x, int y) {
        if(y==0)
            return 0;
        return x + prod(x,y-1);
    }
}
