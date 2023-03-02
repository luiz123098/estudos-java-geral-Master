package BackEndCoding.JavaCoding.Codes.GetSet.Atividades;
import java.util.Scanner;
public class PessoaInformacao {
    public static void main(String[] args) {
        Scanner ler  = new Scanner(System.in);
        Pessoa p  = new Pessoa();

        System.out.println(
                           p.dizerIdade(22)+
                      "\n"+p.dizerNome("Luiz  valdeir de alencar neto")

                     +"\n"+p.dizerPesoAltura(64.7,1.85));
    }
}