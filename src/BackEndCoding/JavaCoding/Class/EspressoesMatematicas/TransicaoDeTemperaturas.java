package BackEndCoding.JavaCoding.Class.EspressoesMatematicas;
import java.util.Scanner;

public class TransicaoDeTemperaturas {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
//VARIAVEIS
        double x, f = 0,c;
        String t;
//COLETANDO A TEMPERATURA
        System.out.println("Insert the temperature: ");
        x = ler.nextDouble();
//USUARIO ESCOLHENDO QUAL TEMPERATURA ELE QUER TRANSFORMAR
        System.out.println("Chose what do you want to transform " +
                "c = Celsius" +
                "f = Fahrenheit");
        t = ler.next();
//ESTRUTURA DE CONDIÇÃO PARA SE FOR CELSIUS OU FAHRENHEIT
        if(t.equals("c")) {
            c = (x - 32) / 1.8;
            System.out.println("The temperature in celsius equals: "+c);
        }
        if(t.equals("f")){
            f = x * 1.8 + 32;
            System.out.println("The temperature in fahrenheit equals: "+ f);
        }
            else
            System.out.println("Wrong temperature!");


    }
}
