import java.util.*;

public class ArrayMerge {
    public static void main(String[] args) {
        Set<String> siswa = new LinkedHashSet<>();
        siswa.add("kajuya");
        siswa.add("jin");
        siswa.add("lee");

        siswa.add("kajuya");
        siswa.add("feng");
        System.out.println(siswa);

        Set<String> siswa2 = new LinkedHashSet<>();
        siswa2.add("lee");
        siswa2.add("jin");
        siswa2.add("kajuya");
        siswa2.add("panda");
        System.out.println(siswa2);
    }

}