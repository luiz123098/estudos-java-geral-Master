package BackEndCoding.JavaCoding.Class.Array;
import java.util.Scanner;
import java.util.*;
public class DesafioArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("\nQuantas notas você quer calcular: ");
        int quantidadeNotasArray = s.nextInt();
        int[] nota = new int[quantidadeNotasArray];

        for(int i = 0; i < nota.length; i++) {
            System.out.print("\nDigite a nota "+(i+1)+" : ");
            nota[i] = s.nextInt();
        }
        System.out.print(Arrays.toString(nota));

        int total = 0;
        for (int notas : nota){
            total += notas;
        }
        int media = total / nota.length;

        System.out.println("\nSua média é de: "+ media+"\n");
    }
}