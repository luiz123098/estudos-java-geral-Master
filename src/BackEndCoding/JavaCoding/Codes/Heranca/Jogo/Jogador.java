package BackEndCoding.JavaCoding.Codes.Heranca.Jogo;

import BackEndCoding.JavaCoding.enums.Direcao;

public class Jogador {
    int x;
    int y;
    int vida = 100;
    boolean andar(Direcao direcao){
        switch(direcao){
            case NORTE:
                y++;
                break;
            case SUL:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case OESTE:
                x--;
                break;
        }
        return true;
    }

    boolean atacar(Jogador oponente){

        int deltax = Math.abs(x - oponente.x);
        int deltay = Math.abs(x - oponente.y);

        if(deltax == 0 && deltay == 1){
            oponente.vida -= 10;
            return true;
        }
        if(deltax == 1 && deltay == 0){
            oponente.vida -= 10;
            return true;
        }else {
            return false;
        }
    }
}