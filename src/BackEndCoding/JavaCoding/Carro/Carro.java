package BackEndCoding.JavaCoding.Carro;

public class Carro {

    final Motor motor = new Motor();
    boolean porta = false;

    boolean portaAberta (){
        return porta = true;
    }
    boolean portaFechada (){
        return porta = false;
    }
    void acelerar(){
        if(motor.fatorInjecao < 2.6 && !porta){
        motor.fatorInjecao += 0.4;
        }
    }
    void freiar(){
        if(motor.fatorInjecao > 1 && porta){
            motor.fatorInjecao -= 0.4;
        }
    }
    void ligar(){
        motor.ligado = true;
    }
    void desligar(){
        motor.ligado = false;
    }
    boolean estaLigado(){
        return motor.ligado;
    }


}
