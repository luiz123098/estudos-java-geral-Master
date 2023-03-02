package BackEndCoding.JavaCoding.Codes.Valores;

public class Valoresestudos {
    int a;
    int b;
    int c;

    Valoresestudos(){
        //a = 1;
        //b = 2;
        //c = 3;
        this( 1, 2, 3);

    }
    Valoresestudos(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args){
        Valoresestudos v = new Valoresestudos();

        v.a =7;
        v.b = v.b * v.c;
        v.c = v.a - v.b;
        System.out.print(v.a+"\n"+v.b+"\n"+v.c);
    }



}

