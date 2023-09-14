package com.careerit.sjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDao {
    private static final String USER_DATA = "select id,first_name,last_name,email,country from user_data where country=?";
    private static final String USER_COUNT = "select count(*) from user_data";
    private static final String USER_COUNT_BY_COUNTRY = "select count(*) from user_data where country=?";
    private static final String FULL_NAME_BY_ID = "select concat(first_name,concat(' ',last_name)) as full_name  from user_data where id=?";
    private static final String GET_USER_BY_ID = "select id,first_name,last_name,email,country from user_data where id=?";
    private static final String ALL_USERS = "select id,first_name,last_name,email,country from user_data";
    private static final String UPDATE_USER_EMAIL = "update user_data set email = ? where id = ?";
    private static final String ADD_NEW_USER = "insert into user_data(id,first_name,last_name,email,country) values(?,?,?,?,?)";
    private static final String GET_USER_BY_COUNTRY="select id,first_name,last_name,email,country from user_data where country = :country";
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    public List<User> getUsers(String country) {
        return jdbcTemplate.query(USER_DATA, new UserMapper(), country);
    }

    public long getUserCount() {
        return jdbcTemplate.queryForObject(USER_COUNT, Long.class);
    }

    public long getUsersCount(String country) {
        return jdbcTemplate.queryForObject(USER_COUNT_BY_COUNTRY, Long.class, country);
    }

    public String getFullName(long id) {
        return jdbcTemplate.queryForObject(FULL_NAME_BY_ID, String.class, id);
    }

    public User getUserById(long id) {
        return jdbcTemplate.queryForObject(GET_USER_BY_ID, new UserMapper(), id);
    }

    public List<User> getAllUsers() {
        return jdbcTemplate.query(ALL_USERS, new UserMapper());
    }

    public User updateEmail(long id, String email) {
        jdbcTemplate.update(UPDATE_USER_EMAIL, email, id);
        return getUserById(id);
    }

    public User addUser(User user) {
        int count = jdbcTemplate.update(ADD_NEW_USER, user.getId(), user.getFirstName(), user.getFirstName(), user.getEmail(), user.getCountry());
        if (count != 0) {
            System.out.println("New User added");
        }else{
            System.out.println("User is not added, something went wrong...");
        }
        return user;
    }

    public List<User> getUserByCountry(String country){
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource("country",country);
        return namedParameterJdbcTemplate.query(GET_USER_BY_COUNTRY,sqlParameterSource,new UserMapper());
    }
}
