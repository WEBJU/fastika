/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Functions;
import java.sql.*;
import com.mysql.jdbc.Statement;
import database.dbConnect;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Covid
 */
public class Functions {
     //function to check if username exists
    public boolean isUserExists(String username){
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser=false;
        
        String query="SELECT * FROM `users` WHERE `username`=?";
        
        try{
            ps=dbConnect.getConnection().prepareStatement(query);
            ps.setString(1, "username");
            rs=ps.executeQuery();
            
            if(rs.next()){
                checkUser=true;
            }
        }catch(Exception e){
            System.out.println("Please check your details and try again!!");
        }
        return checkUser;
    }
    
    
    public static void insertSignupData(Bean bean){
        try{
            String query="INSERT INTO `users`(`name`, `email`,`username`, `password`) VALUES(?,?,?,?)";
            PreparedStatement ps=dbConnect.getConnection().prepareStatement(query);
            ps.setString(1, bean.getFull_name());
            ps.setString(2, bean.getEmail());
            ps.setString(3, bean.getUsername());
            ps.setString(4, bean.getPassword());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "User registered Successfully!!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error"+e);
        }
    }
   
    
    public boolean checkLogin(String username,String pass){
        boolean login=false;
        try{
            String sql="SELECT * FROM `users` WHERE `username`='"+username+"' AND password='"+pass+"'";
//            Sta
//            Statement st=(Statement) dbConnect.getConnection().createStatement();
            Statement st=(Statement) dbConnect.getConnection().createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.next()){
                login=true;
            }
            else{
                 JOptionPane.showMessageDialog(null, "Username or password incorrect");
             }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error"+e);
        }
        return login;
    }
    
    public static void saveEmergency(EmergencyBean bean){
        try{
            String query="INSERT INTO `emergency`(`emergency_type`, `description`,`location`) VALUES(?,?,?)";
            PreparedStatement ps=dbConnect.getConnection().prepareStatement(query);
            ps.setString(1, bean.getEmergency_type());
            ps.setString(2, bean.getDescription());
            ps.setString(3, bean.getLocation());
            ps.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Your Emergency has been and is being processed immediately!!!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error"+e);
        }
    }
    
    public List<EmergencyBean>displayEmergency(){
        List<EmergencyBean>list=new ArrayList<EmergencyBean>();
        try{
            String query="SELECT * FROM `emergency`";
            PreparedStatement ps=dbConnect.getConnection().prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()) {
                int id=rs.getInt("id");
                String emergency_type=rs.getString("emergency_type");
                String description=rs.getString("description");
                String location=rs.getString("location");
                String time=rs.getString("time");
                
                EmergencyBean emergencyBean=new EmergencyBean(emergency_type, description, location,time);
                list.add(emergencyBean);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured"+e);
        }
        return list;
    }
    
}
