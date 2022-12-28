package conexaoBd;

import java.sql.*;

public class ConexaoMySql {

    public static Connection conectar() {

        java.sql.Connection conexao = null;

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/dbtotem"; // Falta colocar o nome do banco de dados
        String user = "root"; // Falta inserir o usuario
        String password = "rootCrow@2022"; // Falta inserir a senha

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;

        } catch (Exception e) {
            System.out.println("Não foi possivel realizar a conexão com o banco de dados");
            return null;
        }

    }

    public static void desconectar(Connection conexao) {

        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
                System.out.println("Desconectado do banco de dados");
            }
        } catch (Exception e) {
            System.out.println("Não foi possivel desconectar do banco de dados");
        }

    }
    
}
