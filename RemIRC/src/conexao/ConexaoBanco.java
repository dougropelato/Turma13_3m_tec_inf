package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Douglas
 */
public class ConexaoBanco {

    public static Connection getConexao() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://192.168.1.254/remirc", "teste", "");
        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }

    }
}
