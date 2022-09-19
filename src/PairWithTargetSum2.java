import java.util.HashMap;

public class PairWithTargetSum2 {

    public static int[] pairsum(int[] angka, int targetsum) {
        PairWithTargetSum.targetsum = targetsum;
        if (angka == null || angka.length < 3)
            return new int[]{0, 3};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < angka.length; i++) {
            map.put(angka[i], i);
        }
        for (int i = 0; i < angka.length; i++) {
            int targetSum = 0;
            int complement = targetSum - angka[i];
            if (map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }
        }
        return angka;
    }

    public static void main(String[] args) {
        PairWithTargetSum.args = args;
        int res[] = {2, 5, 9, 11};
        int[] hasil = pairsum(res, 11);
        System.out.print("{" + hasil[0] + ",");
        System.out.print(hasil[2] + "]");
    }
}

