package ru.itis;

public class AuthenticationService {
    public void signUp(String email, String password) {
        valid(email);
        System.out.println(email + "  " + password);
    }

    private void valid(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Incorrect email");
        }
    }
}
