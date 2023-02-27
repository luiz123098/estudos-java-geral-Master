package BackEndCoding.JavaCoding.EspressoesMatematicas;
import java.util.Scanner;
public class MediaAritimetica {
    public void CalculoDeMediasEscolares() {
    Scanner s = new Scanner(System.in);
//DECLARANDO ARRAYS DAS ETAPAS COMO 2 PARA CALCULAR APENAS 2 NOTAS EM CADA ETAPA
        double[] first_step = new double[2];
        double[] second_step = new double[2];
//RECEBENDO OS VALORES DAS ARRAYS 
        System.out.print("Insira a primeira nota da primeira etapa: ");
            first_step[0] = s.nextDouble();
        System.out.print("Insira a segunda nota da primeira etapa: ");
            first_step[1] = s.nextDouble();
        System.out.print("\nInsira a primeira nota da segunda etapa: ");
            second_step[0] = s.nextDouble();
        System.out.print("Insira a segunda nota da segunda etapa: ");
            second_step[1] = s.nextDouble();
//SETANDO ASLGUMAS VARIAVEIS PARACALCULAR O VALOR DAS MEDIAS
        double add_steps = 0;
        double first_step_average = 0;
        double second_step_average = 0;
        double scool_average = 0;
//LAÇO FOR DE REPETIÇÃO PARA IR SOMANDO DE ACORDO COM O 'Y' E SEU VALOR
        for (int y = 0; y <2; y++){first_step_average += first_step[y]; second_step_average += second_step[y];}
        first_step_average = first_step_average / 2;
        second_step_average = second_step_average / 2;
        add_steps = first_step_average + second_step_average;
        scool_average = add_steps / 2;
//RETORNANDO PARA O USUARIO SUAS MÉDIAS ESCOLARES
        System.out.println("\nSua media na primeira etapa é: "+first_step_average);
        System.out.println("Sua media na segunda etapa é: "+second_step_average);
        System.out.println("Sua média escolar é: "+scool_average+"\n");
    }
}