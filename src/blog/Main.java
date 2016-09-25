/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author haiyka
 */
public class Main {
        private static Connection connection;
        Statement statement;
        

    public static void connect(){
        try {
            Properties p = new Properties();
            String url;
            String user;
            String password;
            String link_Pro = "C:\\Users\\haiyka\\Documents\\NetBeansProjects\\DatabaseDemo\\src\\blog\\database.properties";
            try {
                p.load(new FileInputStream(link_Pro));
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            url = p.getProperty("url");
            user = p.getProperty("user");
            password = p.getProperty("password");
            
            Class.forName("org.postgresql.Driver");
            try {
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
            if(connection == null)System.out.println("Kết nối không thành công");
            else System.out.println("Kết nối thành công.");
            /* 
                JOptionPane.showMessageDialog(null, "Kết nối không thành công", "Thông báo", 1);
            else 
                JOptionPane.showMessageDialog(null, "Kết nối thành công", "Thông báo", 1);
            */
                } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    public void createStatement(){
        if(statement == null){
            try {
                statement = connection.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public ResultSet retrieveData(String sqlCommand){
            try {
                createStatement();
                ResultSet resultSet = statement.executeQuery(sqlCommand);
                return resultSet;
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
    }
    
      public int executeUpdate(){
        int rowNo = 0;
        try {
            String sqlCommand = "insert into account values(?,?,?)";
            int Value=4;
            PreparedStatement ps = connection.prepareStatement(sqlCommand);
            ps.setInt(1, Value);
            ps.setString(2, "haibka");
            ps.setString(3, "laivanhai");
            rowNo = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowNo;
      }
      
   public static int rand(int min, int max) {
        try {
            Random rn = new Random();
            int range = max - min + 1;
            int randomNum = min + rn.nextInt(range);
            return randomNum;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }   
        
   public static void main(String[] args) throws SQLException {
       int dem = 0,snn;
            try {
                Main db = new Main();
                db.connect();
                //System.out.println(db.executeUpdate() + "row");
                String sqlCommand = "Select count(stt) from htmt_n5";
                ResultSet rs = db.retrieveData(sqlCommand);
                while(rs.next())
                {
                    dem = rs.getInt(1);       
                }
                snn = rand(1,dem);              
                String strNumber = String.format( "%d", snn);
                sqlCommand = "Select * from htmt_n5 where stt=" + strNumber;
                rs = db.retrieveData(sqlCommand);
                while(rs.next()){
                    System.out.print(rs.getInt(1)+ "\t");
                    System.out.print(rs.getString(2)+ "\t");
                    System.out.print(rs.getString(3)+ "\t");
                    System.out.println(rs.getString(4));
                }
                
                strNumber = String.format( "%d", rand(1,dem));
                sqlCommand = "Select vn from htmt_n5 where stt=" + strNumber;
                rs = db.retrieveData(sqlCommand);
                while(rs.next()){
                    System.out.print(rs.getString(1)+ "\n");
                }  
                
                strNumber = String.format( "%d", rand(1,dem));
                sqlCommand = "Select vn from htmt_n5 where stt=" + strNumber;
                rs = db.retrieveData(sqlCommand);
                while(rs.next()){
                    System.out.print(rs.getString(1)+ "\n");
                }
                
                strNumber = String.format( "%d", rand(1,dem));
                sqlCommand = "Select vn from htmt_n5 where stt=" + strNumber;
                rs = db.retrieveData(sqlCommand);
                while(rs.next()){
                    System.out.print(rs.getString(1)+ "\n");
                }  
                
            
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                //dem = rs.getInt(1);
                //System.out.println(dem);
                /*while(rs.next()){
                    System.out.print(rs.getInt(1)+ "\t");
                    //System.out.print(rs.getString(2)+ "\t");
                    //System.out.print(rs.getString(3)+ "\t");
                    //System.out.println(rs.getString(4));
                }   } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }*/
    }
}

   