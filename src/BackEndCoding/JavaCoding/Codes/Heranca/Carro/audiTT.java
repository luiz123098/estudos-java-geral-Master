package BackEndCoding.JavaCoding.Codes.Heranca.Carro;

public class Nissan370Z extends Carro{
    public boolean acelerar(){
        boolean acelerou1 = super.acelerar();
        boolean acelerou2 = super.acelerar();
        boolean acelerou3 = super.acelerar();

        return acelerou1 || acelerou2 || acelerou3;
    }

}
