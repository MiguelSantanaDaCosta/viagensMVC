package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDadosConexao {
    private static BancoDadosConexao instance;

    private BancoDadosConexao() {
    }

    public static synchronized BancoDadosConexao getInstance() {
        if (instance == null) {
            instance = new BancoDadosConexao();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/agencia_viagens");

    }
}