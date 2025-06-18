package cadastro.example;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class PessoaDAO {
    public void cadastrarPessoa(Pessoa pessoa) {
    try (Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO pessoa (nome) VALUES (?)")) {
        stmt.setString(1, pessoa.getNome());
        stmt.executeUpdate();
    }catch (Exception e) {
        e.printStackTrace();
    }
    }
}