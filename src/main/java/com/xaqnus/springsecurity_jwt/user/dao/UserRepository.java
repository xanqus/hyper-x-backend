package com.xaqnus.springsecurity_jwt.user.dao;

import com.xaqnus.springsecurity_jwt.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
