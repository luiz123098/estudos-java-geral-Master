package BackEndCoding.JavaCoding.Class.EspressoesMatematicas;
public class ExercicioSaldo {
    public static void main(String[] args) {
//INSTANCIANDO VARIAVEIS
        double  saldo = 5600.00;
        double  reajuste;
        double  reajusteadc;
//CALCULANDO O REAJUSTE O SALDO
        reajuste    =(1*100)/saldo;
        reajusteadc =   saldo+reajuste;
//IMPRIMINDO O REAJUSTE NO PROMPT
        System.out.println("O saldo é de: "+saldo);
        System.out.println("O reajuste e de: "+reajuste);
        System.out.println("O saldo com o reajuste e de: "+reajusteadc);
    }
}