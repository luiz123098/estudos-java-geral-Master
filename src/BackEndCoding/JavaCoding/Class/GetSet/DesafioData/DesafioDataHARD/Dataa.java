package BackEndCoding.JavaCoding.Class.GetSet.DesafioData.DesafioDataHARD;
public class Dataa {
//TODO        ESSAS VARIAVEIS SERAO USADAS EM TODA PARTE DO PROJETO POR ISSO NAO ESTAO EM NENHUMA CLASSE OU METODO
    public int dia = 1,
               mes = 1,
               ano = 1970;
    Dataa(){dia = 1;mes = 1;ano = 1970;}
    public Dataa(int dataDia, int dataMes, int dataAno) {
        dia = dataDia;
        mes = dataMes;
        ano = dataAno;
    }
//TODO        CRIANDO UM METODO PARA A FORMATAÇÃO DA DATA DESEJADA,
//TODO        RETORNANDO O DIA MES E ANO EM UMA FORMATO PARA JA ALOCAR OS VALORES DIRETO ONDE PEDIREM
    String obterDataFormatada(){return dia +"/"+mes+"/"+ano;}
    void imprimirDataFormatada(){System.out.println(obterDataFormatada());}
}