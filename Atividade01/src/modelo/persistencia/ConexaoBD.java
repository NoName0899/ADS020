/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 18114290001
 */
public class ConexaoBD {

    static Connection conexao;

    public static Connection getConexao() throws DadosException {

        /* try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/cadastro", "root", "BDfox29@");
        } catch (ClassNotFoundException e) {
            throw new DadosException("Erro ao carregar JDBC: " + e.getMessage());
        } catch (SQLException e) {
            throw new DadosException("Erro ao conectar com SGBD: " + e.getMessage());
        }*/
        try {
            if (conexao == null) {
                Class.forName("com.mysql.jdbc.Driver");
                conexao = DriverManager.getConnection("jdbc:mysql://localhost/cadastro", "root", "BDfox29@");
            }
        } catch (ClassNotFoundException ex) {
            throw new DadosException("Erro ao carregar JDBC!");
        } catch (SQLException ex) {
            throw new DadosException("Erro ao conectar MySQL!");
        }
        return conexao;

    }
}
