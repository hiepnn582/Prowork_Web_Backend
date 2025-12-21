package com.hiepnn.prowork.repositories;

import com.hiepnn.prowork.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    Boolean existsByUsername(String username);
}
