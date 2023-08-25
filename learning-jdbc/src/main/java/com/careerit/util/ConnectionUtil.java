package com.careerit.util;

import java.sql.*;
import java.util.Properties;

public final class ConnectionUtil {

    private static Properties properties = new Properties();

    static {
        try {
            properties.load(ConnectionUtil.class.getResourceAsStream("/application.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private ConnectionUtil() {

    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    properties.getProperty("db.url"),
                    properties.getProperty("db.username"),
                    properties.getProperty("db.password"));
        } catch (SQLException e) {
            System.out.println("While connecting with db:"+e.getMessage());
            throw new RuntimeException(e);

        }
    }
    public static void close(Statement st , Connection con){
        close(null,st,con);
    }
    public static void close(ResultSet rs,Statement st , Connection con){
        try{
            if(rs !=null){
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
