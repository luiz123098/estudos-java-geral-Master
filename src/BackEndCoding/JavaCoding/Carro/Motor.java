package BackEndCoding.JavaCoding.Carro;

import static java.lang.Math.round;
public class Motor {

    public double fatorInjecao;
    public boolean ligado = false;

    public int giros(){
        if(!ligado){
            return 0;
        }else
           return (int) Math.round(fatorInjecao * 3000);
    }

}
