public class AngkaMunculSekali {
    public static <string> void main(String[] args) {
        String nomor = "76523752";
        int i, j, count = 0;
        char a, b;
        String hasil = "";

        for (i = 0; i < nomor.length(); i++) {
            count = 0;
            a = nomor.charAt(i);
            for (j = 0; j < nomor.length(); j++) {
                b = nomor.charAt(j);
                if (a == b) {
                    count += 1;
                }
                if (count > 1) {
                    break;
                }
            }
            if(count == 1){
                hasil = hasil + a;
            }
        }
        System.out.println(hasil);

        String nomor2 = new String("1122");
        int k, l, counts = 0;
        char c;
        char d = 0;
        String hasil2 = "";

        for (k = 0; k < nomor2.length(); k++) {
            counts = 0;
            c = nomor2.charAt(k);
            for (l = 0; l < nomor2.length(); l++) {
                c = nomor2.charAt(l);
                if (c == d) {
                    counts += 1;
                }
                if (counts > 1) {
                    break;
                }
            }
            if(counts == 1){
                hasil2 = hasil2 + c;
            }
        }
        System.out.println("[] " + hasil2);
    }
}
