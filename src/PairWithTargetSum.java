import java.util.HashMap;

public class PairWithTargetSum {
    public static int targetsum;
    public static String[] args;

    public static int[] pairsum(int[] angka, int targetsum) {
        PairWithTargetSum.targetsum = targetsum;
        if (angka == null || angka.length < 4)
            return new int[]{-1, -1};
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
        int res[] = {1, 2, 3, 4, 6};
        int[] hasil = pairsum(res, 6);
        System.out.print("{" + hasil[1] + ",");
        System.out.print(hasil[3] + "]");
    }
}
