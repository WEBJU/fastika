/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Covid
 */
public class dbConnect {
    public static Connection getConnection(){
        Connection conn=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fastika","root","");
        }catch(Exception e){
            System.out.print("Could not establish connection to the database");
        }
        return conn;
        
    }
}
