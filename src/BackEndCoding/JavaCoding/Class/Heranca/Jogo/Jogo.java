package BackEndCoding.JavaCoding.Class.Heranca.Jogo;

import BackEndCoding.JavaCoding.enums.Direcao;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;

        System.out.println(monstro.vida);
        System.out.println(heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.andar(Direcao.OESTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstre Life = "+monstro.vida);
        System.out.println("Hero Life = "+heroi.vida);

        monstro.andar(Direcao.SUL);
        monstro.andar(Direcao.LESTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstre Life = "+monstro.vida);
        System.out.println("Hero Life = "+heroi.vida);
        System.out.println("Monster position = x "+monstro.x+" y "+ monstro.y);
        System.out.println("Hero position = x "+heroi.x+" y "+ heroi.y);
    }
}
