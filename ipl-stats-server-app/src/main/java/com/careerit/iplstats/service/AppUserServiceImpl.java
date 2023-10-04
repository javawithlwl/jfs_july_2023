package com.careerit.iplstats.service;

import com.careerit.iplstats.domain.AppUser;
import com.careerit.iplstats.repo.AppUserRepo;
import com.careerit.iplstats.service.exception.UserAlreadyExistsException;
import com.careerit.iplstats.service.exception.UserNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class AppUserServiceImpl implements  AppUserService{

    @Autowired
    private AppUserRepo appUserRepo;

    @Override
    public List<AppUser> getUsers() {
        List<AppUser> appUsers = appUserRepo.findAll();
        log.info("Total number of users found : {}",appUsers.size());
        return appUsers;
    }

    @Override
    public AppUser registerUser(AppUser appUser) {
        Assert.notNull(appUser,"User object can't be null");
        Assert.hasText(appUser.getUsername(),"Username can't be empty or null");
        Assert.hasText(appUser.getEmail(),"Email can't be empty or null");
        Assert.hasText(appUser.getPassword(),"Password can't be empty or null");
        if(isUserExists(appUser.getUsername(),appUser.getEmail(),appUser.getId())){
            throw new UserAlreadyExistsException("User already exists with username : " + appUser.getUsername() + " or email : " + appUser.getEmail());
        }
        AppUser regUser = appUserRepo.save(appUser);
        log.info("User with username : {} is registered with id {} successfully",regUser.getUsername(),regUser.getId());
        return regUser;
    }

    @Override
    public boolean deleteUser(UUID id) {
        Assert.notNull(id,"Id can't be null");
        if(!appUserRepo.existsById(id)){
            throw new UserNotFoundException("User with id : " + id + " is not found");
        }
        appUserRepo.deleteById(id);
        log.info("User with id : {} is deleted successfully",id);
        return true;
    }

    @Override
    public AppUser updateUser(AppUser appUser) {
        Assert.notNull(appUser,"User object can't be null");
        Assert.hasText(appUser.getUsername(),"Username can't be empty or null");
        Assert.hasText(appUser.getEmail(),"Email can't be empty or null");
        Assert.hasText(appUser.getPassword(),"Password can't be empty or null");
        if(isUserExists(appUser.getUsername(),appUser.getEmail(),appUser.getId())){
            throw new UserAlreadyExistsException("User already exists with username : " + appUser.getUsername() + " or email : " + appUser.getEmail());
        }
        AppUser updatedUser = appUserRepo.save(appUser);
        log.info("User with username : {} is updated with id {} successfully",updatedUser.getUsername(),updatedUser.getId());
        return updatedUser;
    }

    @Override
    public AppUser getUser(UUID id) {
        Assert.notNull(id,"Id can't be null");
        log.info("User is looking for details of the id : {}",id);
        return appUserRepo.findById(id).orElseThrow(()->new UserNotFoundException("User with id : " + id + " is not found"));
    }
    private boolean isUserExists(String username,String email,UUID id){
        return appUserRepo.isUserExists(username,email,id);
    }
}
