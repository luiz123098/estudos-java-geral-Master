package BackEndCoding.JavaCoding.Codes.JavaBasics;

import java.util.Scanner;
public class ExercicioIdade {
    public static void main(String[] args) {
//CRIANDO O OBJETO SCANNER E ESTANCIANDU-O PARA USAR ESSE IMPORT
        Scanner ler = new Scanner(System.in);
//DECLARA��O DE VARIAVEIS
        int idadea;
        int idaded;
        int idadem;
        int idadeTotal;
//RETORNAR O IMPUT PRO SISTEMA E COLHR INFORMA��ES DO USUARIO
        System.out.println("Quantos anos voc� tem");
        idadea = ler.nextInt();

        System.out.println("Quantos meses");
        idadem = ler.nextInt();

        System.out.println("Quantos dias");
        idaded = ler.nextInt();
//CALCULO DA IDADE EM DIAS
        idadeTotal = (idadea * 365) + (idadem * 30) + idaded;
//RETORNA O RESULTDO FINAL
        System.out.println("Sua idade em dias � de: "+idadeTotal+" Dias");




//TENTATIVA DE USAR O IMPORT JOptionPANE
        //idadea = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos voc� tem?\n"));
        //idadem = Integer.parseInt(JOptionPane.showInputDialog("Quantos meses voc� tem?\n"));
        //idaded = Integer.parseInt(JOptionPane.showInputDialog("Quantos dias voc� tem?\n"));
        //idadeTotal = (idadea * 365) + (idadem * 30) + idaded;
    }
}
