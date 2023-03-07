package BackEndCoding.JavaCoding.Class.ExerciciosJavaAvancado;

import java.util.Scanner;

public class JogoDaSenha {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jogador1 = 1;
        int jogador2 = 0;
        String jogarNovamente = "sim";

        while (jogarNovamente.equals("sim")) {

            System.out.print("Jogador 1 digite uma senha entre (0 e 100): ");
            jogador1 = s.nextInt();

            while (jogador1 > 100 || jogador1 < 0) {
                System.out.println("\n"+"Somente serão aceitas senhas entre (0 e 100)");
                System.out.print("Jogador 1 digite uma senha entre (0 e 100): ");
                jogador1 = s.nextInt();
            }

                for (int i = 0; i < 5; i++) {
                    System.out.print("\nJogador 2 digite a senha: ");
                    jogador2 = s.nextInt();

                    if (jogador2 > jogador1) {
                        System.out.println(jogador2 + " é maior que a senha");
                    }
                    if (jogador2 < jogador1) {
                        System.out.println(jogador2 + " é menor que a senha");
                    }
                    if (jogador2 + 1 == jogador1 || jogador2 - 1 == jogador1) {
                        System.out.println("TA QUENTE!");
                    }
                    if(jogador2 == jogador1){
                        System.out.println("\n"+"Parabéns você ganhou!!!!");
                        break;
                    }
                }

            if (jogador2 != jogador1) {
                System.out.println("\n"+"você perdeu. Tente novamente depois.");
            }
            System.out.print("\n"+"Deseja jogar novamente? ");
            jogarNovamente = s.next();
        }
        System.out.println("\n"+"Obrigado por jogar senha até a proxima!!");
    }
}
