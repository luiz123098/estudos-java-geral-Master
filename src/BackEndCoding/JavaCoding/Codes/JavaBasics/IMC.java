package BackEndCoding.JavaCoding.Codes.JavaBasics;
import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        double peso = ler.nextDouble();
        System.out.print("Enter your height: ");
        double altura = ler.nextDouble();

        double alturaAoQuadrado = Math.pow(altura,2);
        double imc = peso / alturaAoQuadrado;

        System.out.print("Seu imc é de: ");
        System.out.print(imc);
    }
}
