package BackEndCoding.JavaCoding.Codes.JavaBasics;

import java.util.Scanner;
public class ExercicioIdade {
    public static void main(String[] args) {
//CRIANDO O OBJETO SCANNER E ESTANCIANDU-O PARA USAR ESSE IMPORT
        Scanner ler = new Scanner(System.in);
//DECLARAÇÃO DE VARIAVEIS
        int idadea;
        int idaded;
        int idadem;
        int idadeTotal;
//RETORNAR O IMPUT PRO SISTEMA E COLHR INFORMAÇÕES DO USUARIO
        System.out.println("Quantos anos você tem");
        idadea = ler.nextInt();

        System.out.println("Quantos meses");
        idadem = ler.nextInt();

        System.out.println("Quantos dias");
        idaded = ler.nextInt();
//CALCULO DA IDADE EM DIAS
        idadeTotal = (idadea * 365) + (idadem * 30) + idaded;
//RETORNA O RESULTDO FINAL
        System.out.println("Sua idade em dias é de: "+idadeTotal+" Dias");




//TENTATIVA DE USAR O IMPORT JOptionPANE
        //idadea = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?\n"));
        //idadem = Integer.parseInt(JOptionPane.showInputDialog("Quantos meses você tem?\n"));
        //idaded = Integer.parseInt(JOptionPane.showInputDialog("Quantos dias você tem?\n"));
        //idadeTotal = (idadea * 365) + (idadem * 30) + idaded;
    }
}
