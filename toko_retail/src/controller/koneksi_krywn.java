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
public class koneksi_krywn {
private static Connection koneksi_krywn;
public static Connection getKoneksi(){
    if(koneksi_krywn==null){
        try{
            String url;
            url="jdbc:mysql://localhost/data_karyawan";
            String username = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi_krywn = DriverManager.getConnection(url,username,password); 
         }catch (SQLException t){
             JOptionPane.showMessageDialog(null, "error koneksi");
         }
}return koneksi_krywn;
}static Object getConnectiion (){
    throw new UnsupportedOperationException("Not yet impelemented");
}  
}
