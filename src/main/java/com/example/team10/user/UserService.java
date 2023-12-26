package com.example.team10.user;

import com.example.team10.user.domain.User;
import com.example.team10.user.dto.UserCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.aventrix.jnanoid.jnanoid.NanoIdUtils;

import java.util.Optional;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final Random random = new Random();
    private final char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    @Transactional
    public Long saveUser(UserCreateRequest request){
        User user = User.builder()
                .name(request.getName())
                .uniqueNumber(newNanoID())
                .build();
        userRepository.save(user);
        return user.getId();
    }

    public String newNanoID() {return NanoIdUtils.randomNanoId(random, numbers, 6);}

    @Transactional
    public String showUniqueNum(Long userId){
        Optional<User> user = userRepository.findById(userId);
        return user.get().getUniqueNumber();
    }

}
