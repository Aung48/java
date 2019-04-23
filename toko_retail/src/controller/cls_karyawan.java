/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class cls_karyawan {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    
    public String nik;
    public String nama;
    public String tempat_lahir;
    public String tanggal_lahir;
    public String jabatan;
    public String jenis_kelamin;
    public String agama;
    public String status;
    public String alamat;
    
    public void simpan()throws SQLException{
        conn = koneksi_krywn.getKoneksi();
        sql = "INSERT INTO data_karyawan(nik,nama,tempat_lahir,tanggal_lahir,jabatan,jenis_kelamin,agama,status,alamat) VALUES(?,?,?,?,?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, nik);
        pst.setString(2, nama);
        pst.setString(3, tempat_lahir);
        pst.setString(4, tanggal_lahir);
        pst.setString(5, jabatan);
        pst.setString(6, jenis_kelamin);
        pst.setString(7, agama);
        pst.setString(8, status);
        pst.setString(9, alamat);
        pst.execute();
        pst.close();
    }
    
    public ResultSet UpdateJTable()throws SQLException{
        conn = koneksi_krywn.getKoneksi();
        sql = "select*from data_karyawan";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        return rs;
    }
    
    
}
