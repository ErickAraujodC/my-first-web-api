package dio.myfirstwebapi.controller;

import dio.myfirstwebapi.repository.UserRepository;
import dio.myfirstwebapi.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping()
    public List<User> getUsers(){
        return repository.findAll();
    }

    @GetMapping("/{userName}")
    public User getOne(@PathVariable("userName") String userName){
        return repository.findByUserName(userName);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
    @PostMapping()
    public void postUser(@RequestBody User user){
        repository.save(user);
    }
}


