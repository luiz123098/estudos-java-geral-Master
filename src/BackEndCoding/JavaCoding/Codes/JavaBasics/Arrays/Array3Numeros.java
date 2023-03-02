package BackEndCoding.JavaCoding.Codes.JavaBasics.Arrays;
import java.util.Arrays;
public class Array3Numeros {
    public static void main(String[] args) {

        int[] x1 = {20,30,40};
        int[] x2 = {x1[2],x1[1],x1[0]};
        System.out.println(Arrays.toString(x1)+"\n"+ Arrays.toString(x2));

    }
}
