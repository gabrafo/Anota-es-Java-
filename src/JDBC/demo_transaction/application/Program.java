package JDBC.demo_transaction.application;

import JDBC.demo_update.db.DB;
import JDBC.demo_update.db.DBException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

// TRANSAÇÃO NO BANCO DE DADOS MYSQL
public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DB.getConnection();

            conn.setAutoCommit(false); // Operações não são confirmadas automaticamente, precisam de confirmação explicita

            st = conn.createStatement();
            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            int x = 1;

            /*
            if(x<2){
                throw new SQLException("Fake error");
            }
            */

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 2");

            System.out.println("rows1: " + rows1);
            System.out.println("rows2: " + rows2);

            conn.commit(); // Só aceita o commit no BD se tudo tiver sido executado
        } catch (SQLException e) {
            try {
                conn.rollback();
                throw new DBException("Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException e1) {
                throw new DBException("Error trying to rollback! Caused by: " + e1.getMessage());
            }
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}