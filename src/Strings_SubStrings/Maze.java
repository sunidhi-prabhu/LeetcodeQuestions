//code for maze problems with variation in the pattern it follows. For better understanding look at the output of code "maze 7"


package Strings_SubStrings;
import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {

        System.out.println("maze 1:");
        int ans = maze1(3 ,3);//gives the count of number of steps required to reach the end point given that only down "D" and right "R" directional flow is permitted.
        System.out.println(ans);
        System.out.println();


        System.out.println("maze 2:");
        maze2("",3,3);//gives all the possible values of the direction that are required to reach the destination, provided the directional flow is limited to vertical,horizontal,diagonal.
        System.out.println();


        System.out.println("maze 3:");
        ArrayList<String> list = maze3("",3,3);//prints all the possible directional flow in an arraylist that is created within the function and not passed as an argument in the function,provided only down "D" and right "R" directional flow is permitted.
        System.out.println(list);
        System.out.println();


        System.out.println("maze 4:");
        maze4("",3,3);//prints the path flow with "R" or "D" being the permitted values.
        System.out.println();


        System.out.println("maze 5:");
        boolean[][] maze = {{true,true,true},{true,false,true},{true,true,true}};//prints the directional flow provided only two directions are allowed and there is a obstacle in one of the path.
        maze5("",maze,0,0);
        System.out.println();



        System.out.println("maze 6:");
        boolean[][] mazex = {{true,true,true},{true,true,true},{true,true,true}};//prints the path considering all the directions and uses the concept of backtracking.
        maze6("",mazex,0,0);
        System.out.println();



        System.out.println("maze 7:");
        int[][] path = new int[mazex.length][mazex[0].length];//prints the actual used path in an array format and also prints the direction used, backtracking is used here as well.
        maze7("",mazex,0,0,path,1);
    }


    static int maze1( int r , int c){
        if(r ==1 || c ==1)
            return 1;
        int left = maze1(r - 1,c);
        int right = maze1(r,c - 1);
        return left + right;
    }



    static void maze2(String p,int r, int c){
        if(c==1 && r == 1) {
            System.out.println(p);
            return;
        }
        if(r != 1)
            maze2(p+"V", r-1, c);
        if(c != 1)
            maze2(p+"H", r, c-1);
        if(c != 1 && r!=1)
            maze2(p+"D", r-1, c-1);
    }



    static ArrayList<String> maze3(String p,int r, int c){
        if(c==1 && r == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r != 1)
            list.addAll(maze3(p+"D", r-1, c));
        if(c != 1)
            list.addAll(maze3(p+"R", r, c-1));

        return list;
    }




    static void maze4(String p,int r, int c){
        if(c==1 && r == 1) {
            System.out.println(p);
            return;
        }
        if(r != 1)
            maze4(p+"D", r-1, c);
        if(c != 1)
            maze4(p+"R", r, c-1);
    }




    static void maze5(String p,boolean[][] maze,int r, int c){
        if(r==maze.length - 1 && c == maze[0].length -1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
            return;
        if(r < maze.length - 1)
            maze5(p+"D", maze, r+1, c);
        if(c < maze[0].length -1)
            maze5(p+"R",maze , r, c+1);

    }



    static void maze6(String p,boolean[][] mazex,int r, int c){
        if(r==mazex.length - 1  && c == mazex[0].length - 1 ) {
            System.out.println(p);
            return;
        }
        if(!mazex[r][c])
            return;//if the block is false then return
        mazex[r][c] = false;

        if(r < mazex.length - 1)
            maze6(p+'D', mazex, r+1, c);
        if(c < mazex[0].length -1)
            maze6(p+'R',mazex , r, c+1);
        if(c > 0 )
            maze6(p+'L',mazex , r, c-1);
         if(r > 0)
            maze6(p+'U',mazex , r-1, c);

        mazex[r][c] = true;//backtracking
    }




    static void maze7(String p,boolean[][] mazex,int r, int c, int[][] path, int step){
        if(r==mazex.length - 1  && c == mazex[0].length - 1 ) {
            path[r][c] = step;
            for(int[] arr : path)
                System.out.println(Arrays.toString(arr));
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!mazex[r][c])
            return;//if the block is false then return

        mazex[r][c] = false;
        path[r][c] = step;

        if(r < mazex.length - 1)
            maze7(p+'D', mazex, r+1, c,path,step+1);
        if(c < mazex[0].length -1)
            maze7(p+'R',mazex , r, c+1,path,step+1);
        if(c > 0 )
            maze7(p+'L',mazex , r, c-1,path,step+1);
        if(r > 0)
            maze7(p+'U',mazex , r-1, c,path,step+1);

        mazex[r][c] = true;//backtracking
        path[r][c] = 0;//backtracking

    }

}
