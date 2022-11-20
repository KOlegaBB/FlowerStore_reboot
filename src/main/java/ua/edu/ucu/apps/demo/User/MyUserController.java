package ua.edu.ucu.apps.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class MyUserController {
    private final MyUserService userService;

    @Autowired
    public MyUserController(MyUserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<MyUser> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public void addUser(MyUser user){
        userService.addUser(user);
    }

}
