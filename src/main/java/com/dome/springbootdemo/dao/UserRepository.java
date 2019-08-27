package com.dome.springbootdemo.dao;

import com.dome.springbootdemo.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);

    User findByNameAndAge(String name,Integer age);
}