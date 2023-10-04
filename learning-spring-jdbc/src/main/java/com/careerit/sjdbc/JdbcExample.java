package com.careerit.sjdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcExample {

    private static final String USER_DATA="select id,first_name,last_name,email,country from user_data where country=?";
    public static void main(String[] args) {
        String country = "US";
        List<User> userList = loadUsers(country);
        System.out.println("Total "+userList.size()+" users found for the given country "+country);
    }

    private static List<User> loadUsers(String country){
        String url="jdbc:postgresql://localhost:5432/lwl_db";
        String username = "dbuser";
        String password = "dbuser";
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<User> userList = new ArrayList<>();
        try{
            con = DriverManager.getConnection(url,username,password);
            pst = con.prepareStatement(USER_DATA);
            pst.setString(1,country);
            rs = pst.executeQuery();
            while(rs.next()){
                long id = rs.getLong("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String email = rs.getString("email");
                String countryName = rs.getString("country");
                User user = User.builder()
                        .country(countryName)
                        .id(id)
                        .firstName(firstName)
                        .lastName(lastName)
                        .email(email)
                        .build();
                userList.add(user);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try{
                if(rs!=null){
                    rs.close();
                }
                if(pst!=null){
                    pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return userList;
    }

}
