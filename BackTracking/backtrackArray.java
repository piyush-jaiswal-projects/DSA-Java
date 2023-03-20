package BackTracking;

public class backtrackArray {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void backTrackArray(int[] arr, int n, int index) {
        // base case
        if (n <= 0)
            return;

        arr[index] = index + 1;
        backTrackArray(arr, n - 1, index + 1); // recursion step
        arr[index] = arr[index] - 2; //backtracking step
    }
    
    public static void main(String[] args) {
        int arr[] = new int[5];
        backTrackArray(arr, 5, 0);
        printArray(arr);
    }
    
}
