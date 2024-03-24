package com.example.frontend;

public class AuthService {
    public boolean login(String username, String password) {
        return username.equals("admin") && password.equals("admin");
    }
}
