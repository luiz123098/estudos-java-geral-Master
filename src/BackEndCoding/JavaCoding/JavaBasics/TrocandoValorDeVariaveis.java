package BackEndCoding.JavaCoding.JavaBasics;

public class TrocandoValorDeVariaveis {
    public static void main(String[] args) {
        int a = 8, b = 3;

            System.out.println(a+" "+b);

        if(a > b) {
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;

            System.out.println(a+" "+b);
        }
        }
    }