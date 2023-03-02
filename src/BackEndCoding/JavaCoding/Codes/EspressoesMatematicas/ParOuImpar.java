package BackEndCoding.JavaCoding.Codes.EspressoesMatematicas;
import java.util.Scanner;
public class ParOuImpar {
    public void ImprimindoParImpar() {
        Scanner ler = new Scanner(System.in);
        int x;
        System.out.println("Insira um numero para saber se é par ou impar: ");
        x = ler.nextInt();
//SE O NUMERO FOR IGUAL AS 2 METADES DELE MESMO SOMADAS ELE É PAR, SE NÃO ELE É IMPAR
        if (x == x/2+x/2){
            System.out.println("Esse numero é par\n");
        }else
            System.out.println("Esse numero é impar\n");
    }
}
//if (n % 2 == 0) {
//                System.out.println(par);
//               }
//			else {
//                System.out.println(impar);
//              }
