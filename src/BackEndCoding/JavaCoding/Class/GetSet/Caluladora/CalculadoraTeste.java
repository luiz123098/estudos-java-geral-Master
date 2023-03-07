package BackEndCoding.JavaCoding.Class.GetSet.Caluladora;
import java.util.Scanner;
public class CalculadoraTeste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        String confirmacao = null,sinalRecebido;

        System.out.print("Do you want continue? y/n ");
        confirmacao = ler.next();

        if(confirmacao.equals("y")) {
            do {

                System.out.print("Enter a first for A: ");
                calc.a = ler.nextDouble();

                System.out.print("Enter a second for B: ");
                calc.b = ler.nextDouble();

                String sinal= null;
                String resultado;
                System.out.print("What operation do you want to  do: ");
                sinal = ler.next();
                switch (sinal) {
                    case "+":
                        resultado = calc.Resposta() + calc.Adicao();
                        System.out.println(resultado);
                        break;
                    case "*":
                        resultado = calc.Resposta() + calc.Multiplicacao();
                        System.out.println(resultado);
                        break;
                    case "/":
                        resultado = calc.Resposta() + calc.Divisao();
                        System.out.println(resultado);
                        break;
                    case "%":
                        resultado = calc.Resposta() + calc.Resto();
                        System.out.println(resultado);
                        break;
                    case "-":
                        resultado = calc.Resposta() + calc.Subtracao();
                        System.out.println(resultado);
                        break;
                    default:
                        System.out.println("       ERROR: \nInsert a valid operator");
                }
                System.out.print("Do you want continue? y/n ");
                confirmacao = ler.next();
            }
            while (confirmacao.equals("y"));
        }else System.out.println("Good Bye!!");
    }
}