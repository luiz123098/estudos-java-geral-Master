package BackEndCoding.JavaCoding.Codes.Operadores.LogicaComBooleanos;
import java.util.Scanner;
public class DesafioLogico {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Trabalho terça (v ou f)
        //Trabalho na quinte (v ou f)
        //Se os 2 derem certo comprarei uma tv de 50 polegadas
        //Se um der certos comprarei uma tv de 32 polegadas
        //Se comprar a tv de 50 ou a de 32 a familia irá tomar sorvete juntos
        //Se nenhum trabalho der certo não acontecerá nada
        //Negação do servete como ficou com fome ou ficou saldável
        boolean trabalho1 = false;
        boolean trabalho2= false;
        int x = 0;
        
        while (x == 0 || x == 1 || x==2 || x ==3 ){
            System.out.println("Qual trabalho deu certo?\n0, 1, 2 ou 3");
            x = ler.nextInt();
//SETANDO OS VALORES BOOLEANOS PARA CADA SITUAÇÃO
        if (x == 0){
            trabalho1 = false;
            trabalho2 = false;
        }
        if (x == 1){
            trabalho1 = true;
            trabalho2 = false;
        }
        if (x == 2){
            trabalho1 = false;
            trabalho2 = true;
        }
        if (x == 3) {
            trabalho1 = true;
            trabalho2 = true;
        }
        
        System.out.println(trabalho1+"  "+trabalho2);
//SO TEM UMA HIPOTESE DE NÃO ACONTECER NADA
        if (trabalho2 == false && trabalho1 == false){
            System.out.println("Não fomos tomar sorvete e nem comparmos nenhuma TV ;-;");
        }
//ESTRUTURA WHILE PARA RESOLVER O PROBLEMA DE COMPRAR TV QUAL TV E SE FORAM TOMAR SORVETE
        while (trabalho2 == true || trabalho1 == true){
            System.out.print("Tomamos sorvete, e compramos uma TV de");
            if(trabalho2 == true && trabalho1 == true){
                System.out.print(" 50 polegadas");
            } else if (trabalho1 == true || trabalho2 == true) {
                System.out.println(" 32 polegadas");
            }
            break;
        }
        }
    }
}