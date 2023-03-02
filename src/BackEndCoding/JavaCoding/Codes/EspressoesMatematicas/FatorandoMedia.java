package BackEndCoding.JavaCoding.Codes.EspressoesMatematicas;
import java.util.Scanner;
public class FatorandoMedia {
    public int a
              ,b;
    public void FatorarMedia() {
        Scanner s = new Scanner(System.in);
        System.out.print("Insira o primeiro numero do calculo: ");
        a = s.nextInt();
        System.out.print("Insira o segundo numero do calculo: ");
        b = s.nextInt();
        int media = (a + b)/2;
        System.out.println(media);
    }
}