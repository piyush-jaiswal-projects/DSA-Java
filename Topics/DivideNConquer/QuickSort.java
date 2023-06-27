package DivideNConquer;

public class QuickSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j <= ei-1; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        // swap for correct pivot pos
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    // Pivot and Partition Approach
    public static void quickSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        // Partition
        int pIdx = partition(arr, si, ei);
        // Recursive Calls
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 9, 4, 7, 2 };
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
