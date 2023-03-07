package BackEndCoding.JavaCoding.Class.ExerciciosJavaAvancado.PedraPapelTesoura;

import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        String jogador = "";
        while(!jogador.equals("sair")) {
            MecanicaDoJogo jogadas = new MecanicaDoJogo();
            Scanner ler = new Scanner(System.in);

            System.out.println("Insira sua jogada:");
            jogador = ler.next();

            System.out.println(jogadas.jogada(jogador, jogadas.jogadaPC(1, 3)));
        }
    }
}
