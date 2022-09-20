import java.util.HashMap;

public class PairWithTargetSum2 {

    static int getPairsCount(int[] arr, int n, int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int nilai2=0;
        for (int i=0; i<n; i++)
        {
            if (map.containsKey(target - arr[i]))
            {
                nilai2 += map.get(target - arr[i]);
                for (int j=1; j<=map.get(target - arr[i]); j++)
                    System.out.print("(" + (target-arr[i]) + "," + arr[i] + ") ");
            }
            map.put(arr[i] , map.getOrDefault(arr[i],0)+1);
        }
        return nilai2;
    }
    public static void main (String [] args)
    {
        int[] input = {2, 5, 9, 11};
        int target = 11;
        System.out.println(getPairsCount(input , input.length , target));
    }
}

