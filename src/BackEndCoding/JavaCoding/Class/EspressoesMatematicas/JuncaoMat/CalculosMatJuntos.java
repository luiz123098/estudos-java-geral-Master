package BackEndCoding.JavaCoding.Class.EspressoesMatematicas.JuncaoMat;
import BackEndCoding.JavaCoding.Class.EspressoesMatematicas.DesafioTabuada.Tabuada;
import BackEndCoding.JavaCoding.Class.EspressoesMatematicas.*;
import java.util.Scanner;
public class CalculosMatJuntos {
    public void ChamaTabuada() {Tabuada tab = new Tabuada();  tab.ExecutandoTabuada();}
    public void ChamaMedia(){MediaEscolar colegioMedia = new MediaEscolar();  colegioMedia.MediaEscolarEscolhida();}
    public void ChamaSalariomin() {ExercicioSalarioMinimo salmin = new ExercicioSalarioMinimo();  salmin.Salariosminimos();}
    public void ChamaOperacoes() {Operacoes operacoes = new Operacoes();  operacoes.OperacoesDeValores();}
    public void ChamaParImpar() {ParOuImpar parimpar = new ParOuImpar();  parimpar.ImprimindoParImpar();}
    public void ChamaFatorandoMedia() {FatorandoMedia media2num = new FatorandoMedia();  media2num.FatorarMedia();}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String programa = "";

        while (!programa.equals("sair")){
            CalculosMatJuntos calc = new CalculosMatJuntos();
                System.out.println("qual programa deseja usar?\n(tabuada/salario/operacoes/escola/par impar/media) :\nOu digite sair para sair");
                    programa = s.nextLine();

                switch (programa) {
                    case "tabuada":
                        calc.ChamaTabuada();

                        break;
                    case "salario":
                        calc.ChamaSalariomin();

                        break;
                    case "operacoes":
                        calc.ChamaOperacoes();

                        break;
                    case "escola":
                        calc.ChamaMedia();

                        break;
                    case "par impar":
                        calc.ChamaParImpar();

                        break;
                    case "media":
                        calc.ChamaFatorandoMedia();
                }
                if (programa.equals("sair")){
                    System.out.println("Até a proxima");
                }
        }
    }
}