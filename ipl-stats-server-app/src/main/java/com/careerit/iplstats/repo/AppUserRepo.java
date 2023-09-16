package com.careerit.iplstats.repo;

import com.careerit.iplstats.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface AppUserRepo extends JpaRepository<AppUser, UUID> {
        List<AppUser> findByUsername(String username);
        @Query("select u from AppUser u where u.email = :inputStr or u.username = :inputStr")
        //JPQL - Java Persistence Query Language
        List<AppUser> findByEmailOrName(@Param("inputStr") String str);

        @Query("""
                select case when count(u)> 0 then true else false end from AppUser u 
                where u.id != :id and (u.username = :username or u.email = :email)
               """)
        boolean isUserExists(@Param("username") String username, @Param("email") String email,@Param("id") UUID id);
}
