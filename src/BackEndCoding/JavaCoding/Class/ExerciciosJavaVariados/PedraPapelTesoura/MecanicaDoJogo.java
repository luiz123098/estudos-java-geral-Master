package BackEndCoding.JavaCoding.Class.ExerciciosJavaVariados.PedraPapelTesoura;

import java.util.Objects;

public class MecanicaDoJogo {
    private final String pedra = "pedra";
    private final String papel = "papel";
    private final String tesoura = "tesoura";

    public String jogada (String jogador, String computador){
//      VITORIA DO COMPUTADOR
       if(Objects.equals(jogador, pedra) && Objects.equals(computador, papel)){
           return "\nComputador ganhou!\n";
       }
       if(Objects.equals(jogador, papel) && Objects.equals(computador, tesoura)){
           return "\nComputador ganhou!\n";
       }
       if(Objects.equals(jogador, tesoura) && Objects.equals(computador, pedra)){
           return "\nComputador ganhou!\n";
       }
//      VITORIA DO JOGADOR
       if(Objects.equals(jogador, papel) && Objects.equals(computador, pedra)){
           return "\nJogador ganhou!\n";
       }
       if(Objects.equals(jogador, tesoura) && Objects.equals(computador, papel)){
           return "\nJogador ganhou!\n";
       }
       if(Objects.equals(jogador, pedra) && Objects.equals(computador, tesoura)){
           return "\nJogador ganhou!\n";
       }
       else {
           return "\nEmpate\n";
       }
    }

    public String jogadaPC(int min, int max)
    {
        java.util.Random rand = new java.util.Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;

        String jogadaPC = null;

        if(randomNum == 1){
            jogadaPC = this.pedra;
        }
        if(randomNum == 2){
            jogadaPC = this.papel;
        }
        if(randomNum == 3){
            jogadaPC = this.tesoura;
        }
        return jogadaPC;
    }
}
