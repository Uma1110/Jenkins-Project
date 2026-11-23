package com.example;

public class App {

    public String getMessage() {
        return "Hello Jenkins! Welcome to my first CI/CD application.";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getMessage());
    }
}
