package BackEndCoding.JavaCoding.Codes.JavaBasics;

import BackEndCoding.JavaCoding.Codes.GetSet.DesafioData.DesafioDataHARD.Dataa;

public class ValorRef {
    public static void main(String[] args) {
        Dataa d1 = new Dataa(1,5,2022);
       // d1.obterDataFormatada();
        Dataa d2 = d1;
        d1.dia = 2;
        d2.mes = 5;



    }
}
