package BackEndCoding.JavaCoding.Codes.JavaBasics;

import javax.swing.JOptionPane;
public class Joptionpane {
    public static void main(String[] args){

         int resposta;

         resposta = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
         if (resposta <18 ) {
             // verifica se o usuário clicou no botão YES
             JOptionPane.showMessageDialog(null, "Com " + resposta+" anos, você ainda não atingiu a maior idade");
             }
         else {
            JOptionPane.showMessageDialog(null, "Com " + resposta + " anos, você atingiu a maior idade!!!");
        }
    }
}