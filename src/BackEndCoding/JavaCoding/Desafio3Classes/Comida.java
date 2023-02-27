package BackEndCoding.JavaCoding.Desafio3Classes;
import java.util.Scanner;
public class Comida {
//nome da comida STRING peso da comida DOUBLE
    String nomeComida,
           nomeComida1 = "lasanha",
           nomeComida2 = "miojo",
           nomeComida3 = "arroz",
           nomeComida4 = "feijao",
           nomeComida5 = "picanha",
           nomeComida6 = "frango";
    int pesoComida,
        pesoComida1 = 5,
        pesoComida2 = 3,
        pesoComida3 = 12,
        pesoComida4 = 7,
        pesoComida5 = 24,
        pesoComida6 = 13;
    public void igualandoComidas(){
        Scanner s = new Scanner(System.in);
        System.out.println("\nO que você comeu?"); nomeComida = s.next();
             if(nomeComida.equals(nomeComida1)){pesoComida = pesoComida1; nomeComida = nomeComida1; System.out.println("\n"+nomeComida +" "+ pesoComida+"\n");}
        else if(nomeComida.equals(nomeComida2)){pesoComida = pesoComida2; nomeComida = nomeComida2; System.out.println("\n"+nomeComida +" "+ pesoComida+"\n");}
        else if(nomeComida.equals(nomeComida3)){pesoComida = pesoComida3; nomeComida = nomeComida3; System.out.println("\n"+nomeComida +" "+ pesoComida+"\n");}
        else if(nomeComida.equals(nomeComida4)){pesoComida = pesoComida4; nomeComida = nomeComida4; System.out.println("\n"+nomeComida +" "+ pesoComida+"\n");}
        else if(nomeComida.equals(nomeComida5)){pesoComida = pesoComida5; nomeComida = nomeComida5; System.out.println("\n"+nomeComida +" "+ pesoComida+"\n");}
        else if(nomeComida.equals(nomeComida6)){pesoComida = pesoComida6; nomeComida = nomeComida6; System.out.println("\n"+nomeComida +" "+ pesoComida+"\n");}
        else{}
    }
}