/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author User
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
public Connection bukakoneksi(){
 Connection con;
    con = null;
 try{
 Class.forName("com.mysql.jdbc.Driver");
 con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/java2db","root","");
 System.out.println("berhasil");
 return con;
 }
 catch (ClassNotFoundException | SQLException e){
 System.out.println("gagal");
 return null;
 }
 }

    /**
     *
     * @param args
     */
    public static void main (String args[]){
 new Koneksi().bukakoneksi();
 }
}
