import java.util.ArrayList;

public class PairSumAdvance {

    public static boolean pairSumAdvance(ArrayList<Integer> list, int target) {
        int rp = 0, lp = 0;
        int n = list.size();

        //finding pivot point
        for (int i = 1; i < n; i++) {
            if (list.get(i) < list.get(i - 1)) {
                lp = i;
                rp = i - 1;
                break;
            }
        }
        while (lp!=rp) {
            int sum = list.get(rp) + list.get(lp);
            if(sum == target)
                return true;

            if (sum > target) {
                rp = (n+rp-1) % n;
            }
            else {
                lp = (lp + 1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //[11,15,6,8,9,10]
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 100;

        System.out.println(pairSumAdvance(list, target));
    }
}
