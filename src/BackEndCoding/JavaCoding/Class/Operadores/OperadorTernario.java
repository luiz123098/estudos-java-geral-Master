package BackEndCoding.JavaCoding.Class.Operadores;
import java.util.Scanner;
public class OperadorTernario {
    public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
            double media;
        System.out.print("Insert your fina grade: ");
        media = ler.nextDouble();

        String resultadoRecuperacao = media >= 4.0 ? "Recuperação" : "Reprovado";
        String resultado = media >= 6.5 ? "Aprovado" : resultadoRecuperacao;

        System.out.println(resultado);
    }
}