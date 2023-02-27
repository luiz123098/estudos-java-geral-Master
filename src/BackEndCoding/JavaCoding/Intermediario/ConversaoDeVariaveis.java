package BackEndCoding.JavaCoding.Intermediario;
import java.util.Scanner;
public class ConversaoDeVariaveis {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

        String s = null;

        System.out.println("Insert a number: ");
        s = ler.next();

        String s2 = s + s;
        int i = Integer.parseInt(s);
        int i2 = i + i;

        System.out.println("The number sum by himself in string is: "+s2);
        System.out.println("The number sum by himself in string is: "+i2);
    }
}
