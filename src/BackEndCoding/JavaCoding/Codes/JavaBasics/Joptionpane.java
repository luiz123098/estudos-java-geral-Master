package BackEndCoding.JavaCoding.Codes.JavaBasics;

import javax.swing.JOptionPane;
public class Joptionpane {
    public static void main(String[] args){

         int resposta;

         resposta = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos voc� tem?"));
         if (resposta <18 ) {
             // verifica se o usu�rio clicou no bot�o YES
             JOptionPane.showMessageDialog(null, "Com " + resposta+" anos, voc� ainda n�o atingiu a maior idade");
             }
         else {
            JOptionPane.showMessageDialog(null, "Com " + resposta + " anos, voc� atingiu a maior idade!!!");
        }
    }
}