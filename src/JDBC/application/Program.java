package JDBC.application;

import JDBC.db.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {

        Connection conn = DB.getConnection(); // Conecta a partir do método estático
        DB.closeConnection();
    }
}
