package controller;

import dto.UserRegisterDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserRegisterDto userRegisterDto){
         userService.register();
         return new ResponseEntity<>("User registered successfully..", HttpStatus.CREATED)
    }


}
