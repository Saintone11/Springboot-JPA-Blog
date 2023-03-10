package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cos.blog.model.User;

@Repository // 생략가능
public interface UserRepository extends JpaRepository<User, Integer> {

}
