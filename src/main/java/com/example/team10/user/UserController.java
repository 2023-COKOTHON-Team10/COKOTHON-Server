package com.example.team10.user;

import com.example.team10.user.dto.UserCreateRequest;
import com.example.team10.user.dto.UserGetRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("/api/user")
    public Long saveUser(@RequestBody UserCreateRequest request){
        return userService.saveUser(request);
    }

    @GetMapping("/api/getUniqueNum")
    public String getUniqueNum(@RequestBody UserGetRequest request) {
        return userService.showUniqueNum(request.getUser_id());
    }
}
