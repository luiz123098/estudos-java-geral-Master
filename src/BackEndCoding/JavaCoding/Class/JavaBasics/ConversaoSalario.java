package BackEndCoding.JavaCoding.Class.JavaBasics;
import java.util.Scanner;
public class ConversaoSalario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Insert your first payment: ");
        String primeiroSalario = ler.next().replace(",",".");

        System.out.print("\nInsert your second payment: ");
        String segundoSalario = ler.next().replace(",",".");

        System.out.print("\nInsert your third  payment: ");
        String terceiroSalario = ler.next().replace(",",".");

        double primeiroConvertido = Double.parseDouble((primeiroSalario));
        double segundoConvertido = Double.parseDouble((segundoSalario));
        double terceiroConvertido = Double.parseDouble((terceiroSalario));

        double media = (primeiroConvertido + segundoConvertido + terceiroConvertido) /3;

        System.out.print("The average is: "+media);
    }
}
