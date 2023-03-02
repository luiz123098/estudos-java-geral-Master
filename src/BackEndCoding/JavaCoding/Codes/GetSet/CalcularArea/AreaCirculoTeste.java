package BackEndCoding.JavaCoding.Codes.GetSet.CalcularArea;

public class AreaCirculoTeste {
    public static void main(String[] args) {
        AreaCirc  a  = new AreaCirc(15);
        System.out.printf("%.2f",a.area());

        AreaCirc a2 = new AreaCirc(10);
        System.out.printf("%.2f",a2.area());

        AreaCirc a3 =  new AreaCirc(5);
        System.out.printf("%.2f",a3.area());

    }
}