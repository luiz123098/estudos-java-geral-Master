package BackEndCoding.JavaCoding.Class.Desafio3Classes;
import java.util.Scanner;
public class Pessoa {
//tem q ter o nome STRING da pessoa, e o peso da pessoa DOUBLE
//metodo comer() traz o peso da comida
public int pesoPessoa;
public String nomePessoa;
public void comer(){
    Comida c = new Comida();
    Scanner s = new Scanner(System.in); String nome; int peso;
    System.out.println("Informe seu nome"); nome = s.nextLine();
    System.out.println("Informe seu peso"); peso = s.nextInt();
    c.igualandoComidas(); int pesoToT = peso + c.pesoComida;
    System.out.println(nome+" O seu peso era: "+peso+"\nAgora seu peso é: "+ pesoToT+"\nPor que comeu "+c.nomeComida);
    this.nomePessoa = nome;
    pesoPessoa = pesoToT;
//        while(c.nomeComida.equals(c.nomeComida1) ||
//              c.nomeComida.equals(c.nomeComida2) ||
//              c.nomeComida.equals(c.nomeComida3) ||
//              c.nomeComida.equals(c.nomeComida4) ||
//              c.nomeComida.equals(c.nomeComida5) ||
//              c.nomeComida.equals(c.nomeComida6)) {
//            peso = pesoToT;
//            c.igualandoComidas();
//            System.out.println(nome + "\nO seu peso era: " + peso + "\nAgora seu peso é: " + pesoToT + "\nPor que comeu " + c.nomeComida);
}

public void repetindo(){
    Comida c = new Comida();
    comer();
    while(c.nomeComida.equals(c.nomeComida1) ||
            c.nomeComida.equals(c.nomeComida2) ||
            c.nomeComida.equals(c.nomeComida3) ||
            c.nomeComida.equals(c.nomeComida4) ||
            c.nomeComida.equals(c.nomeComida5) ||
            c.nomeComida.equals(c.nomeComida6)) {
        c.igualandoComidas();
        System.out.println(nomePessoa + "\nO seu peso era: " + pesoPessoa + "\nAgora seu peso é: " + pesoPessoa + "\nPor que comeu " + c.nomeComida+"\n");
    }
}
}