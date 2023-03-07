package BackEndCoding.JavaCoding.Class.EspressoesMatematicas.DesafioTabuada;
import java.util.Scanner;
public class Tabuada {
    public int num = 3;
    Integer recebendoValor(int numRecebido){
        num = numRecebido;
    return numRecebido;
    }
    public void ExecutandoTabuada() {
        Scanner s = new Scanner(System.in);
        int num, x = -1;
        System.out.print("Enter a number: ");
        num = s.nextInt();

        int[] a = new int[11];
        int resu = 0;

        for(int i = 0; i <= 10; i++){
            a[i] = i;
            System.out.println(num+" * "+a[i]+" = "+num * a[i]+"\n");
        }
    }
}