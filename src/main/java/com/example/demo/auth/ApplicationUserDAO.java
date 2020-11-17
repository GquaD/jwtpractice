package com.example.demo.auth;

import java.util.Optional;

/**
 * Created by Behzod Workstation on 16, November, 2020.
 */
public interface ApplicationUserDAO {
    Optional<ApplicationUser> selectApplicationUserByUsername(String username);
}
