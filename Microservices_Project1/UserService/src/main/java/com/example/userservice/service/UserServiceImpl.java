package com.example.userservice.service;

import com.example.userservice.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl  implements UserService {

  List<User> list = List.of(new User(1311L,"baba","55545615451"),
    new User(1312L,"hgshdsh" , "5454695464"));
    @Override
    public User getUser(Long id) {


        return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
    }
}
