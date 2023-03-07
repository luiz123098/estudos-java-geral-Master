

















package BackEndCoding.JavaCoding.Class.Whiles.Desafios;
import java.util.Scanner;
public class WhileExercicio1 {
    public static void main(String[] args) {
        Scanner ler  = new Scanner(System.in);

        String x =null;
        System.out.println("Enter something: ");
        x = ler.nextLine();

        while (!x.equals("sair")){
            System.out.println("Enter something");
            x = ler.nextLine();

        }

    }
}
