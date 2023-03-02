package BackEndCoding.JavaCoding.Codes.EspressoesMatematicas;
import java.util.Arrays;
import java.util.Scanner;
public class MediaEscolar {
    public void MediaEscolarEscolhida() {
        Scanner s = new Scanner (System.in);

        System.out.print("\nQuantos alunos: ");
        int qntdAlunos = s.nextInt();
        System.out.print("Quantas notas por aluno: ");
        int qntdNotas = s.nextInt();
        System.out.println("\n");

        double[][] notasDaTurma = new double[qntdAlunos][qntdNotas];
        double total = 0;
        for(int a = 0; a < notasDaTurma.length; a++){
            for(int n = 0; n < notasDaTurma[a].length; n++){
                System.out.printf("Informe a nota %d, do aluno %d ",(n+1),(a+1));
                notasDaTurma[a][n] = s.nextInt();

                total += notasDaTurma[a][n];
            }
        }
        System.out.println("\n===========================");
        double media = total /(qntdNotas * qntdAlunos);
        System.out.printf("A media da classe é: %.2f",media);
        System.out.println("\n===========================\n");

        for(double[] notasDosAlunos : notasDaTurma){
            System.out.println(Arrays.toString(notasDosAlunos));
        }
        System.out.println("\n");

    }
}