package BackEndCoding.JavaCoding.Class.Operadores.LogicaComBooleanos;
import java.util.Scanner;
public class DescontoNaEscolaOPTernario {
    public static void main(String []args){
        Scanner reed = new Scanner(System.in);

        System.out.print("which the class of the student: ");
        String classe = reed.next();
        System.out.print("Insert the student name: ");
        String aluno = reed.next();
        System.out.print("Insert the student grade: ");
        double nota = reed.nextDouble();
        System.out.print("The student have done jokes in the class? y/n: ");
        boolean comportamento = reed.next().isEmpty();

        boolean bomComportamento = comportamento;
        boolean passouPorMedia = nota >= 7;
        String aprovacao = passouPorMedia ? "Approved!": "Reproved";
        System.out.println("The student: "+aluno+", from the class "+classe+" is "+aprovacao+" by grades");
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "No" : "Yes";

        System.out.println("Have discount?: "+resultado);
    }

}
