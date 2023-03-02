package BackEndCoding.JavaCoding.Codes.JavaBasics.Arrays;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] x = {6,3};
        System.out.println("Original BackEndCoding.JavaCoding.Codes.Array: "+ java.util.Arrays.toString(x));
        if(x[0] == 3 || x[0] == 7){
            System.out.println("TRUE");
        }
        System.out.println(x[1] == 3 || x[1]== 7);

    }
}
