/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapcosodulieu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manh
 */

public class ConnectDatabase {
    
    private static Connection connection;
    public static void connect(){
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String url = "jdbc:postgresql://localhost:5432/kotoba";
        try {
            connection = DriverManager.getConnection(url, "postgres", "laivanhai");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(connection == null)System.out.println("Kết nối không thành công");
        else System.out.println("Kết nối thành công.");
            
    }
    public ResultSet getIdSheet(String sheetname, String username){
            ResultSet rs = null;
            String sqlCommand = "select idsheet from "
                    + "connect natural join account natural join sheetname where sheetname = '" + sheetname + "' and name = '" + username +"'" ;
            Statement st;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(sqlCommand);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public void deleteTu(String tu, int idBo){
        String sqlCommand = "delete from vocab where idsheet = ? and jp = ?";
        PreparedStatement pst = null;
        try {
            pst = connection.prepareStatement(sqlCommand);
            pst.setInt(1, idBo);
            pst.setString(2, tu);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deleteSheet(int idsheet) {
        String sqlCommand = "delete from sheetname where idsheet = ?";
        PreparedStatement pst = null;
        try {
            pst = connection.prepareStatement(sqlCommand);
            pst.setInt(1,idsheet);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public ResultSet getTu(int idBo){
        ResultSet rs = null;
        String sqlCommand = "select * from vocab where idsheet = " + idBo;
        Statement st = null;
        try {
            st= connection.createStatement();
            rs = st.executeQuery(sqlCommand);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return rs;
    }
    public ResultSet getName(){
        String table = "account";
        ResultSet rs = null;
        String sqlCommand = "select * from " + table;
        Statement st ;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(sqlCommand);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    public ResultSet getData(String tableName){
        String table = tableName;
        ResultSet rs = null;
        String sqlCommand = "select * from " + table;
        Statement st ;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(sqlCommand);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    public ResultSet getDataByUser(String tableName,String username){
        String table = tableName;
        ResultSet rs = null;
        String sqlCommand = "select * from sheetname natural join connect natural join account where name like '" + username + "%'" ;
        Statement st ;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(sqlCommand);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
     public ResultSet getSheetByUser(String username){
        ResultSet rs = null;
        String sqlCommand = "select sheetname from sheetname natural join connect natural join account where name = '" + username + "'"   ;
        Statement st ;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(sqlCommand);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    public ResultSet demSoTu(int idsh){
        ResultSet rs = null;
        String sqlCommand = "select count from (select count(idsheet),idsheet from vocab group by idsheet)b where b.idsheet = " + idsh;
        Statement st;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(sqlCommand);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    public void insertName(int so,String name, String password){
        String sqlCommand = "insert into account " + "values(?,?,?)" ;
        PreparedStatement pst = null;
        try {
            pst = connection.prepareStatement(sqlCommand);
            pst.setInt(1,so);
            pst.setString(2, name);
            pst.setString(3, password);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    public void insertSheetName(int idsheet, String sheetName){
        String sqlCommand = "insert into sheetname " + "values(?,?)" ;
        PreparedStatement pst = null;
        try {
            pst = connection.prepareStatement(sqlCommand);
            pst.setInt(1, idsheet);
            pst.setString(2, sheetName);
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insertConnect(int iduser, int idsheet){
        String sqlCommand = "insert into connect " + "values(?,?)" ;
        PreparedStatement pst = null;
        try {
            pst = connection.prepareStatement(sqlCommand);
            pst.setInt(1, iduser);
            pst.setInt(2, idsheet);
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void insertVocab(int idv, String tu, String nghia, int idsheet){
        String sqlCommand = "insert into vocab " + "values(?,?,?,?)";
        PreparedStatement pst = null;
        try {
            pst = connection.prepareStatement(sqlCommand);
            pst.setInt(1, idv);
            pst.setString(2, tu);
            pst.setString(3, nghia);
            pst.setInt(4, idsheet);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showName(ResultSet rs) {
        try {
            while(rs.next()) {
                System.out.println(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateTu(int id, String tu, String nghia){
        String sqlCommand = "update vocab set jp = ?, vn = ? where stt = ?" ;
        PreparedStatement pst = null;
        try {
            pst = connection.prepareStatement(sqlCommand);
            pst.setString(1,tu);
            pst.setString(2,nghia);
            pst.setInt(3, id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        ConnectDatabase cndb = new ConnectDatabase();
        cndb.connect();
        cndb.deleteSheet(9);
        cndb.deleteTu("dg", 27);
        cndb.updateTu(30, "c", "e");
//        ResultSet rs = cndb.getTu(22);
//        try {
//            while(rs.next()){
//                System.out.println(rs.getString(1));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
