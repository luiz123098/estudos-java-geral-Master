package BackEndCoding.JavaCoding.Class.Estruturas.API;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Itereator {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("Luiz");
        lista.add("luiza");
        lista.add("Laura");
        lista.add("Giovana");

//O foreach é usado muito frequentemente para percorrer listas, mapas, set's etc.
        System.out.println("Usando foreach: ");
        for(String listaNome : lista){
            System.out.println(listaNome);
        }

//O Iterator tem a mesma função de um For each (!USUALMENTE!) usado muito frequentemente para percorrer listas, maps, set's, etc.
        System.out.println("\nUsando iterator: ");
        Iterator<String> it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

//O Stream nessa função ele tem o mesmo objetivo dos outros, ele percorre essa list igual os outros.
        System.out.println("\nUsando Stream: ");
        Stream<String> stream = lista.stream();
        stream.forEach(System.out::println);
    }


//Todos tem o mesmo objetivo porém são formas diferentes de fazer a mesma coisa, manipular os dados de formas diferentes para objetivos diferentes
}
