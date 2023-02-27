package BackEndCoding.JavaCoding.EspressoesMatematicas;

import java.util.Scanner;
public class Operacoes {
    public void OperacoesDeValores(){
        Scanner ler = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Insira um valor para b em a ? b: ");
         a = ler.nextInt();
        System.out.println("Insira um valor para a em a ? b: ");
         b = ler.nextInt();

        int aMultiplica =   a   *   b;
        int aDiminui =   a   -   b;
        int aDivide =   a   /   b;
        int aSoma =   a   +   b;
        int aResto = a % b;
        System.out.println("Multiplica: "+aMultiplica);
        System.out.println("Subtração: "+aDiminui);
        System.out.println("Divide: "+aDivide);
        System.out.println("Somatorio: "+aSoma);
        System.out.println("Resto: "+aResto);

    }
}