package BackTracking;

public class GridWays {

    static boolean isStepCorrect(int i, int j, int row, int col) {
        if (i <= (row - 1) && j <= (col - 1)) {
            return true;
        }
        return false;
    }

    static int findGridWays(int i, int j, int row, int col) {
        // base
        if (i == (row - 1) && j == (col - 1)) {
            return +1;
        }

        if (!isStepCorrect(i, j, row, col))
            return 0;

        int countRight = findGridWays(i, j + 1, row, col);
        int countDown = findGridWays(i + 1, j, row, col);
        return countRight + countDown;
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        // int grid[][] = new int[row][col];

        System.out.println(findGridWays(0, 0, row, col));
    }
}
