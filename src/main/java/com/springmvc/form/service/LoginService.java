package com.springmvc.form.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String userid, String password) {
        // in28minutes, dummy
        return userid.equalsIgnoreCase("Gadibia")
                && password.equalsIgnoreCase("dummy");
    }

}
