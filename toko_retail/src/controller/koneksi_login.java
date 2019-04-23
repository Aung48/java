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
public class koneksi_login {
private static Connection koneksi_login;
public static Connection getKoneksi(){
    if(koneksi_login==null){
        try{
            String url; 
            url="jdbc:mysql://localhost:3306/userlogin";
            String username = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi_login= DriverManager.getConnection(url,username,password); 
         }catch (SQLException t){
             JOptionPane.showMessageDialog(null, "error koneksi");
         }
}return koneksi_login;
}static Object getConnectiion (){
    throw new UnsupportedOperationException("Not yet impelemented");
}  
}
