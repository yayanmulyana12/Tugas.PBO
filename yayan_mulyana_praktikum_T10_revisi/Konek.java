package yayan_mulyana_praktikum_T10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Konek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        // Query SQL untuk autentikasi
        String sql = "SELECT * FROM user WHERE username = ? AND password = ?";

        // Koneksi dan statement
        try (Connection connection = Koneksi.getKoneksi();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            // Set parameter query
            statement.setString(1, username);
            statement.setString(2, password);

            // Eksekusi query
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    System.out.println("Login berhasil!");
                } else {
                    System.out.println("Username atau password salah.");
                }
            }

        } catch (SQLException e) {
            System.err.println("Kesalahan database: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close(); // Pastikan scanner ditutup
        }
    }
}
