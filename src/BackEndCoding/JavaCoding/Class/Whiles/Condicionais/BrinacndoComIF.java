package BackEndCoding.JavaCoding.Class.Whiles.Condicionais;

import javax.swing.JOptionPane;
public class BrinacndoComIF {
    public static void main(String[] args) {
        String nome = null;
         int resposta;
         nome = JOptionPane.showInputDialog("Qual � o seu nome?");
//IMPRIME UMA CAIXA QUE RECEBES DADOS Q S�O ENVIADOS DO TECLADO DO USUARIO PARA DENTRO DO SISTEMA, E GUARDA NA VARIAVEL "RESPOSTA"
         resposta = JOptionPane.showConfirmDialog(null, "O seu nome � " + nome +
             "?");
         if (resposta == JOptionPane.YES_OPTION) {
           // verifica se o usu�rio clicou no bot�o YES
           JOptionPane.showMessageDialog(null, "Seu nome � " + nome);
           } else {
           JOptionPane.showMessageDialog(null, "Seu nome n�o � " + nome);
           }
    }
}
