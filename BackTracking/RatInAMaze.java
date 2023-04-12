package BackTracking;


public class RatInAMaze {

    public static void printMaze(int maze[][]) {
        System.out.println("-------MAZE SOLUTION-------");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int maze[][], int row, int col) {
        int N = maze.length;
        //up || down || right || left
        if (row < 0 || row > N - 1 || col > N - 1 || col < 0) {
            return false;
        }
        
        //checking block position
        if (maze[row][col] == 0) {
            return false;
        }
        
        return true;
    }
    
    public static void mazeSolver(int maze[][], int output[][], int row, int col) {
        //base
        int N = maze.length;
        if (row > N - 1 && col > N - 1) {
            return;
        }

        //recursion
        if (isSafe(maze, row, col)) {
            output[row][col] = 1;
            mazeSolver(maze, output, row, col + 1); //right
            mazeSolver(maze, output, row + 1, col); //down
        }

    }
    public static void main(String[] args) {
        int maze[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };
          
        int output[][] = {
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 }
    };

        mazeSolver(maze, output, 0, 0);
        printMaze(output);
    }
    
}
