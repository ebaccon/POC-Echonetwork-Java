package com.echo.echonetwork.service;

import com.echo.echonetwork.bo.User;
import com.echo.echonetwork.repository.UserRespository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRespository userRespository;

    public List<User> findAll() {
        return (List<User>) userRespository.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userRespository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException("findById of User not found with id: " + id));
    }

    @Override
    public User create(User user) {
        return userRespository.save(user);
    }

    @Override
    public User update(User user) {
        if (user != null && user.getId() != null && StringUtils.hasLength(user.getEmail())) {
            return userRespository.save(user);
        } else {
            throw new IllegalArgumentException("Id or Email is required");
        }
    }

    @Override
    public void deleteById(Integer id) {
        userRespository.deleteById(id);
    }
}
