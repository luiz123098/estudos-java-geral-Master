package BackEndCoding.JavaCoding.Interfaces.Carro;

public class Uno extends Carro implements  Utilitario{

    Uno(){
        velociadadeMaxima = 200;
    }
    Uno(int velocidadeAtual){
        super(velocidadeAtual);
        delta = 10;
    }

    @Override
    public void colocarEscadaNoTeto(){
        delta = 150;
    }
    @Override
    public void tirarEscadaDoTeto(){
        delta = 10;
    }
    void acelerar(){
        velociadadeAtual += 15;
    }
    void freiar(){
        velociadadeAtual += 15;
    }

}
