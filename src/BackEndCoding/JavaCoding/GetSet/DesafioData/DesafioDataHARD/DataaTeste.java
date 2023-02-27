package BackEndCoding.JavaCoding.GetSet.DesafioData.DesafioDataHARD;
public class DataaTeste {
    public static void main(String[] args) {
//  PUXANDO A CLASSE DO MESMO PACOTE INSTANCIANDO ELAEM UM OBJETO E USANDO AS VARIAVEIS DELA PARA ALOCAR VALORES
        Dataa d1 = new Dataa(11, 9, 2001);
        d1.obterDataFormatada();


//  PUXANDO A CLASSE DO MESMO PACOTE INSTANCIANDO ELAEM UM OBJETO E USANDO AS VARIAVEIS DELA PARA ALOCAR VALORES
        Dataa d2 = new Dataa();
        d2.obterDataFormatada();
    }
}