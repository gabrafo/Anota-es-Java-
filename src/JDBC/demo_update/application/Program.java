package JDBC.demo_update.application;

import JDBC.demo_update.db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

// ATUALIZAÇÃO NO BANCO DE DADOS MYSQL
public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "UPDATE seller "
                    + "SET BaseSalary = BaseSalary + ? "
                    + "WHERE " // WHERE indica restrição!
                    + "(DepartmentId = ?)"); // Expressão de restrição

            st.setDouble(1, 200.0); // Indica o valor a ser aumentado
            st.setInt(2, 2); // Indica o departamento que vai sofrer o aumento de salário

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
