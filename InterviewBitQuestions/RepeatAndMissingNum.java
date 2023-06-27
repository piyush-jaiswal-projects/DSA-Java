package InterviewBitQuestions;

public class RepeatAndMissingNum {
    // https://www.interviewbit.com/problems/repeat-and-missing-number-array/

    public int[] repeatedNumber(final int[] A) {
        int[] tracker = new int[A.length];
        for(int i =0; i<tracker.length; i++){
            tracker[i] = 0;
        }
        
        for(int i =0; i<A.length; i++){
            tracker[A[i]-1] = tracker[A[i]-1] + 1;
        }
        
        int[] ans = new int[2];
        ans[1] = search(0, tracker);
        ans[0] = search(2, tracker);
        
        return ans;
    }
    
    public int search(int val, int[] arr){
        for(int i =0; i<arr.length; i++){
            if(arr[i] == val){
                return i+1;
            }
        }
        return -1;
    }
}
