package com.dwsolutions.projectSPRING1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dwsolutions.projectSPRING1.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
