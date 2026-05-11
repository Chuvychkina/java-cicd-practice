package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("🚀 CI/CD Pipeline работает!");
        System.out.println("Java приложение успешно собрано!");
    }
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello, Guest!";
        }
        return "Hello, " + name + "!";
    }
}
