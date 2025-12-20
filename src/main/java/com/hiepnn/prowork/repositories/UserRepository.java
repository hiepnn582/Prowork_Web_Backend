package com.hiepnn.prowork.repositories;

import com.hiepnn.prowork.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
