package BackEndCoding.JavaCoding.Class.Array;
public class ArrayTestes {
    public static void main(String[] args) {
/*
       ARRAY SIMILAR A UM BANCO DE DADOS MULTIDIMENSIONAL QUE POSSUI VALORES EM VARIAS DIMENSÕES:
        [0] [1] [2]
        [0] [1] [2]
        [0] [1] [2]

        COMO NÃO TEM FORMAS DE RETATAR COMO EM UM BANCO DE DADOS AQUI NO JAVA, NOS REPRESENTAMOS
        ESSAS ARRAYS MULTIDIMENCIONAIS DE OUTRA FORMA:
        [[0][1][2]] [[0][1][2]] [[0][1][2]]
 */
        String[][] s = new String [3][3];
        s[1][0] = "segunda primeiro";
        s[1][1] = "segunda segundo";
        s[1][2] = "segunda terceiro";

        s[0][0] = "primeira primeiro";
        s[0][1] = "primeira segundo";
        s[0][2] = "primeira terceiro";

        s[2][0] = "terceira primeiro";
        s[2][1] = "terceira segundo";
        s[2][2] = "terceira terceiro";

        System.out.println(s[2][2]);
        System.out.println(s[0][1]);
    }
}