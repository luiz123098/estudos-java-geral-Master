package BackEndCoding.JavaCoding.Intermediario;
import java.util.Scanner;
public class InvertendoOrdenString {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

        System.out.print("Input a string: ");
        char[] letters = ler.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");
    }
    }

