package BackEndCoding.JavaCoding.Codes.EspressoesMatematicas;

import java.text.DecimalFormat;
import java.util.Scanner;
public class ExercicioSalarioMinimo {
    public void Salariosminimos() {
            Scanner ler =   new Scanner(System.in);
        double salarioMinimo    =   780.00;
        double qntsSalarios;
        double  salarioFuncionario;

        System.out.println("insira seu salario");
        salarioFuncionario  = ler.nextDouble();
        qntsSalarios    = salarioFuncionario    /salarioMinimo;

        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.printf("Está recebendo "+df.format(qntsSalarios).replace(".",",")+" salarios minimos.\n");
    }
}
