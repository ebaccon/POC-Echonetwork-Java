package com.echo.echonetwork.repository;

import com.echo.echonetwork.bo.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRespository extends CrudRepository<User, Integer> {
}
