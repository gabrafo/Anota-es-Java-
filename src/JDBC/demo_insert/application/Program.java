package JDBC.demo_insert.application;

import JDBC.demo_insert.db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

// INSERÇÃO NO BANCO DE DADOS MYSQL
public class Program {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;

        try{
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "INSERT INTO seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId) " // Campos a serem preenchidos
                    + "VALUES "
                    + "(?, ?, ?, ?, ?)" // ? é um Place Holder pros valores a serem preenchidos nos campos
                    + Statement.RETURN_GENERATED_KEYS); // Retorna o ID criado

            // Setando os dados que serão inseridos no lugar dos Place Holders
            st.setString(1, "Joseph Gray");
            st.setString(2, "joseph@gmail.com");

            // TEM QUE SER O DATE DO SQL!
            st.setDate(3, new java.sql.Date(sdf.parse("19/06/2003").getTime()));
            st.setDouble(4, 2350.0);
            st.setInt(5, 2); // ID do departamento em que ele estará

            int rowsAffected = st.executeUpdate(); // Quando vai alterar os dados usa o executeUpdate()

            if(rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();

                while(rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Done! ID: " + id);
                }
            } else {
                System.out.println("No rows affected");
            }
        } catch (SQLException | ParseException e){
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
