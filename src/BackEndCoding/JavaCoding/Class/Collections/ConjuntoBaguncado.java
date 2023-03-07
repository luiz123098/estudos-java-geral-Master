package BackEndCoding.JavaCoding.Class.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet<java.io.Serializable> conjunto = new HashSet<>();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Test"); // string -> String
        conjunto.add(5); // int -> Integer
        conjunto.add('k'); // char -> Character

        System.out.println(conjunto.contains(7));// VERIFICA SE CONTÉM O DETERMINADO VALOR DENTRO DA COLLECTION

        System.out.println("O tamanho da Collection é: "+ conjunto.size());// VERIFICA O TAMANHO DA COLLECTION
        conjunto.add(7);// ADICIONA OUTRO VALOR
        System.out.println("O tamanho da Collection é: "+ conjunto.size());// VERIFICA O TAMANHO DA COLLECTION

        System.out.println(conjunto.remove('k'));// REMOVE ALGUM VALOR, SE EXISTIR ESSE VALOR RETORNA TRUE E REMOVE O VALOR, SE NAO TIVER RETORNA FALSE
        System.out.println(conjunto.remove(5));// REMOVE ALGUM VALOR, SE EXISTIR ESSE VALOR RETORNA TRUE E REMOVE O VALOR, SE NAO TIVER RETORNA FALSE

        System.out.println(conjunto.contains('k'));// VERIFICA SE CONTÉM O DETERMINADO VALOR DENTRO DA COLLECTION
        System.out.println(conjunto.contains(7));// VERIFICA SE CONTÉM O DETERMINADO VALOR DENTRO DA COLLECTION

      Set<java.io.Serializable> nums = new HashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(7);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums); // UNIÃO ENTRE 2 CONJUNTOS
        conjunto.retainAll(nums); //PEGA OQ TEM EM COMUM EM 2 TABELAS DIFERENTES, E JOGA EM UMA SO DANDO TIPO UM 'INNER JOIN'

        System.out.println(conjunto);
        System.out.println(nums);


// OPÇÃO DE IMPLEMENTAÇÃO PELO TERMINAL DE VALORES PARA A LISTA
        Scanner s = new Scanner(System.in);
        String s1;



        System.out.println("Insira um valor para adicionar a lista: ");
        nums.add(s1 = s.next());

    }
}