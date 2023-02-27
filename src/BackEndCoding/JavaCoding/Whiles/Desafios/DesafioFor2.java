package BackEndCoding.JavaCoding.Whiles.Desafios;
public class DesafioFor2 {
    public static void main(String[] args) {

//        String  valor = "#";
//        for  (int  i = 1; i <= 5;  i++){
//            System.out.println(valor);
//            valor  += "#";
//        }
//VERSAO DO DESAFIO
//NAO PODE USAR VALOR NUMERICO PARA CONTROLAR  O LACO


        for(String valor = "#"; !valor.equals("#####")
                ;valor += "#"){

            System.out.println(valor);
        }



    }
}
