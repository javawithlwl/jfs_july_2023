package com.careerit.jsf.day25;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
@Setter
class AppUser{
    private String username;
    private String password;
    private String email;
}
class LoginService{

    private List<AppUser> appUsers;
    private Map<String,AppUser> map;
    @SneakyThrows
    public LoginService(){
        ObjectMapper objectMapper = new ObjectMapper();
        appUsers = objectMapper.readValue(LoginService.class.getResourceAsStream("/users.json"), new TypeReference<List<AppUser>>(){});
        map = appUsers.stream().collect(Collectors.toMap(AppUser::getUsername, Function.identity()));
    }
    public AppUser login(String username,String password){
        if(map.get(username)!=null){
            AppUser appUser = map.get(username);
            if(appUser.getUsername().equals(username) && appUser.getPassword().equals(password)){
                return appUser;
            }
        }
        throw new IllegalArgumentException("Bad credentials, please check username or password");
    }
}

public class LoginUserServiceApp {

    public static void main(String[] args) {
            LoginService loginService = new LoginService();
            AppUser appUser = loginService.login("abdcdf","krish@123");
            System.out.println("Hello "+appUser.getUsername()+", Welcome java map world");

    }
}
