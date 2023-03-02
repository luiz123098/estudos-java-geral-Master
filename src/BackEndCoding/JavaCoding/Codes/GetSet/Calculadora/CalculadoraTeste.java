package BackEndCoding.JavaCoding.Codes.GetSet.Calculadora;
import java.util.Scanner;
public class CalculadoraTeste {
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
        Operacao op =  new Operacao();

        int a,b;

        System.out.println("Enter the first number: ");
        a  = ler.nextInt();

        System.out.println("Enter the second number: ");
        b  = ler.nextInt();

        op.somar(a,b);

        System.out.println();





    }
}
