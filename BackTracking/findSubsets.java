package BackTracking;

public class findSubsets {

    // T.C. : O(n*2^n)
    // S.C. : O(n)

    public static void findSubset(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }

        // recursions 
        // YES choice
        findSubset(str, ans + str.charAt(i), i + 1);
        // NO choice
        findSubset(str, ans, i + 1); 
    }
    public static void main(String[] args) {
        String str = "a";
        findSubset(str, "", 0);
    }
}
