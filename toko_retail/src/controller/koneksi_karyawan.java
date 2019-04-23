/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class koneksi_karyawan {
private static Connection koneksi_karyawan;
public static Connection getKoneksi(){
    if(koneksi_karyawan==null){
        try{
            String url;
            url="jdbc:mysql://localhost/karyawan";
            String username = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi_karyawan = DriverManager.getConnection(url,username,password); 
         }catch (SQLException t){
             JOptionPane.showMessageDialog(null, "error koneksi");
         }
}return koneksi_karyawan;
}static Object getConnectiion (){
    throw new UnsupportedOperationException("Not yet impelemented");
}  
}
