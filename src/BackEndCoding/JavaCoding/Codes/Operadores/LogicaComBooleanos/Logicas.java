package BackEndCoding.JavaCoding.Codes.Operadores.LogicaComBooleanos;
import java.util.Scanner;
public class Logicas {
    public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
        boolean t = true;
        boolean f = false;
        System.out.println("==========================");
//TABELA VERDADE CONDI��ES E, AND
        System.out.println("Condi��o: E AND \n");
                System.out.println(t && t);
                System.out.println(t && f);
                System.out.println(f && t);
                System.out.println(f && f);
        System.out.println("==========================");
//TABELA VERDADE CONDI��ES OU, OR
        System.out.println("Condi��o: OU OR \n");
                System.out.println(t || t);
                System.out.println(t || f);
                System.out.println(f || t);
                System.out.println(f || f);
        System.out.println("==========================");
//TABELA VERDADE CONDI��O XOR (Ou exclusivo)
        System.out.println("Condi��o: XOR ^\n");
                System.out.println(t ^ t);
                System.out.println(t ^ f);
                System.out.println(f ^ t);
                System.out.println(f ^ f);
        System.out.println("==========================");
//CONDI��ES DE NEGA��O OU INVERSO N�O, NOT !
        System.out.println("Condi��o: N�O NOT ! ");
                System.out.println("\nN�o verdadeiro: " + !t);
                System.out.println("N�o falso: " + !f);
        System.out.println("==========================");
    }
}