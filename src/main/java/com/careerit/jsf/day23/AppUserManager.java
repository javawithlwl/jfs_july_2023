package com.careerit.jsf.day23;

import java.util.List;

public class AppUserManager {

    public static void main(String[] args) {

        AppUserService appUserService = new AppUserService();
        List<String> usernamesList = appUserService.getDisplayNames();
        for (String name : usernamesList) {
            System.out.println(name);
        }
    }
}
