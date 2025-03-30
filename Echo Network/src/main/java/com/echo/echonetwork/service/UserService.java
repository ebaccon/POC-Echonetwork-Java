package com.echo.echonetwork.service;

import com.echo.echonetwork.bo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> findAll();
    User findById(Integer id);
    User create(User user);
    User update(User user);
    void deleteById(Integer id);
}
