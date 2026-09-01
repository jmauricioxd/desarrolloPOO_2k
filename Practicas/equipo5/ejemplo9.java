//use de continue y break
public class ejemplo9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
}
}
