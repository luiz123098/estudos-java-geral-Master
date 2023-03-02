package BackEndCoding.JavaCoding.Codes.Intermediario;
import java.util.Scanner;
public class TresNumerosBoolean {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Boolean verificacao;
        System.out.println("Insert first number: ");
        int n1 = ler.nextInt();

        System.out.println("Insert second number: ");
        int n2 = ler.nextInt();

        System.out.println("Insert second number: ");
        int n3 = ler.nextInt();

        if(n1 + n2 == n3)
            verificacao = Boolean.TRUE;
        else
            verificacao = Boolean.FALSE;

        if (verificacao.equals(Boolean.TRUE))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}