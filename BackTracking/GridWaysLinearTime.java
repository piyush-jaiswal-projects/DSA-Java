package BackTracking;

public class GridWaysLinearTime {
    static int factorial(int num) {
        int factNum = 1;
        for (int i = num; i >= 1; i--) {
            factNum = factNum * i;
        }
        return factNum;
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int ans = factorial(row + col - 2) / (factorial(row - 1) * factorial(col - 1));
        System.out.println("Total Ways: " + ans);
    }
}
