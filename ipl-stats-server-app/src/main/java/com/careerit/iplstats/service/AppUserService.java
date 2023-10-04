package com.careerit.iplstats.service;

import com.careerit.iplstats.domain.AppUser;

import java.util.List;
import java.util.UUID;

public interface AppUserService {

        List<AppUser> getUsers();
        AppUser registerUser(AppUser appUser);
        boolean deleteUser(UUID id);
        AppUser updateUser(AppUser appUser);
        AppUser getUser(UUID id);
}
