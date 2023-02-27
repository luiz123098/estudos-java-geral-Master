package BackEndCoding.JavaCoding.Avancado;
import javax.swing.JOptionPane;
public class LoginCmJOption {
    public static void main(String[] args) {
//DECLARANDO VARIAVEIS
        String login, password, loginEntrada, passwordEntrada;

//REGISTRANDO LOGIN E SENHA E ARMAZENANDO OS DADOS NAS VARIAVEIS
        login = JOptionPane.showInputDialog(null,"Register your login: ");
        password = JOptionPane.showInputDialog(null,"Register your password: ");

//ARMAZENANDO AS VARIAVEIS PARA AUTENTICAR O LOGIN
        loginEntrada = JOptionPane.showInputDialog(null,"Login: ");
        passwordEntrada = JOptionPane.showInputDialog(null,"Password: ");

//ALGORITMO PARA VERIFICAR SE FORAM COLOCADOS OS MESMOS VALORES NA HORA DO REGISTRO
        if(loginEntrada.equals(login) && passwordEntrada.equals(password)){
            JOptionPane.showMessageDialog(null,"Access accepted");
        }else {
            JOptionPane.showMessageDialog(null,"Access Denied");
        }
    }
}