package BackEndCoding.JavaCoding.Class.Operadores;
import java.util.Scanner;
public class OperacaoMatematica {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

        System.out.print("Insira o primeiro numero: ");
        float n1 = ler.nextInt();

        System.out.print("Insira o segundo numero: ");
        float n2 = ler.nextInt();

        System.out.print("Insira a operação que deseja fazer: ");
        String operacao = ler.next();

        float total = "+".equals(operacao)? n1 + n2 : 0;
        total = "-".equals(operacao)? n1 - n2 : total;
        total = "*".equals(operacao)? n1 * n2 : total;
        total = "/".equals(operacao)? n1 / n2 : total;
        total = "%".equals(operacao)? n1 % n2 : total;
        System.out.printf( "%.0f %s %.0f = %.0f",n1 , operacao , n2,total);

    }
}
