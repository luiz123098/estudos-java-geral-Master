package BackEndCoding.JavaCoding.Class.Heranca.Carro;

public class Carro {
    Double velociadadeAtual = 0.0;

    void acelerar() {
        velociadadeAtual += 5;
        }
        void freiar() {
        if(velociadadeAtual >= 5){
            velociadadeAtual -= 5;
        }else
            velociadadeAtual = 0.0;
        }
}
