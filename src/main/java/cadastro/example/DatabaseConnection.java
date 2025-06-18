package cadastro.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL =  
    "jdbc:mysql://localhost:3307/cadastro";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    public static Connection getConnection() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    } catch (Exception e) {
        throw new RuntimeException("Erro ao conectar ao banco de dados", e);
    }
    }
}
