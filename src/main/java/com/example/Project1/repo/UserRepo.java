package com.example.Project1.repo;

import com.example.Project1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends JpaRepository<User,Integer> {

}
