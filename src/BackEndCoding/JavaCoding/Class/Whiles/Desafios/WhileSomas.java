























package BackEndCoding.JavaCoding.Class.Whiles.Desafios;
import java.util.Scanner;
public class WhileSomas {

    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
//DECLARANDO VARIAVEIS
        int  x = 0, y = 0;
//ENQUANTO X +  Y NAO FOR 10 O SISTEMA CONTINUARÁ RODANDO ATE Q A SOMA SEJA 10
        while (x  + y !=10){
            System.out.print("x + y =     //x  = ");
            x = ler.nextInt();
            System.out.print(x+" + y =     //y  = ");
            y = ler.nextInt();

            System.out.println(x+y+ "\n\n");
        }
//Se x+y DER 10 O SISTEMA PARA E MOSTRA ESTE SOUT
        System.out.println("x + y =10");


    }
}
