package BackEndCoding.JavaCoding.Class.Whiles.Condicionais;

import javax.swing.JOptionPane;
public class BrinacndoComIF {
    public static void main(String[] args) {
        String nome = null;
         int resposta;
         nome = JOptionPane.showInputDialog("Qual é o seu nome?");
//IMPRIME UMA CAIXA QUE RECEBES DADOS Q SÃO ENVIADOS DO TECLADO DO USUARIO PARA DENTRO DO SISTEMA, E GUARDA NA VARIAVEL "RESPOSTA"
         resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome +
             "?");
         if (resposta == JOptionPane.YES_OPTION) {
           // verifica se o usuário clicou no botão YES
           JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
           } else {
           JOptionPane.showMessageDialog(null, "Seu nome não é " + nome);
           }
    }
}
