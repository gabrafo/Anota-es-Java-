package JDBC.demo_find.application;

import JDBC.demo_find.db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// CONSULTA NO BANCO DE DADOS MYSQL
public class Program {
    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null; // Consulta SQL
        ResultSet rs = null; // Tem forma de tabela

        try{
            conn = DB.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("select * from department");
            while (rs.next()){ // rs.next() retorna falso caso não exista mais nenhuma posição
                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name")); // Pega o inteiro do campo Id de department
            }
        } catch(SQLException e){
            e.printStackTrace();
        } finally {
            // Fechar os recursos pra não ter memory leak
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
