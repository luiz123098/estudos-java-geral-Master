















package BackEndCoding.JavaCoding.Class.Whiles.Desafios;
import   java.util.Scanner;
public class DesafioWhile {
    public static void main(String[] args) {
        Scanner  ler =  new Scanner(System.in);
        int quantidadeNotas = 0;
        double nota  =0, total = 0;

//ESSE  LOOP PARA INSERIR NOTAS E CALCULAR QUANTAS NOTAS VALIDAS FORAM LANCADAS
        while  (nota != -1){
            System.out.print("Enter the grade ( or -1 to leave): ");
        nota =  ler.nextInt();
//SOMENTE SE A NOTA FOR ENTRE 10 E 0 IRA  CALCULAR ADICIONAR NO TOTAL
        if (nota<=10 && nota >=0 ) {
            total += nota;
            quantidadeNotas++;
//SE A NOTA NAO FOR ENTRE 0 E 10 IRA IMPRIMIR PEDINDO PARA INSERIR UMA NOTA VALIDA
        }else if(nota != -1) {
            System.out.println("Enter a valid grade");
        }
    }
//Calculando a media
        double media  =  total /quantidadeNotas;
        System.out.println("this is your final grade: "+media);
    }
}