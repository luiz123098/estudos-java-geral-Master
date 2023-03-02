package BackEndCoding.JavaCoding.Codes.Whiles.foreach;

public class ForeachEstudos {
    public static void main(String[] args) {
        int[] arrayTeste = new int[5];

        //escrevendo valores para entrarem na array
        for(int i = 0;i < 5;i++){
            arrayTeste[i] = i;
        }
        for(int arrayTestes : arrayTeste){
            System.out.println(arrayTestes);
        }
    }
}