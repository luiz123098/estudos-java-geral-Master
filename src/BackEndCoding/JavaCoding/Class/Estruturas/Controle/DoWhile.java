






































package BackEndCoding.JavaCoding.Class.Estruturas.Controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner  ler  =  new Scanner(System.in);
//do {
        // bloco  de  codigo para ser  executado
//    }
//while (condicao);


//Exemplo de lopp  do while pratico
//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        }
//        while (i < 5);

//Exemplo pratico em String
        String s;

        do{
            System.out.println("Enter a sentence");
            s  = ler.nextLine();
        }

        while (!s.equals("sair"));

    }
}

