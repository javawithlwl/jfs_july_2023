package com.careerit.jsf.day23;

import java.util.ArrayList;
import java.util.List;

public class AppUserService {

        private List<AppUser> appUserList;
        public AppUserService(){
            appUserList = getAppUsers();
        }
        // Get usernames and return with proper case
        public List<String> getDisplayNames(){
            List<String> namesList = new ArrayList<>();
            for(AppUser appUser:appUserList){
                String name = appUser.getUsername();
                name = name.substring(0,1).toUpperCase()+""+name.substring(1);
                namesList.add(name);
            }
            return namesList;
        }
        public AppUser login(String username, String password){
            for(AppUser appUser: appUserList){
                if(appUser.getUsername().equals(username) && appUser.getPassword().equals(password)){
                    return appUser;
                }
            }
            throw new IllegalArgumentException("Bad credentials, please check username or password");
        }
        public List<String> getUniqueEmailIds(){
            List<String> emailList = new ArrayList<>();
            for(AppUser appUser:appUserList){
                String email = appUser.getEmail();
                if(!emailList.contains(email)){
                    emailList.add(email);
                }
            }
            return emailList;
        }

        private List<AppUser> getAppUsers(){
            List<AppUser> list = new ArrayList<>();
            AppUser appUser1 = AppUser.builder()
                    .username("krish")
                    .password("krish@123")
                    .email("krish.t@gmail.com")
                    .build();
            AppUser appUser2 = AppUser.builder()
                    .username("manoj")
                    .password("manoj@123")
                    .email("manoj.pvn@gmail.com")
                    .build();
            AppUser appUser3 = AppUser.builder()
                    .username("tanvi")
                    .password("tanvi@123")
                    .email("tanvi.a@gmail.com")
                    .build();
            AppUser appUser4 = AppUser.builder()
                    .username("aadhya")
                    .password("aadhya@123")
                    .email("aadhya.a@gmail.com")
                    .build();

            AppUser appUser5 = AppUser.builder()
                    .username("anish")
                    .password("anish@123")
                    .email("aruna.v@gmail.com")
                    .build();
            AppUser appUser6 = AppUser.builder()
                    .username("aruna")
                    .password("aruna@123")
                    .email("aruna.v@gmail.com")
                    .build();
            AppUser appUser7 = AppUser.builder()
                    .username("nirmala")
                    .password("nirmala@123")
                    .email("aruna.v@gmail.com")
                    .build();
            list.addAll(List.of(appUser1,appUser2,appUser3,appUser4,appUser5,appUser6));
            return list;
        }
}
