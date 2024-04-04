package com.example.doggymap.repos;

import com.example.doggymap.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
