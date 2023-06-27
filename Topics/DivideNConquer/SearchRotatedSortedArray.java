package DivideNConquer;

public class SearchRotatedSortedArray {

    public static int searchItem(int arr[], int target, int si, int ei) {
        
        if (si > ei) {
            return -1;
        }

        // mid 
        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        
        // case 1 : mid on L1(when mid is less than starting element)
        if (arr[si] <= arr[mid]) {
            // case a : left of mid
            if (arr[si] <= target && target <= arr[mid]) {
                return searchItem(arr, target, si, mid - 1);
            }
            // case b :  right of mid
            else {
                return searchItem(arr, target, mid + 1, ei);
            }
        }
        
        
        // case 2 : mid on L2
        else {
            // case c : right of mid
            if (arr[mid] <= target && target <= arr[ei]) {
                return searchItem(arr, target, mid + 1, ei);
            }
            // case d : left of mid
            else{
                return searchItem(arr, target, si, mid - 1);
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(searchItem(arr, target, 0, arr.length-1));
    }
}
