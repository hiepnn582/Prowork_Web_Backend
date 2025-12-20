package com.hiepnn.prowork.services;

import com.hiepnn.prowork.dtos.RegistrationRequest;
import com.hiepnn.prowork.exceptions.DuplicateResourceException;
import com.hiepnn.prowork.models.Account;
import com.hiepnn.prowork.models.Role;
import com.hiepnn.prowork.models.User;
import com.hiepnn.prowork.repositories.AccountRepository;
import com.hiepnn.prowork.repositories.RoleRepository;
import com.hiepnn.prowork.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AuthService {
    private final AccountRepository accountRepository;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public Account register(RegistrationRequest request) {
        if (accountRepository.existsByUsername(request.getUsername())) {
            throw new DuplicateResourceException("username", "The username already exists");
        }

        // Get Role
        Role role = roleRepository.findByName("USER");

        // Create user
        User user = new User();
        user.setFirstName(request.getUsername());
        user.setRole(role);
        userRepository.save(user);

        // Create account
        Account account = new Account();
        account.setUsername(request.getUsername());
        account.setPasswordHash(passwordEncoder.encode(request.getPassword()));

        return accountRepository.save(account);
    }
}
