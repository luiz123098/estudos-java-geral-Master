package BackEndCoding.JavaCoding.Class.ExerciciosJavaAvancado;

public class ExercicioDoisPontos {
    public static void main(String[] args) {
        double xPontoA = 0;
        double yPontoA = 20;

        double xPontoB = 40;
        double yPontoB = 60;

        double x1 = xPontoA;
        double y1 = yPontoA;

        double x2 = xPontoB;
        double y2 = yPontoB;

        double distanciaDoisPontos = Math.sqrt( Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2) );

        System.out.println(x1 + " " + y1 + "\n" + x2 + " " +y2);

        System.out.printf("%.2f",distanciaDoisPontos);

    }
}
