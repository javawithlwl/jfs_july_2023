package com.careerit;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String username = "dbuser";
        String password = "dbuser";
        String url = "jdbc:postgresql://localhost:5432/ipl_stat_db";

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            con = DriverManager.getConnection(url, username, password);
            st = con.createStatement();
            rs = st.executeQuery("select * from app_user");
            while(rs.next()){
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getString("mobile"));
                System.out.println("-".repeat(100));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            try{
                if(rs != null){
                    rs.close();
                }
                if(st != null){
                    st.close();
                }
                if(con != null){
                    con.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        
    }
}