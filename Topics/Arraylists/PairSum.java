import java.util.ArrayList;

public class PairSum {

    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int rp = list.size() - 1, lp = 0;

        while (lp < rp) {
            int sum = list.get(rp) + list.get(lp);

        if (sum == target)
            return true;
        
        if (sum > target) {
            rp--;
        }
        else {
            lp++;
        }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //[1,2,3,4,5,6]
        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }
        int target = 50;

        System.out.println(pairSum(list, target));
    }
}