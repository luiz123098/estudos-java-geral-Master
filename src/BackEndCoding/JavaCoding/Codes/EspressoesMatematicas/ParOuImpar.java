package BackEndCoding.JavaCoding.Codes.EspressoesMatematicas;
import java.util.Scanner;
public class ParOuImpar {
    public void ImprimindoParImpar() {
        Scanner ler = new Scanner(System.in);
        int x;
        System.out.println("Insira um numero para saber se � par ou impar: ");
        x = ler.nextInt();
//SE O NUMERO FOR IGUAL AS 2 METADES DELE MESMO SOMADAS ELE � PAR, SE N�O ELE � IMPAR
        if (x == x/2+x/2){
            System.out.println("Esse numero � par\n");
        }else
            System.out.println("Esse numero � impar\n");
    }
}
//if (n % 2 == 0) {
//                System.out.println(par);
//               }
//			else {
//                System.out.println(impar);
//              }
