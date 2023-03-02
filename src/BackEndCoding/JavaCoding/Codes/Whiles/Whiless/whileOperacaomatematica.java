package BackEndCoding.JavaCoding.Codes.Whiles.Whiless;
import java.util.Scanner;
public class whileOperacaomatematica {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        while (n != 1) {
            if ((n % 2) == 0) {
                n = n / 2;
                System.out.println(n);
            } else {
                n = n * 3 + 1;
                System.out.println(n);
            }
        }
        System.out.println(n);
    }
}