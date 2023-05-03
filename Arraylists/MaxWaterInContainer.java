import java.util.ArrayList;

public class MaxWaterInContainer {
    public static int maxWater(ArrayList<Integer> heights) {
        int maxWater = 0;

        for (int i = 0; i < heights.size(); i++) {
            for (int j = i + 1; j < heights.size(); j++) {
                int width = j - i;
                int height = Math.min(heights.get(i), heights.get(j));
                int currWater = height * width;
                maxWater = Math.max(maxWater, currWater);
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
