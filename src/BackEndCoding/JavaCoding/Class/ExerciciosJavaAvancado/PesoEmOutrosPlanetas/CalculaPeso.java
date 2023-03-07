package BackEndCoding.JavaCoding.Class.ExerciciosJavaAvancado.PesoEmOutrosPlanetas;

import java.util.Scanner;

public class CalculaPeso {
    public static void main(String[] args) {
        PesoePlanetas calculaPeso = new PesoePlanetas();
        Scanner s = new Scanner(System.in);

        System.out.print("Qual seu peso: ");
        double pesoTerra = s.nextDouble();

        System.out.print("Quer saber seu peso em qual planeta: ");
        String planeta = s.next();

        System.out.printf("\nvocê tem: %.2f",calculaPeso.pesoEmPlaneta(pesoTerra, planeta));
        System.out.print(" Kg em "+planeta);

    }
}
