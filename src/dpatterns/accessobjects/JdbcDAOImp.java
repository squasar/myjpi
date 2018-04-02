/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.accessobjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Suleyman
 */
public class JdbcDAOImp implements DAO {
    
    private String url = "jdbc:msql://localhost:4333/"+"test_db";
    
    public Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,"test","test");
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return con;
    }

    @Override
    public List<TestData> getTestDataList() {
        Connection con=null;
        ArrayList<TestData> list=new ArrayList<TestData>();
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try{
            con=getConnection();
            pstmt=con.prepareStatement("select test1, test2, id"+" from test_db");
            rs=pstmt.executeQuery();
            while(rs.next()){
                TestData data=new TestData();
                data.setTest1(rs.getString(1));
                data.setTest2(rs.getString(2));
                data.setId(rs.getInt(3));
                list.add(data);
            }
            rs.close();
            pstmt.close();
        }catch(Exception e){
            throw new RuntimeException(e);
        }finally{
            if(con != null){
                try{
                    con.close();
                }catch(SQLException e){
                    throw new RuntimeException(e);
                }
            }
        }
        return list;
    }

    @Override
    public TestData getTestData(int id) {
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        TestData data=null;
        try{
            con=getConnection();
            pstmt=con.prepareStatement("select test1, test2, id"+" from test_db where id=?");
            pstmt.setInt(1, id);
            rs=pstmt.executeQuery();
            data=new TestData();
            if(rs.next()){
                data.setTest1(rs.getString(1));
                data.setTest2(rs.getString(2));
                data.setId(rs.getInt(3));
            }
            rs.close();
            pstmt.close();
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            if(con != null){
                try{
                    con.close();
                }catch(SQLException e){
                    throw new RuntimeException(e);
                }
            }
        }
        return data;
    }    
}