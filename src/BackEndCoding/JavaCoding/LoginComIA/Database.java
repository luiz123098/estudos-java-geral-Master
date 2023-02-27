package BackEndCoding.JavaCoding.LoginComIA;
import java.sql.*;
import java.sql.Connection;
public class Database {
    private Connection connection;
    private final String url = "jdbc:postgresql://localhost:port/database";
    private final String user = "username";
    private final String password = "password";
    public Database() {
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void executeQuery(String query) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//    Database db = new Database();
//db.executeQuery("CREATE TABLE Produtos " +
//                            "(id INT PRIMARY KEY, " +
//                            "nome VARCHAR(255)," +
//                            "descricao VARCHAR(255)," +
//                            "preco DECIMAL(10,2)," +
//                            "quantidade INT," +
//                            "fornecedor_id INT," +
//                            "FOREIGN KEY (fornecedor_id) REFERENCES Fornecedores(id))");
}