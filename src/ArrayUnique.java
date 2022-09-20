import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayUnique {
    public static void main(String[] args) {
        Set<Integer> angka = new HashSet<>();
        angka.add(1);
        angka.add(2);
        angka.add(3);
        angka.add(4);
        angka.add(5);

        angka.add(1);
        angka.add(3);
        angka.add(5);
        angka.add(10);
        angka.add(16);
        System.out.println(angka);

        Set<Integer> angka2 = new HashSet<>();
        angka2.add(3);
        angka2.add(8);

        angka2.add(2);
        angka2.add(8);
        System.out.println(angka2);
    }
}

