package BackEndCoding.JavaCoding.Class.TudoSobreProjectLogin;
import  java.util.Scanner;
import java.util.Objects;
public class ProgramaTerminalBase {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String login, senha, login_entrada, senha_entrada;
//COLETANDO LOGIN E SENHA DO USUARIO
        System.out.println("Insert a login name: ");
        login = ler.next();
        System.out.println("Insert a NUMERIC password: ");
        senha = ler.next();
//ESTRUTURA DE CONDIÇÃO PARA CONFERIR SE OS CAMPOS ESTÃO VAZIOS OU NÃO
        if (Objects.equals(login, "") || Objects.equals(senha, "")) {
            System.out.println("Favor preencha os campos de usuario e senha para regitrarmos");
        } else {
            System.out.println("Login: ");
            login_entrada = ler.next();
            System.out.println("Password: ");
            senha_entrada = ler.next();
            if (!login_entrada.equals(login) || !senha_entrada.equals(senha)) {
                System.out.println("Preencha os campos corretamente!!!!");
            } else {
                System.out.println("SUCESSO!!!!");
            }
        }
    }
}