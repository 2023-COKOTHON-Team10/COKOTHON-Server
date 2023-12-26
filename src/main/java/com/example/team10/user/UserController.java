package com.example.team10.user;

import com.example.team10.user.dto.UserCreateRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("/api/user")
    public void saveUser(@RequestBody UserCreateRequest request){
        userService.saveUser(request);
    }
}
