package BackEndCoding.JavaCoding.Codes.Operadores.LogicaComBooleanos;
import java.util.Scanner;
public class Logicas {
    public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
        boolean t = true;
        boolean f = false;
        System.out.println("==========================");
//TABELA VERDADE CONDIÇÕES E, AND
        System.out.println("Condição: E AND \n");
                System.out.println(t && t);
                System.out.println(t && f);
                System.out.println(f && t);
                System.out.println(f && f);
        System.out.println("==========================");
//TABELA VERDADE CONDIÇÕES OU, OR
        System.out.println("Condição: OU OR \n");
                System.out.println(t || t);
                System.out.println(t || f);
                System.out.println(f || t);
                System.out.println(f || f);
        System.out.println("==========================");
//TABELA VERDADE CONDIÇÃO XOR (Ou exclusivo)
        System.out.println("Condição: XOR ^\n");
                System.out.println(t ^ t);
                System.out.println(t ^ f);
                System.out.println(f ^ t);
                System.out.println(f ^ f);
        System.out.println("==========================");
//CONDIÇÕES DE NEGAÇÃO OU INVERSO NÃO, NOT !
        System.out.println("Condição: NÃO NOT ! ");
                System.out.println("\nNão verdadeiro: " + !t);
                System.out.println("Não falso: " + !f);
        System.out.println("==========================");
    }
}