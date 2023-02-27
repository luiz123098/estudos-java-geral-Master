package BackEndCoding.JavaCoding.JavaBasics.Arrays;

public class ArrayValroLargo {
    public static void main(String[] args) {

        int[] a1 = {20,35,80};
        int max_val = a1[0];
        if(a1[2] >= max_val)
            max_val = a1[2];
        System.out.println(max_val);
    }
}
