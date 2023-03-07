package BackEndCoding.JavaCoding.Class;

import java.util.Random;
public class TrabalhandoComAleatoriedade {
    public static void main(String[] args) {
        Random r = new Random();

            int i = r.nextInt(9);
            String s = null;

            if (i >= 0 && i <= 3) {
                s = "pedra";
            } else if (i > 3 && i <= 6) {
                s = "papel";
            } else if (i > 6 && i <= 9) {
                s = "tesoura";
            }

            System.out.println(i);
            System.out.println(s);
    }
}