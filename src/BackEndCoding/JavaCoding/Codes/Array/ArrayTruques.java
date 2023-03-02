package BackEndCoding.JavaCoding.Codes.Array;

public class ArrayTruques {
    public static void main(String[] args) {
        double[] a1= new double[10];
        int x = a1.length -1;
        a1[x] = a1.length;

        for(int i = 0; i < 11; i++) {
            System.out.println(a1[a1.length - 1]);
        }
    }
}
