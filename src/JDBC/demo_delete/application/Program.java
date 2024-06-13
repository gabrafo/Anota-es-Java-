package JDBC.demo_delete.application;

import JDBC.demo_delete.db.DBIntegrityException;
import JDBC.demo_update.db.DB;

import java.sql.*;

// DELEÇÃO NO BANCO DE DADOS MYSQL
public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = JDBC.demo_update.db.DB.getConnection();
            st = conn.prepareStatement(
                    "DELETE FROM department "
                    + "WHERE Id = ?");

            st.setInt(1, 2);
            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            throw new DBIntegrityException(e.getMessage());
        } finally {
            JDBC.demo_update.db.DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
