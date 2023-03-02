package BackEndCoding.JavaCoding.Interfaces.Carro;

public class Carro {
    int velociadadeAtual = 0;
    int delta = 5;
    int velociadadeMaxima = 0;
    Carro (){
        this.velociadadeMaxima = 200;
    }
    Carro(int velociadadeAtual){
        this.velociadadeAtual = velociadadeAtual;
    }

    void acelerar() {
        velociadadeAtual += 5;
        }
        void freiar() {
        if(velociadadeAtual >= 5){
            velociadadeAtual -= 5;
        }else
            velociadadeAtual = 0;
        }
}
