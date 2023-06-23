package projeto1;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) {
        
        // Conexão com o banco de dados
        String url = "jdbc:mysql://localhost:3306/escola";
        String usuario = "root";
        String senha = "";
        Connection conexao = null;
        
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão estabelecida com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao estabelecer conexão: " + e.getMessage());
        }
        
        // Fechamento da conexão
        try {
            conexao.close();
            System.out.println("Conexão encerrada com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao encerrar conexão: " + e.getMessage());
        }
        
    }

}


       
    



