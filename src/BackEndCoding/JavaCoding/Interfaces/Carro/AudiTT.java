package BackEndCoding.JavaCoding.Interfaces.Carro;

public class AudiTT extends Carro implements Esportivo {
    AudiTT(){
        velociadadeMaxima = 500;
    }
    AudiTT(int velocidadeAtual){
    super(velocidadeAtual);
    delta = 15;
    }

    @Override
    public void ligarTurbo() {
        delta = 30;
    }
    @Override
    public void desligarTurbo(){
        delta = 15;
    }

   // void acelerar(){
   //     delta = 15;
   // }
   // void freiar(){
   //     velociadadeAtual += 15;
   // }

}
