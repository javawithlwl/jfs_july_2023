package com.careerit.sjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@ComponentScan(basePackages = {"com.careerit.sjdbc"})
public class JdbcSpringExample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcSpringExample.class);
        UserDao userDao = context.getBean(UserDao.class);
        List<User> res = userDao.getUsers("US");
        System.out.println(res.size());
        System.out.println(userDao.getUserCount());
        System.out.println(userDao.getUsersCount("US"));
        System.out.println(userDao.getFullName(420));
        System.out.println(userDao.getUserById(210));
        System.out.println(userDao.getAllUsers().size());
        System.out.println(userDao.updateEmail(1,"superman@gmail.com"));
//        User user = new User();
//        user.setId(1001);
//        user.setFirstName("Manoj");
//        user.setLastName("PVN");
//        user.setEmail("manoj.pvn@gmail.com");
//        user.setCountry("IN");
//        userDao.addUser(user);
         System.out.println(userDao.getUserByCountry("US"));
    }
}
