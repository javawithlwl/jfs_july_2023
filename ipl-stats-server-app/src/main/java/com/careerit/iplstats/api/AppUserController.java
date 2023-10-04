package com.careerit.iplstats.api;

import com.careerit.iplstats.domain.AppUser;
import com.careerit.iplstats.service.AppUserService;
import com.careerit.iplstats.util.ApiSuccessResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class AppUserController {


        private final AppUserService appUserService;

        @PostMapping("/register")
        public ResponseEntity<AppUser> registerUser(@RequestBody AppUser appUser){
            AppUser regUser = appUserService.registerUser(appUser);
            return ResponseEntity.ok(regUser);
        }
        @GetMapping("/{userId}")
        public ResponseEntity<AppUser> getUser(@PathVariable("userId") UUID id){
            AppUser user = appUserService.getUser(id);
            return ResponseEntity.ok(user);
        }

        @PutMapping
        public ResponseEntity<AppUser> updateUser(@RequestBody AppUser appUser){
            AppUser regUser = appUserService.updateUser(appUser);
            return ResponseEntity.ok(regUser);
        }
        @GetMapping("/all")
        public ResponseEntity<List<AppUser>> getAllUsers(){
            List<AppUser> list = appUserService.getUsers();
            return ResponseEntity.ok(list);
        }
        @DeleteMapping("/{userId}")
        public ResponseEntity<ApiSuccessResponse> deleteUser(@PathVariable("userId") UUID id){
           appUserService.deleteUser(id);
           return ResponseEntity.ok(ApiSuccessResponse.builder().message("User deleted successfully").build());

        }

}
