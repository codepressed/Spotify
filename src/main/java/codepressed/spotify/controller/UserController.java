package codepressed.spotify.controller;

import codepressed.spotify.model.User;
import codepressed.spotify.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userService.findAll();
    }

    @PostMapping("/add")
    public User createUser(@RequestBody User user){
        return userService.save(user);
    }
}
