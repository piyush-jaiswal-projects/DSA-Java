package DivideNConquer;

public class SortStringArray {

    public static void print(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void MergeString(String arr[], int si, int mid, int ei) {
        String temp[] = new String[arr.length];
        int t = 0;
        int j = si; //left
        int k = mid + 1; //right

        for (int i = 0; i < arr.length; i++) {
            // function to compare two strings
        }
    }

    public static void sortStringArray(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        sortStringArray(arr, si, mid);
        sortStringArray(arr, mid + 1, ei);

        MergeString(arr, si, mid, ei);
    }
    
    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        sortStringArray(arr, 0, arr.length-1);
        print(arr);
    }
}
