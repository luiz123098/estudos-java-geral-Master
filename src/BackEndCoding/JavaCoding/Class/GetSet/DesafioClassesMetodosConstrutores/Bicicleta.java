package BackEndCoding.JavaCoding.Class.GetSet.DesafioClassesMetodosConstrutores;

public class Bicicleta {
    public Roda  rodaDianteira;
    private  Roda  rodatraseira;

    Roda  r = new Roda();



    public  void andar(){

        r.girar();

    }
    public  void freiar() {

        r.parar();

    }
}
