package com.example.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Luke Hardman on 20/01/17.
 */
public interface UserRepository extends JpaRepository<User, Long>  {
}
