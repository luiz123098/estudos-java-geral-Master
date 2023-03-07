package BackEndCoding.JavaCoding.Class.Operadores;
import java.util.Scanner;
public class QuadradoCubo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Enter a number");
        double n1 = ler.nextInt();

        double quadrado = Math.pow(n1,2);
        double cubo = Math.pow(n1,3);
        System.out.println("O quadrado "+quadrado);
        System.out.println("O cubo "+cubo);
    }
}