package com.careerit.jsf.day21;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class UserDto {
    private String userId;
    private String name;
    private String email;
}

public class CollectionExample2 {

    public static void main(String[] args) {
            List<UserDto> list = getUsers();
            List<String> uniqueEmails = new ArrayList<>();

    }

    private static List<UserDto> getUsers() {
        // Create 10 users and return the list
        List<UserDto> list = new ArrayList<>();
        UserDto userDto1 = new UserDto("MT1001", "Krish", "krish.t@gmail.com");
        UserDto userDto2 = new UserDto("MT1002", "Manoj", "manoj.pvn@gmail.com");
        UserDto userDto3 = new UserDto("MT1003", "RK", "rk.r@gmail.com");
        UserDto userDto4 = new UserDto("MT1004", "Manoj", "manoj.pvn@gmail.com");
        UserDto userDto5 = new UserDto("MT1005", "Krish", "krish.t@gmail.com");
        UserDto userDto6 = new UserDto("MT1006", "Manoj", "manoj.pvn@gmail.com");
        UserDto userDto7 = new UserDto("MT1007", "RK", "rk.r@gmail.com");
        list = new ArrayList<>(List.of(userDto1, userDto2, userDto3, userDto4, userDto5, userDto6, userDto7));
        return list;

    }

}
