import java.util.ArrayList;

// T.C. O(n)

public class TwoPointerApproach {

    public static int maxWater(ArrayList<Integer> heights) {
        int maxWater = 0;
        int lp = 0, rp = heights.size() - 1;

        while (lp < rp) {
            int ht = Math.min(heights.get(lp), heights.get(rp));
            int wt = rp - lp;
            int currWater = ht * wt;
            maxWater = Math.max(maxWater, currWater);

            if (lp < rp) {
                lp++;
            }
            else {
                rp--;
            }
        }
        
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> heights = new ArrayList<>();
        //[1,8,6,2,5,4,8,3,7]
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);

        System.out.println(maxWater(heights));
    }
}

