package BackEndCoding.JavaCoding.Codes.JavaBasics;

import java.util.Scanner;
public class AntecesorSucessor {
    public static void main(String[] args) {
//COME�O DO PROGRAMA PARA DECIDIR SE O WHILE VAI PROSEGUIR OU N�O
        System.out.println("Voc� deseja continuar? 1-y 2-n");
//INSTANCIANDO O OBJETO SCANNER
        Scanner ler = new Scanner(System.in);
//ATRIBUINDO LER.NEXT() PRA VARIAVEL PARA PODER LER QUALQUER VALOR EM STRING Q FOR ATRIBUIDO
        String ans = ler.next();

//ESTRUTURA DE REPETI��O WHILE
        while (ans.equals( "y")) {
//DECLARANDO VARIAVEL
                int x, antecessor, sucessor;
//PEGANDO DADOS DO TECLADO
                System.out.println("Insira um numero: ");
                x = ler.nextInt();

//CALCULANDO O ANTECESSOR E O SUCESSOR DESTE NUMERO
                sucessor = x + 1;
                antecessor = x - 1;

//IMPRIMINDO NO TERMINAL O RESULTADO DOS CALCUOS
                System.out.println("O antecessor �: \n" + antecessor + "\n E o sucessor �: \n" + sucessor + "\n");
//CAI NO MESMO SOUT DO COME�O PARA A ESTRUTURA SE REPETIR
            System.out.println("Voc� deseja continuar? 1-y 2-n\n");
             ans = ler.next();
        }
//SE ATRIBUIR QUALQUER VALOR QUE N�O SEJA PARA CONTINUAR O WHILE ELE CAI NESSE SOUT
        System.out.println("Ate mais!");
    }
}