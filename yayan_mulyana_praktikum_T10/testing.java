package yayan_mulyana_praktikum_T10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class testing {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan username: ");
        String uname = input.nextLine();
        System.out.print("Masukkan password: ");
        String passwd = input.nextLine(); 
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = Koneksi.konek(); // Mendapatkan koneksi
            System.out.println("Koneksi berhasil!");

            // Menggunakan PreparedStatement untuk mencegah SQL Injection
            String query = "SELECT * FROM user WHERE username = ? AND password = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, uname); // Set username
            preparedStatement.setString(2, passwd); // Set password

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("Login berhasil");
            } else {
                System.out.println("Username atau password salah");
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(testing.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Tutup semua resource di dalam finally
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        input.close(); // Tutup scanner
    }
}
