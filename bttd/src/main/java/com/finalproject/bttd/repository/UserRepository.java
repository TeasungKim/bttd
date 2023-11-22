package com.finalproject.bttd.repository;

import com.finalproject.bttd.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface UserRepository extends CrudRepository<User, String> {
    @Override
    ArrayList<User> findAll();

}
