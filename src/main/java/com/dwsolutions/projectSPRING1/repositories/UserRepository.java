package com.dwsolutions.projectSPRING1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwsolutions.projectSPRING1.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
