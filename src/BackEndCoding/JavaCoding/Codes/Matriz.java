package BackEndCoding.JavaCoding.Codes;

import java.util.Scanner;
public class Matriz {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("Quantos alunos: ");
        int qntdAlunos = s.nextInt();

        System.out.println("Quantas notas por aluo: ");
        int qntdNotas = s.nextInt();

        double[][] notasDaTurma = new double[qntdAlunos][qntdNotas];
        double total = 0;
        for(int a = 0; a < notasDaTurma.length; a++){
            for(int n = 0; n < notasDaTurma[a].length; n++){
                System.out.printf("Informe a nota %d, do aluno %d ",(n+1),(a+1));
                notasDaTurma[a][n] = s.nextInt();

                total += notasDaTurma[a][n];
            }
        }
        double media = total /(qntdNotas * qntdAlunos);
        System.out.printf("A media da classe é: %.2f",media);
    }
}