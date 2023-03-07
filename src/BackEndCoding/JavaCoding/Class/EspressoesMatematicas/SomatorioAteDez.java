package BackEndCoding.JavaCoding.Class.EspressoesMatematicas;

import java.util.Scanner;
public class SomatorioAteDez {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int x;
//SCANEANDO O NUMERO Q VAMOS ULTILIZAR NA MULTIPLICAÇÃO
        System.out.println("Input a number: ");
        x = ler.nextInt();
//ESTRUTURA DE REPETIÇÃO FOR PARA SO PARAR DE MUTIPLICAR QUANDO JA TIVER MULTIPLICADO 10 VEZES
        for (int a = 0; a <=10; a++){
            System.out.println(x * a);
        }
    }
}