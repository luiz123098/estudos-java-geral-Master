package BackEndCoding.JavaCoding.Codes.Array;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayEstudosMediaEscolar {
    void Aray() {
        Scanner s = new Scanner(System.in);
        int[] a = new int[6];
        a[0] = 5; a[1] = 4; a[2] = 3; a[3] = 2; a[4] = 1; a[5] = 0;
        int num = 0;
       // while (num <= 6 && num >= 0) {
         //   System.out.print(" ");
           // num = s.nextInt();
            //System.out.println(a[num -1]);
            System.out.println(Arrays.toString(a));
        //}
    }
    public static void main(String[] args) {
        double[] primeira_etapa = new double[2];
        double[] segunda_etapa = new double[2];

        primeira_etapa[0] = 8.4; primeira_etapa[1] = 5;
        segunda_etapa[0] = 10; segunda_etapa[1] = 4;

        double total_primeira_etapa = 0;
        double total_segunda_etapa = 0;
        double somatot = 0;
        double media_escolar = 0;

        for(int i = 0; i < primeira_etapa.length; i ++){
            total_primeira_etapa += primeira_etapa[i];
            total_segunda_etapa += segunda_etapa[i];
        }
        total_primeira_etapa = total_primeira_etapa / 2;
        total_segunda_etapa = total_segunda_etapa / 2;
        somatot = total_primeira_etapa + total_segunda_etapa;
        media_escolar = somatot / 2;
        System.out.println(total_primeira_etapa);
        System.out.println(total_segunda_etapa);
        System.out.println(media_escolar);
    }
}