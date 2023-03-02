package ru.itis;

public class RegistrationService {
    public void sendSms(String phone) {
        System.out.println("SMS sent to the number - " + phone);
    }

    public void valid(String phone) {
        if (!phone.contains("+7")) {
            throw new IllegalArgumentException("Incorrect phone number");
        }
    }
}
