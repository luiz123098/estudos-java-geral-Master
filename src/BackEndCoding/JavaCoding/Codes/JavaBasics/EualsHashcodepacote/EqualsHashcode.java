package BackEndCoding.JavaCoding.Codes.JavaBasics.EualsHashcodepacote;

public class EqualsHashcode {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Maria";
        u1.nomeMae = "Marta";

        Usuario u2 = new Usuario();
        u2.nome = "Maria";
        u2.nomeMae = "Marta";
//O RESULTADO DESSAS 2 SERÁ FALSO POR QUESÃO 2 ENDEREÇOS DE MEMORIAS DIFERENTES
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
//

    }
}