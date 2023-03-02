package BackEndCoding.JavaCoding.Codes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c = new Carro();

        c.ligar();

        c.portaAberta();

        c.acelerar();
        System.out.println(c.motor.giros());
        c.acelerar();
        System.out.println(c.motor.giros());
        c.acelerar();
        System.out.println(c.motor.giros());

        c.portaFechada();

        c.acelerar();
        System.out.println(c.motor.giros());
        c.acelerar();
        System.out.println(c.motor.giros());
        c.acelerar();
        System.out.println(c.motor.giros());


    }
}