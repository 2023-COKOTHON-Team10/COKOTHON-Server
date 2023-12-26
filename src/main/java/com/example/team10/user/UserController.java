package com.example.team10.user;

import com.example.team10.user.dto.UserCreateRequest;
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
    public String getUniqueNum(@RequestParam Long user_id) {
        return userService.showUniqueNum(user_id);
    }
}
