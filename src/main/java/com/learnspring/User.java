package com.learnspring;

public class User {
    private int userId;
    private String username;
    private String email;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        System.out.println("Setting Id...");
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(int userId, String username, String email) {
        System.out.println("Contructor, setting User...");
        this.userId = userId;
        this.username = username;
        this.email = email;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
