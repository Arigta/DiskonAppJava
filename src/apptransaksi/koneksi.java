package apptransaksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/transaksi_barang";
                String user = "root"; // Ganti dengan username database Anda
                String password = ""; // Ganti dengan password database Anda

                // Register MySQL JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Buat koneksi
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi ke database berhasil!");
            } catch (ClassNotFoundException e) {
                System.err.println("MySQL JDBC Driver tidak ditemukan!");
                e.printStackTrace();
            } catch (SQLException e) {
                System.err.println("Gagal terhubung ke database!");
                e.printStackTrace();
            }
        }
        return conn;
    }
}