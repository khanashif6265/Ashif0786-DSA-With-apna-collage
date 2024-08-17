public class backtrackingsolution {
    //question1 Algorithm
    public static void printSolution(int sol[][]){
        for(int i=0; i<sol.length;i++){
            for(int j = 0;j<sol.length;j++){
                System.out.print(" " + sol[i][j]+" ");
                
            }
            System.out.println();

        }
    }
    public static boolean issafe(int maze[][], int x, int y){
        return (x>= 0 && x < maze.length
        && y>= 0 && y< maze.length && maze[x][y]==1);

    }
    
    
}
