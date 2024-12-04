package yayan_mulyana_praktikum_T10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {

    private static Connection koneksi;

    // Informasi koneksi database
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/javadatabase";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "";

    /**
     * Membuka koneksi ke database.
     *
     * @return Connection objek koneksi ke database
     */
    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                koneksi = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
                System.out.println("Koneksi berhasil dibuat.");
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println("Gagal membuat koneksi: " + e.getMessage());
                throw new RuntimeException("Tidak dapat terhubung ke database.", e);
            }
        }
        return koneksi;
    }

    /**
     * Menutup koneksi ke database.
     */
    public static void tutupKoneksi() {
        if (koneksi != null) {
            try {
                koneksi.close();
                koneksi = null;
                System.out.println("Koneksi berhasil ditutup.");
            } catch (SQLException e) {
                System.err.println("Gagal menutup koneksi: " + e.getMessage());
            }
        }
    }
}
