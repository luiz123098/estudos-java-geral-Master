package BackEndCoding.JavaCoding.Codes.Whiles.Condicionais;
//import java.util.Scanner;
import javax.swing.JOptionPane;
public class AprendendoIf {
    public static void main(String[] args) {
//        Scanner ler = new Scanner(System.in);
        String idade;
//RECEBE IDADE
//        System.out.println("Insert you age: ");
//      idade = ler.nextInt();
//ESTRUTURA CONDICIONAL PARA SABER SE A PESSOA É OU NÃO MENOR DE IDADE
//        if(idade < 21) {
//            System.out.println("You can't drink, you not have 21 yet");
//        }else{
//                System.out.println("You can drink big boy, you are old boy, that got more than 21 years");
        idade = JOptionPane.showInputDialog(null, "Insert your age");
        String idade1 = idade;
        int numero = Integer.parseInt(idade1);

        if (numero <18) {
            JOptionPane.showMessageDialog(null, "Can't enter under 18 years!!");
        } else{
            JOptionPane.showMessageDialog(null,"You are able to enter!!");
        }
    }
}
//    }

